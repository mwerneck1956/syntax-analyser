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
import com.compiler.util.Util;

public class InterpretVisitor implements Visitor {

   private static final Logger logger = LogManager.getLogger(InterpretVisitor.class);
   private Stack<HashMap<String, Object>> env;
   private HashMap<String, Function> functions;
   private HashMap<String, Data> datas;
   private Stack<Object> operands;
   private Boolean returnMode;

   public InterpretVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, Object>>();
      env.push(new HashMap<String, Object>());
      this.datas = new HashMap<String, Data>();
      this.returnMode = false;

   }

   public void visit(Prog prog) {
      Node main = null;

      for (Function f : prog.getFunctions()) {

         if (f.getName().equals("main"))
            main = f;

         this.functions.put(f.getName(), f);

      }

      for (Data data : prog.getDataList()) {
         this.datas.put(data.getIdName(), data);
      }

      main.accept(this);
   }

   public void visit(Add add) {

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

   }

   public void visit(Sub sub) {
      try {
         sub.getLeft().accept(this);
         sub.getRight().accept(this);

         Number left, right, res;

         right = (Number) operands.pop();
         left = (Number) operands.pop();

         if (left instanceof Float || right instanceof Float)
            res = left.floatValue() - right.floatValue();
         else
            res = left.intValue() - right.intValue();

         operands.push(res);
      } catch (Exception err) {
         throw new RuntimeException(err.getMessage());
      }

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

      if (id instanceof ArrayPositionAccess) {

         ArrayPositionAccess newArray = (ArrayPositionAccess) id;

         newArray.getPositionExpr().accept(this);
         Number index = (Number) operands.pop();

         attr.getExp().accept(this);

         Object value = this.operands.pop();

         Object[] array = (Object[]) this.env.peek().get(id.getId());

         array[index.intValue()] = value;

         this.env.peek().put(id.getId(), array);
      }

      else if (id instanceof AttributeAccess) {

         AttributeAccess access = (AttributeAccess) id;
         LValue leftSideId = access.getLeftValue();

         HashMap<String, Object> var;

         if (leftSideId instanceof ArrayPositionAccess) {
            leftSideId.accept(this);

            var = (HashMap<String, Object>) this.operands.pop();

         } else
            var = (HashMap<String, Object>) this.env.peek().get(leftSideId.getId());

         attr.getExp().accept(this);
         Object val = operands.pop();

         var.put(access.getAcessId().getName(), val);

         env.peek().put(id.getId(), var);

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

      logger.info("Calling function:  " + functionCall.getFunctionName());

      Function func = functions.get(functionCall.getFunctionName());

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

      iterate.getCondition().accept(this);

      Object conditionValue = operands.pop();

      if (conditionValue instanceof Boolean) {
         while ((Boolean) conditionValue) {
            iterate.getBody().accept(this);
            iterate.getCondition().accept(this);
            conditionValue = operands.pop();
         }
      } else if (conditionValue instanceof Integer) {
         Integer iterations = (Integer) conditionValue;
         int i = 0;

         while (i < iterations) {
            iterate.getBody().accept(this);
            i++;
         }

      }

   }

   public boolean checkWhileCondition() {
      Object value = operands.pop();

      if (value instanceof Boolean)
         return (Boolean) value;
      else {
         return ((Number) value).intValue() > 0;
      }
   }

   @Override
   public void visit(LiteralChar literal) {
      this.operands.push(literal.getValue());

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

      System.out.print(operands.pop());
   }

   public void visit(Read read) {
      Scanner scanner = new Scanner(System.in);

      String value = scanner.nextLine();
      scanner.close();

      if (Util.isInteger(value)) {
         this.env.peek().put(read.getLvalue().getId(), Integer.parseInt(value));
      } else {
         throw new CustomRuntimeException("Read value must be int", read);
      }

   }

   public void visit(LessThan lessThan) {

      lessThan.getLeft().accept(this);
      lessThan.getRight().accept(this);

      Number left, right;

      right = (Number) operands.pop();
      left = (Number) operands.pop();

      Boolean res = new Boolean((Integer) left < (Integer) right);

      operands.push(res);

      logger.info("Less than added " + res + " To te stack");

   }

   public void visit(And and) {

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

         HashMap<String, Object> var;

         if (leftSideId instanceof ArrayPositionAccess) {
            leftSideId.accept(this);

            var = (HashMap<String, Object>) operands.pop();

         } else
            var = (HashMap<String, Object>) this.env.peek().get(leftSideId.getId());

         Object idValue = var.get(attributeAccess.getAcessId().getId());
         operands.push(idValue);

      } catch (Exception err) {
         throw new CustomRuntimeException(err.getMessage(), attributeAccess);
      }
   }

   public void visit(NewData data) {
      Data dataObj = datas.get(data.getTypeName());

      HashMap<String, Object> localEnv = new HashMap<String, Object>();

      for (Declaration decl : dataObj.getDeclarations())
         localEnv.put(decl.getIdName(), null);

      operands.push(localEnv);
   }

   public void visit(ArrayPositionAccess arrayPositionAccess) {
      arrayPositionAccess.getPositionExpr().accept(this);
      Number index = (Number) this.operands.pop();

      Object[] value = (Object[]) this.env.peek().get(arrayPositionAccess.getId());

      if (index.intValue() > value.length) {
         throw new CustomRuntimeException("Index out of bonds for var : " + arrayPositionAccess.getLeftValue().getId(),
               arrayPositionAccess);
      } else {
         this.operands.push(value[index.intValue()]);
      }

   }

   public void visit(TypeInt typeInt) {

   }

   public void visit(TypeFloat typeFloat) {

   }

   public void visit(TypeBool typeBool) {

   }

   public void visit(TypeChar typeChar) {

   }

   public void visit(TypeCustom customType) {

   }

   public void visit(TypeArray typeArray) {

   }

   public void visit(FunctionCallArray functionCall) {
      Function func = functions.get(functionCall.getFunctionName());

      int receivedParams = functionCall.getParams().size();

      if (func.isQuantityOfParamsValid(receivedParams)) {
         for (Expr expr : functionCall.getParams())
            expr.accept(this);

         func.accept(this);

         if (returnMode) {

            functionCall.getReturnExpr().accept(this);

            Number returnedIndex = (Number) operands.pop();

            if (returnedIndex.intValue() > func.getReturns().size())
               throw new CustomRuntimeException(
                     "Index : " + returnedIndex.intValue() + " out of bonds for function return : "
                           + functionCall.getFunctionName(),
                     functionCall);

            Object value = null;

            for (int i = 0; i < func.getReturns().size(); i++) {
               if (i == returnedIndex.intValue())
                  value = operands.pop();
               else
                  operands.pop();
            }

            operands.push(value);
            returnMode = false;
         }
      }
   }

   public void visit(NewArray newArray) {

      newArray.getExpr().accept(this);

      Number arraySize = (Number) operands.pop();

      if (newArray.getType() instanceof TypeCustom) {
         HashMap<String, Object>[] objArray = new HashMap[arraySize.intValue()];

         for (int i = 0; i < arraySize.intValue(); i++) {
            objArray[i] = new HashMap<String, Object>();
         }

         operands.push(objArray);
      } else {

         Object[] array = new Object[arraySize.intValue()];
         operands.push(array);
      }

   }

   public void visit(Declaration declaration) {

   }
}
