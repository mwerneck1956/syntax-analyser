/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.visitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.compiler.ast.*;
import com.compiler.typeCheckUtils.*;
import com.compiler.util.Util;

public class TypeCheckVisitor implements Visitor {

   private static final Logger logger = LogManager.getLogger(InterpretVisitor.class);
   private STyFloat tyfloat = STyFloat.newSTyFloat();
   private STyBool tybool = STyBool.newSTyBool();
   private STyErr tyerr = STyErr.newSTyErr();

   private ArrayList<String> errors;
   private Stack<HashMap<String, Object>> env;
   private HashMap<String, Function> functions;
   private HashMap<String, Data> datas;

   private Stack<SType> typeStack;
   private Stack<Object> operands;

   private Boolean returnMode;

   public TypeCheckVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, Object>>();
      env.push(new HashMap<String, Object>());
      this.datas = new HashMap<String, Data>();
      this.returnMode = false;
   }

   public ArrayList<String> getErrors() {
      return errors;
   }

   public void AddErrorMessage(Node node, String message) {
      CustomRuntimeException error = new CustomRuntimeException(message, node);
      this.errors.add(error.getMessage());
   }

   public void printErrors() {
      for (String error : errors) {
         System.out.println(error);
      }
   }

   public void visit(Prog prog) {
      Node main = null;

      this.functions = prog.getFunctions();
      this.datas = prog.getDataList();

      for (Function f : this.functions.values()) {

         if (f.getName().equals("main"))
            main = f;
      }

      if (main == null)
         this.AddErrorMessage(main, "The program doesnt have a main function");

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
         throw new CustomRuntimeException(err.getMessage(), add);
      }

   }

   public void visit(Sub sub) {

      sub.getLeft().accept(this);
      sub.getRight().accept(this);

      Number left, right, res;

      this.checkBinOpTypes(sub, '-');

      // left = (Number) operands.pop();
      // right = (Number) operands.pop();

      // if (left instanceof Float || right instanceof Float)
      // res = left.floatValue() - right.floatValue();
      // else
      // res = left.intValue() - right.intValue();

      // operands.push(res);

   }

   private boolean checkBinOpTypes(BinOP operation, char c) {
      return false;
   }

   public void visit(Mod mod) {
      try {
         mod.getLeft().accept(this);
         mod.getRight().accept(this);

         Number left, right, res;

         right = (Number) operands.pop();
         left = (Number) operands.pop();

         res = left.intValue() % right.intValue();

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

   public void visit(Equal equal) {
      try {

         equal.getLeft().accept(this);
         equal.getRight().accept(this);

         Object left, right;

         right = operands.pop();
         left = operands.pop();

         operands.push(left.equals(right));

         logger.info("Testing if " + right.toString() + " == " + left.toString());

      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

   }

   public void visit(Diff diff) {
      try {

         diff.getLeft().accept(this);
         diff.getRight().accept(this);

         Object left, right;

         right = operands.pop();
         left = operands.pop();

         operands.push(!left.equals(right));

      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

   }

   public void visit(Data data) {

   }

   public void visit(Attribution attr) {
      LValue id = attr.getID();

      if (id instanceof AttributeAccess) {

         AttributeAccess access = (AttributeAccess) id;

         LValue leftSideId = access.getLeftValue();

         if (this.env.peek().containsKey(leftSideId.getId())) {

            HashMap<String, Object> var = (HashMap<String, Object>) this.env.peek().get(leftSideId.getId());

            attr.getExp().accept(this);
            Object val = operands.pop();

            var.put(access.getAcessId().getName(), val);
            env.peek().put(id.getId(), val);

         } else {
            throw new CustomRuntimeException("Var " + leftSideId.getId() + " not  declared", leftSideId);
         }

      } else {
         attr.getExp().accept(this);
         Object val = operands.pop();

         env.peek().put(id.getId(), val);

         logger.info("New attribution " + id.getId() + " = " + val);
      }

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

         logger.info("Calling function:  " + functionCall.getFunctionName());

         Function func = functions.get(functionCall.getFunctionName());

         if (func != null) {
            int receivedParams = functionCall.getParams().size();

            if (func.isQuantityOfParamsValid(receivedParams)) {
               for (Expr expr : functionCall.getParams())
                  expr.accept(this);

               func.accept(this);

               if (functionCall.getReturnsId().size() > 0 && returnMode) {

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
         ifExpr.getThen().accept(this);

      } else if (ifExpr.getOnElse() != null) {
         ifExpr.getOnElse().accept(this);

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
      Scanner scanner = new Scanner(System.in);

      String value = scanner.nextLine();
      scanner.close();

      if (Util.isInteger(value)) {
         this.env.peek().put(read.getLvalue().getId(), Integer.parseInt(value));
      } else if (Util.isDouble(value)) {
         this.env.peek().put(read.getLvalue().getId(), Double.parseDouble(value));
      } else {
         this.env.peek().put(read.getLvalue().getId(), value);
      }

      // Attribution attr = new Attribution(read.getLine(), read.getCol(),
      // read.getLvalue());

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

   public void visit(And and) {
      try {
         and.getLeft().accept(this);
         and.getRight().accept(this);

         Object left, right;

         right = operands.pop();
         left = operands.pop();

         if (right instanceof Number) {
            right = new Integer(right.toString()) != 0;
         }

         if (left instanceof Number) {
            left = new Integer(left.toString()) != 0;
         }

         operands.push(new Boolean((Boolean) left && (Boolean) right));

      } catch (Exception err) {
         throw new CustomRuntimeException(err.getMessage(), and);
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

   public void visit(ParenthesisExpression parenthesisExpression) {
      logger.info("Visiting expr " + parenthesisExpression.toString());

      parenthesisExpression.getExpr().accept(this);
   }

   public void visit(Not not) {
      not.getExpression().accept(this);

      Object expr = operands.pop();

      if (expr instanceof Number) {
         expr = new Integer(expr.toString()) != 0;
      }

      operands.push(new Boolean(!(Boolean) expr));
   }

   public void visit(AttributeAccess attributeAccess) {
      try {
         LValue leftSideId = attributeAccess.getLeftValue();

         if (this.env.peek().containsKey(leftSideId.getId())) {
            HashMap<String, Object> var = (HashMap<String, Object>) this.env.peek().get(leftSideId.getId());

            Object idValue = var.get(attributeAccess.getAcessId().getId());
            operands.push(idValue);

         } else {
            throw new CustomRuntimeException("Var " + leftSideId.getId() + " not  declared", leftSideId);
         }

      } catch (Exception err) {
         throw new CustomRuntimeException(err.getMessage(), attributeAccess);
      }
   }

   public void visit(NewData data) {
      try {

         Data dataObj = datas.get(data.getTypeName());

         if (dataObj == null)
            throw new CustomRuntimeException("Data : " + data.getTypeName() + " is not declared", data);

         HashMap<String, Object> localEnv = new HashMap<String, Object>();

         for (Declaration decl : dataObj.getDeclarations())
            localEnv.put(decl.getIdName(), null);

         operands.push(localEnv);

      } catch (Exception err) {
         throw new CustomRuntimeException(err.getMessage(), data);
      }
   }

   public void visit(ArrayPositionAccess arrayPositionAccess) {

   }

   public void visit(TypeInt typeInt) {

   }

   public void visit(TypeFloat typeFloat) {

   }

   public void visit(TypeBool typeBool) {

   }
}