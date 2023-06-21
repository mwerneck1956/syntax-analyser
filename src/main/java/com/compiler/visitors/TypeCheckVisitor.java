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

   private Stack<SType> typeStack;
   private Stack<SType> paramStack;
   private Stack<Object> operands;
   private HashMap<String, STyData> datas;
   private Boolean returnMode;

   public TypeCheckVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, SType>>();
      this.datas = new HashMap<String, STyData>();
      this.errors = new ArrayList<String>();
      this.returnMode = false;

      this.typeStack = new Stack<SType>();
      this.paramStack = new Stack<SType>();

      env.push(new HashMap<String, SType>());
   }

   public ArrayList<String> getErrors() {
      return errors;
   }

   public void addErrorMessage(Node node, String message) {
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

      for (String dataName : prog.getDataList().keySet()) {
         Data data = prog.getDataList().get(dataName);

         STyData newData = new STyData(dataName);
         for (Declaration decl : data.getDeclarations()) {
            decl.getType().accept(this);

            SType type = paramStack.pop();
            newData.add(decl.getIdName(), type);
         }

         this.datas.put(dataName, newData);
      }

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

      // x.z = 10
      if (id instanceof AttributeAccess) {

         AttributeAccess access = (AttributeAccess) id;
         LValue leftSideId = access.getLeftValue();
         String rightSideId = access.getAcessId().getId();

         leftSideId.accept(this);

         if (this.env.peek().containsKey(leftSideId.getId())) {
            STyData var = (STyData) this.env.peek().get(leftSideId.getId());

            STyData data = datas.get(var.getId());

            System.out.println("Vars : " + data.getVars());

            if (data.getVars().containsKey(rightSideId)) {
               attr.getExp().accept(this);
               SType val = typeStack.pop();

               var.add(access.getAcessId().getName(), val);
               env.peek().put(id.getId(), val);
            } else {
               addErrorMessage(leftSideId,
                     TypeCheckUtils.createObjectInvalidAttributeMessage(rightSideId, leftSideId.getId()));
            }
         }
      } else {
         attr.getExp().accept(this);

         SType val = typeStack.pop();

         if (this.env.peek().containsKey(id.getId())) {
            SType currentType = this.env.peek().get(id.getId());

            if (!currentType.match(val)) {
               addErrorMessage(id, TypeCheckUtils.createVariableRedeclarationMessage(currentType, val, id.getId()));
               val = typeErr;
            }
         }

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
         function.getBody().accept(this);
      } else {
         HashMap<String, SType> localEnv = new HashMap<String, SType>();
         this.env.push(localEnv);

         ArrayList<Param> functionParams = function.getParamlist();

         if (functionParams.size() > 0) {

            for (int i = functionParams.size() - 1; i >= 0; i--) {
               Param p = functionParams.get(i);

               p.getType().accept(this);
               p.accept(this);
            }

         }

         if (function.getReturns().size() > 0) {
            for (int i = function.getReturns().size() - 1; i >= 0; i--) {
               Type returnType = function.getReturns().get(i);

               returnType.accept(this);
            }

         }

         function.getBody().accept(this);
         this.env.pop();
      }

   }

   public void visit(FunctionCall functionCall) {
      try {

         Function func = functions.get(functionCall.getFunctionName());

         if (func != null) {
            int receivedParams = functionCall.getParams().size();

            if (func.isQuantityOfParamsValid(receivedParams)) {
               for (Expr expr : functionCall.getParams())
                  expr.accept(this);

               func.accept(this);

               if (functionCall.getReturnsId().size() > 0 && returnMode) {

                  for (LValue returnId : functionCall.getReturnsId()) {
                     // Conferir se tipo da variavel é igual ao tipo retornado
                     String returnVariableName = returnId.getId();

                     SType receivedType = typeStack.pop();
                     SType expectedType = paramStack.pop();

                     if (expectedType.match(receivedType)) {
                        this.env.peek().put(returnVariableName, receivedType);
                     } else {
                        addErrorMessage(func,
                              TypeCheckUtils.createWrongFunctionReturnMessage(expectedType, receivedType,
                                    func.getName()));

                        this.env.peek().put(returnVariableName, typeErr);
                     }

                  }

                  returnMode = false;
               }
            }

            else {
               addErrorMessage(func, "Function " + functionCall.getFunctionName() + " expected "
                     + func.getParamlist().size() + " params");
            }

         } else {
            String errMessage = "Function: " + functionCall.getFunctionName() + " Not declared";
            addErrorMessage(func, errMessage);
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

   }

   public void visit(Param param) {
      SType receivedType = typeStack.pop();
      SType expectedType = paramStack.pop();

      if (receivedType.match(expectedType)) {
         env.peek().put(param.getId().getId(), receivedType);
      } else {
         addErrorMessage(param, TypeCheckUtils.createWrongTypeMessage(expectedType, receivedType));
         env.peek().put(param.getId().getId(), typeErr);
      }

   }

   public void visit(Return ret) {
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
      data.getType().accept(this);
   }

   public void visit(ArrayPositionAccess arrayPositionAccess) {

   }

   public void visit(TypeInt type) {
      this.paramStack.push(typeInt);
   }

   public void visit(TypeFloat type) {
      this.paramStack.push(typeFloat);
   }

   public void visit(TypeBool type) {
      this.paramStack.push(typeBool);
   }

   public void visit(TypeChar type) {
      this.paramStack.push(typeChar);
   }

   public void visit(TypeCustom type) {
      System.out.println("Datas : " + datas.get("Ponto").getVars());

      if (datas.containsKey(type.getTypeName())) {
         typeStack.push(new STyData(type.getTypeName()));
      } else {
         addErrorMessage(type, TypeCheckUtils.createTypeNotDeclaredMessage(type.getTypeName()));
         typeStack.push(typeErr);
      }
   }

}
