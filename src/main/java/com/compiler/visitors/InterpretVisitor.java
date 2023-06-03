package com.compiler.visitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.compiler.ast.*;

public class InterpretVisitor implements Visitor {

   private static final Logger logger = LogManager.getLogger(InterpretVisitor.class);
   private Stack<HashMap<String, Object>> env;
   private HashMap<String, Function> functions;
   private Stack<Object> operands;
   private Boolean returnMode;

   public InterpretVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, Object>>();
      env.push(new HashMap<String, Object>());
      this.returnMode = false;

   }

   public void visit(Prog prog) {
      Node main = null;

      this.functions = prog.getFunctions();

      for (Function f : this.functions.values()) {

         if (f.getName().equals("main"))
            main = f;
      }

      if (main == null)
         throw new RuntimeException("The program doesnt have a main function");

      main.accept(this);
   }

   public void visit(Add add) {
      try {

         logger.info("Visiting add with " + add.toString());

         add.getLeft().accept(this);
         add.getRight().accept(this);

         Number left, right, res;

         right = (Number) operands.pop();
         left = (Number) operands.pop();

         if (left instanceof Float || right instanceof Float)
            res = left.floatValue() + right.floatValue();
         else
            res = left.intValue() + right.intValue();

         operands.push(res);
         logger.info("Add finished storing " + res + " to the operands");
      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

   }

   public void visit(Sub sub) {
      try {
         sub.getLeft().accept(this);
         sub.getRight().accept(this);

         Number left, right, res;

         left = (Number) operands.pop();
         right = (Number) operands.pop();

         if (left instanceof Float || right instanceof Float)
            res = left.floatValue() - right.floatValue();
         else
            res = left.intValue() - right.intValue();

         operands.push(res);
      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

   }

   public void visit(Mult mult) {
      try {
         logger.info("Visiting mult");

         mult.getLeft().accept(this);
         mult.getRight().accept(this);

         Number left, right, res;

         left = (Number) operands.pop();
         right = (Number) operands.pop();

         if (left instanceof Float || right instanceof Float)
            res = left.floatValue() * right.floatValue();
         else
            res = left.intValue() * right.intValue();

         operands.push(res);
      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

   }

   public void visit(Div div) {
      try {
         div.getLeft().accept(this);
         div.getRight().accept(this);

         Number left, right, res;

         left = (Number) operands.pop();
         right = (Number) operands.pop();

         if (left instanceof Float || right instanceof Float)
            res = left.floatValue() / right.floatValue();
         else
            res = left.intValue() / right.intValue();

         operands.push(res);
      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

   }

   public void visit(Data data) {

   }

   public void visit(Attribution attr) {
      LValue id = attr.getID();

      attr.getExp().accept(this);
      Object val = operands.pop();

      env.peek().put(id.getId(), val);

      logger.info("New attribution " + id.getId() + " = " + val);
   }

   public void visit(BasicType bType) {

   }

   public void visit(BinOP binOp) {

   }

   @Override
   public void visit(CmdList cmdList) {

      for (Cmd c : cmdList.getBody()) {
         if (returnMode)
            break;

         c.accept(this);
      }
   }

   @Override
   public void visit(Function function) {
      boolean isMainFunction = function.getName().equals("main");

      if (isMainFunction) {
         logger.info("Executing main function");
         function.getBody().accept(this);
      } else {
         logger.info("Executing " + function.getName() + " function");

         HashMap<String, Object> localEnv = new HashMap<String, Object>();
         this.env.push(localEnv);

         ArrayList<Param> functionParams = function.getParamlist();

         if (functionParams.size() > 0) {

            // Collections.reverse(functionParams);

            for (int i = functionParams.size() - 1; i >= 0; i--) {
               Param p = functionParams.get(i);

               p.accept(this);
            }

            logger.info("Params in the stack : " + this.env.peek().toString());
         }

         function.getBody().accept(this);
         this.env.pop();
      }

   }

   public void visit(FunctionCall functionCall) {
      try {

         logger.info("Trying to call function " + functionCall.getFunctionName());

         Function func = functions.get(functionCall.getFunctionName());

         if (func != null) {
            int receivedParams = functionCall.getParams().size();

            if (func.isQuantityOfParamsValid(receivedParams)) {
               for (Expr expr : functionCall.getParams())
                  expr.accept(this);

               func.accept(this);

               if (functionCall.getReturnsId().size() > 0 && returnMode) {
                  // Tenho que colocar no env esse id com o valor novo;

                  for (LValue returnId : functionCall.getReturnsId()) {
                     String returnVariableName = returnId.getId();

                     Object value = operands.pop();
                     this.env.peek().put(returnVariableName, value);

                     logger.info("Putting return variable " + returnVariableName + " with value : " + value);
                  }

                  returnMode = false;
               }
            }

            else
               throw new CustomRuntimeException("Function " + functionCall.getFunctionName() + " expected "
                     + func.getParamlist().size() + " params", functionCall);

         } else {
            String errMessage = "Function: " + functionCall.getFunctionName() + " Not declared";
            throw new CustomRuntimeException(errMessage, functionCall);
         }

      } catch (Exception err) {

      }
   }

   @Override
   public void visit(ID id) {
      try {
         logger.info("Visiting id : \"" + id.getName() + "\"");

         if (env.peek().containsKey(id.getName())) {
            Object idValue = env.peek().get(id.getName());
            operands.push(idValue);

            logger.info("Adding value " + idValue + " to the operands");
         } else
            throw new RuntimeException("Variable " + id.getName() + " Not declared");

      } catch (Exception e) {
         throw new RuntimeException(e.getMessage());
      }

   }

   @Override
   public void visit(If ifExpr) {
      logger.info("Visiting if");

      ifExpr.getCondition().accept(this);

      if ((Boolean) operands.pop()) {
         logger.info("If condition accepted");
      }
   }

   @Override
   public void visit(Iterate iterate) {
      try {

         iterate.getCondition().accept(this);

         while ((Boolean) operands.pop()) {
            iterate.getBody().accept(this);
            iterate.getCondition().accept(this);
         }

      } catch (Exception err) {
         throw new CustomRuntimeException(err.getMessage(), iterate);
      }

   }

   @Override
   public void visit(LiteralChar literal) {
      this.operands.push(new String(literal.getValue()));

   }

   @Override
   public void visit(LiteralFalse literal) {
      this.operands.push(new Boolean(false));
   }

   public void visit(LiteralFloat literal) {
      this.operands.push(new Float(literal.getValue()));
   }

   public void visit(LiteralInt literal) {
      this.operands.push(new Integer(literal.getValue()));

   }

   public void visit(LiteralNull literal) {
      this.operands.push(null);
   }

   public void visit(LiteralTrue literal) {
      this.operands.push(new Boolean(true));

   }

   public void visit(Print print) {
      print.getExpr().accept(this);

      logger.info("Visiting print");

      System.out.println(operands.pop());
   }

   public void visit(Read read) {

   }

   public void visit(StmtList stmtList) {

   }

   public void visit(LessThan lessThan) {
      try {
         lessThan.getLeft().accept(this);
         lessThan.getRight().accept(this);

         Number left, right;

         right = (Number) operands.pop();
         left = (Number) operands.pop();

         Boolean res = new Boolean((Integer) left < (Integer) right);

         operands.push(res);

         logger.info("Less than added " + res + " To te stack");
      } catch (Exception err) {

      }

   }

   public void visit(GreatherThan greatherThan) {

      greatherThan.getLeft().accept(this);
      greatherThan.getRight().accept(this);

      Number left, right;

      right = (Number) operands.pop();
      left = (Number) operands.pop();

      Boolean res = new Boolean((Integer) left > (Integer) right);

      operands.push(res);

      logger.info("Bigger than added " + res + " To te stack");
   }

   public void visit(Param param) {
      Object paramValue = operands.pop();

      env.peek().put(param.getId().getId(), paramValue);
   }

   public void visit(Return ret) {
      logger.info("Visiting a return");

      returnMode = true;

      for (int i = ret.getReturnedExprs().size() - 1; i >= 0; i--) {
         Expr e = ret.getReturnedExprs().get(i);

         e.accept(this);
      }
   }

   public void visit(Not not) {
      logger.info("Not visited" + not.toString());

   }
}
