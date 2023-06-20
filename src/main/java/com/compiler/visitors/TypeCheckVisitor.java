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
import com.compiler.util.TypeCheckUtils;
import com.compiler.util.Util;

public class TypeCheckVisitor implements Visitor {

   private static final Logger logger = LogManager.getLogger(InterpretVisitor.class);
   private STyFloat typeFloat = STyFloat.newSTyFloat();
   private STyBool typeBool = STyBool.newSTyBool();
   private STyErr typeErr = STyErr.newSTyErr();
   private STyInt typeInt = STyInt.newSTyInt();
   private STyChar typeChar = STyChar.newSTyChar();

   private ArrayList<String> errors;
   private Stack<HashMap<String, SType>> env;
   private HashMap<String, Function> functions;
   private HashMap<String, Data> datas;

   private Stack<SType> typeStack;
   private Stack<Object> operands;

   private Boolean returnMode;

   public TypeCheckVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, SType>>();
      this.datas = new HashMap<String, Data>();
      this.errors = new ArrayList<String>();
      this.returnMode = false;
      this.typeStack = new Stack<SType>();

      env.push(new HashMap<String, SType>());
   }

   public ArrayList<String> getErrors() {
      return errors;
   }

   public void addErrorMessage(Node node, String message) {
      ;

      CustomRuntimeException error = new CustomRuntimeException(message, node);
      this.errors.add(error.getMessage());
      logger.info(error.getMessage());
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
         this.addErrorMessage(main, "The program doesnt have a main function");

      main.accept(this);
   }

   public void visit(Add add) {
      add.getLeft().accept(this);
      add.getRight().accept(this);

      this.checkBinOpTypes(add, '+');
   }

   public void visit(Sub sub) {

      sub.getLeft().accept(this);
      sub.getRight().accept(this);

      this.checkBinOpTypes(sub, '-');
   }

   private void checkBinOpTypes(BinOP operation, char c) {

      SType rightType = typeStack.pop();
      SType leftType = typeStack.pop();

      String errMessage = " Operator " + c + " do not apply to the types : " + leftType.toString() + " and "
            + rightType.toString();

      if (rightType.match(typeInt) || rightType.match(typeFloat)) {
         if (leftType.match(typeInt) || leftType.match(typeFloat)) {
            this.typeStack.push(leftType);
            return;
         }
      }

      this.typeStack.push(typeErr);
      addErrorMessage(operation, errMessage);
   }

   public void visit(Mod mod) {

      mod.getLeft().accept(this);
      mod.getRight().accept(this);

      SType left, right;

      right = typeStack.pop();
      left = typeStack.pop();

      if (left.match(typeInt) && right.match(typeInt))
         typeStack.push(typeInt);
      else {
         addErrorMessage(mod, TypeCheckUtils.createInvalidOperandsErrorMessage("%", left, right));
         typeStack.push(typeErr);
      }

   }

   public void visit(Mult mult) {
      mult.getLeft().accept(this);
      mult.getRight().accept(this);

      this.checkBinOpTypes(mult, '*');
   }

   public void visit(Div div) {
      div.getLeft().accept(this);
      div.getRight().accept(this);

      this.checkBinOpTypes(div, '*');
   }

   public void visit(Equal equal) {
      equal.getLeft().accept(this);
      equal.getRight().accept(this);

      SType left, right;
      right = typeStack.pop();
      left = typeStack.pop();

      if (TypeCheckUtils.isInstanceOfNumber(left) && TypeCheckUtils.isInstanceOfNumber(right))
         typeStack.push(typeBool);
      else if (left.match(typeChar) && right.match(typeChar))
         typeStack.push(typeBool);
      else {
         addErrorMessage(equal, TypeCheckUtils.createEqualErrorMessage(left, right));
         typeStack.push(typeErr);
      }

   }

   public void visit(Diff diff) {
      diff.getLeft().accept(this);
      diff.getRight().accept(this);

      SType left, right;
      right = typeStack.pop();
      left = typeStack.pop();

      if (TypeCheckUtils.isInstanceOfNumber(left) && TypeCheckUtils.isInstanceOfNumber(right))
         typeStack.push(typeBool);
      else if (left.match(typeChar) && right.match(typeChar))
         typeStack.push(typeBool);
      else {
         addErrorMessage(diff, TypeCheckUtils.createEqualErrorMessage(left, right));
         typeStack.push(typeErr);
      }

   }

   public void visit(Data data) {

   }

   public void visit(Attribution attr) {
      LValue id = attr.getID();

      if (id instanceof AttributeAccess) {

         // AttributeAccess access = (AttributeAccess) id;

         // LValue leftSideId = access.getLeftValue();

         // if (this.env.peek().containsKey(leftSideId.getId())) {

         // HashMap<String, SType> var = (HashMap<String, SType>)
         // this.env.peek().get(leftSideId.getId());

         // attr.getExp().accept(this);
         // SType val = typeStack.pop();

         // var.put(access.getAcessId().getName(), val);
         // env.peek().put(id.getId(), val);

         // } else {
         // throw new CustomRuntimeException("Var " + leftSideId.getId() + " not
         // declared", leftSideId);
         // }

      } else {
         attr.getExp().accept(this);

         SType val = typeStack.pop();

         if (!val.match(typeErr))
            env.peek().put(id.getId(), val);
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

         HashMap<String, SType> localEnv = new HashMap<String, SType>();
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

                     SType value = typeStack.pop();
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

      logger.info("Visiting id : \"" + id.getName() + "\"");

      if (env.peek().containsKey(id.getName())) {
         SType idValue = env.peek().get(id.getName());
         typeStack.push(idValue);

         logger.info("Adding value " + idValue + " to the operands");
      } else {
         addErrorMessage(id, "Variable " + id.getName() + " not declared");
         typeStack.push(typeErr);
      }

   }

   @Override
   public void visit(If ifExpr) {
      logger.info("Visiting if");

      ifExpr.getCondition().accept(this);

      if (typeStack.pop().match(typeBool)) {
         ifExpr.getThen().accept(this);

         if (ifExpr.getOnElse() != null)
            ifExpr.getOnElse().accept(this);
      } else {
         addErrorMessage(ifExpr, " If test expression must have type Bool");
      }
   }

   @Override
   public void visit(Iterate iterate) {

      iterate.getCondition().accept(this);

      if (typeStack.pop().match(typeBool)) {
         iterate.getBody().accept(this);
         iterate.getCondition().accept(this);
      } else {
         addErrorMessage(iterate, " If test expression must have type Bool");
      }

   }

   @Override
   public void visit(LiteralChar literal) {
      this.typeStack.push(typeChar);

   }

   public void visit(LiteralFalse literal) {
      this.operands.push(typeBool);
   }

   public void visit(LiteralFloat literal) {
      this.typeStack.push(typeFloat);
   }

   public void visit(LiteralInt literal) {
      this.typeStack.push(typeInt);
   }

   public void visit(LiteralNull literal) {
      this.operands.push(null);
   }

   public void visit(LiteralTrue literal) {
      this.typeStack.push(typeBool);
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
         this.env.peek().put(read.getLvalue().getId(), typeInt);
      } else if (Util.isDouble(value)) {
         this.env.peek().put(read.getLvalue().getId(), typeFloat);
      } else {
         this.env.peek().put(read.getLvalue().getId(), typeChar);
      }

      // Attribution attr = new Attribution(read.getLine(), read.getCol(),
      // read.getLvalue());

   }

   public void visit(LessThan lessThan) {
      try {
         lessThan.getLeft().accept(this);
         lessThan.getRight().accept(this);

         SType left, right;

         right = typeStack.pop();
         left = typeStack.pop();

         // Boolean res = new Boolean((Integer) left < (Integer) right);

         // operands.push(res);

         // logger.info("Less than added " + res + " To te stack");
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
      SType paramValue = typeStack.pop();

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
            // HashMap<String, SType> var = (HashMap<String, SType>)
            // this.env.peek().get(leftSideId.getId());

            // Object idValue = var.get(attributeAccess.getAcessId().getId());
            // operands.push(idValue);

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

   public void visit(TypeChar typeChar) {

   }

   public void visit(TypeCustom customType) {

   }

}
