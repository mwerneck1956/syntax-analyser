/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.visitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.compiler.ast.Add;
import com.compiler.ast.And;
import com.compiler.ast.ArrayPositionAccess;
import com.compiler.ast.AttributeAccess;
import com.compiler.ast.Attribution;
import com.compiler.ast.BasicType;
import com.compiler.ast.BinOP;
import com.compiler.ast.Cmd;
import com.compiler.ast.CmdList;
import com.compiler.ast.CustomRuntimeException;
import com.compiler.ast.Data;
import com.compiler.ast.Declaration;
import com.compiler.ast.Diff;
import com.compiler.ast.Div;
import com.compiler.ast.Equal;
import com.compiler.ast.Expr;
import com.compiler.ast.Function;
import com.compiler.ast.FunctionCall;
import com.compiler.ast.FunctionCallArray;
import com.compiler.ast.GreatherThan;
import com.compiler.ast.ID;
import com.compiler.ast.If;
import com.compiler.ast.Iterate;
import com.compiler.ast.LValue;
import com.compiler.ast.LessThan;
import com.compiler.ast.LiteralChar;
import com.compiler.ast.LiteralFalse;
import com.compiler.ast.LiteralFloat;
import com.compiler.ast.LiteralInt;
import com.compiler.ast.LiteralNull;
import com.compiler.ast.LiteralTrue;
import com.compiler.ast.Mod;
import com.compiler.ast.Mult;
import com.compiler.ast.NewArray;
import com.compiler.ast.NewData;
import com.compiler.ast.Node;
import com.compiler.ast.Not;
import com.compiler.ast.Param;
import com.compiler.ast.ParenthesisExpression;
import com.compiler.ast.Print;
import com.compiler.ast.Prog;
import com.compiler.ast.Read;
import com.compiler.ast.Return;
import com.compiler.ast.Sub;
import com.compiler.ast.Type;
import com.compiler.ast.TypeArray;
import com.compiler.ast.TypeBool;
import com.compiler.ast.TypeChar;
import com.compiler.ast.TypeCustom;
import com.compiler.ast.TypeFloat;
import com.compiler.ast.TypeInt;
import com.compiler.typeCheckUtils.STyArray;
import com.compiler.typeCheckUtils.STyBool;
import com.compiler.typeCheckUtils.STyChar;
import com.compiler.typeCheckUtils.STyData;
import com.compiler.typeCheckUtils.STyErr;
import com.compiler.typeCheckUtils.STyFloat;
import com.compiler.typeCheckUtils.STyInt;
import com.compiler.typeCheckUtils.SType;
import com.compiler.util.TypeCheckUtils;

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
         this.errors.add("The program doesnt have a main function");
      else
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

      if (id instanceof ArrayPositionAccess) {
         id.accept(this);

         SType expectedType = typeStack.pop();

         attr.getExp().accept(this);

         SType exprType = typeStack.pop();

         String idWithIndex = id.getId() + "[]";

         if (!expectedType.match(exprType))
            addErrorMessage(id, TypeCheckUtils.createVariableRedeclarationMessage(expectedType, exprType, idWithIndex));

      }

      // x.z = 10
      else if (id instanceof AttributeAccess) {
         AttributeAccess access = (AttributeAccess) id;
         LValue leftSideId = access.getLeftValue();
         String rightSideId = access.getAcessId().getId();

         leftSideId.accept(this);

         SType varType = typeStack.pop();

         if (varType instanceof STyData) {
            STyData var = (STyData) varType;
            STyData data = datas.get(var.getId());

            if (data.getVars().containsKey(rightSideId)) {
               attr.getExp().accept(this);
               SType val = typeStack.pop();
               SType expectedType = data.getVars().get(rightSideId);

               if (val.match(data.getVars().get(rightSideId))) {

                  if (!(leftSideId instanceof ArrayPositionAccess)) {
                     var.add(access.getAcessId().getName(), val);
                     env.peek().put(id.getId(), val);
                  }
               } else {
                  addErrorMessage(id,
                        TypeCheckUtils.createVariableRedeclarationMessage(expectedType, val, rightSideId));
               }

            } else {
               addErrorMessage(leftSideId,
                     TypeCheckUtils.createObjectInvalidAttributeMessage(rightSideId, leftSideId.getId()));
            }

         }

      } else {
         attr.getExp().accept(this);

         SType val = typeStack.pop();

         if (this.env.peek().containsKey(id.getId())) {
            id.accept(this);
            SType currentType = typeStack.pop();

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

         if (function.getParamlist().size() > 0) {
            addErrorMessage(function, "Main function received " + function.getParamlist().size()
                  + " params, the main function must not have params");
         }

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

      Function func = functions.get(functionCall.getFunctionName());

      if (func != null) {
         int receivedParams = functionCall.getParams().size();

         if (func.isQuantityOfParamsValid(receivedParams)) {
            for (Expr expr : functionCall.getParams())
               expr.accept(this);

            func.accept(this);

            if (functionCall.getReturnsId().size() > 0 && func.getReturns().size() == 0) {
               addErrorMessage(func, "Function " + func.getName() + " doesnt return any value");
            }

            else if (functionCall.getReturnsId().size() > 0 && returnMode) {

               for (LValue returnId : functionCall.getReturnsId()) {
                  String returnVariableName = returnId.getId();

                  SType receivedType = typeStack.pop();
                  SType expectedType = paramStack.pop();

                  if (expectedType.match(receivedType)) {
                     if (this.env.peek().containsKey(returnVariableName)) {
                        SType currentType = this.env.peek().get(returnVariableName);

                        if (!currentType.match(expectedType))
                           addErrorMessage(func, TypeCheckUtils.createVariableRedeclarationMessage(expectedType,
                                 currentType, returnVariableName));

                     } else {
                        this.env.peek().put(returnVariableName, receivedType);
                     }

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

            this.typeStack.push(typeErr);
         }

      } else {
         String errMessage = "Function: " + functionCall.getFunctionName() + " Not declared";
         addErrorMessage(func, errMessage);
      }

   }

   @Override
   public void visit(ID id) {

      if (env.peek().containsKey(id.getName())) {
         SType idValue = env.peek().get(id.getName());

         typeStack.push(idValue);

      } else {
         addErrorMessage(id, "Variable " + id.getName() + " not declared");
         typeStack.push(typeErr);
      }

   }

   @Override
   public void visit(If ifExpr) {
      ifExpr.getCondition().accept(this);

      SType returnType = typeStack.pop();

      if (returnType.match(typeBool) || TypeCheckUtils.isInstanceOfNumber(returnType)) {
         ifExpr.getThen().accept(this);

         if (ifExpr.getOnElse() != null)
            ifExpr.getOnElse().accept(this);
      } else {
         addErrorMessage(ifExpr, " If test expression must have type Bool and expr type is " + returnType);
      }
   }

   @Override
   public void visit(Iterate iterate) {

      iterate.getCondition().accept(this);

      SType returnType = typeStack.pop();

      if (returnType.match(typeBool) || TypeCheckUtils.isInstanceOfNumber(returnType)) {
         iterate.getBody().accept(this);
         iterate.getCondition().accept(this);
      } else {
         addErrorMessage(iterate, " If test expression must have type Bool and expr type is " + returnType);
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
      this.typeStack.push(null);
   }

   public void visit(LiteralTrue literal) {
      this.typeStack.push(typeBool);
   }

   public void visit(Print print) {
      print.getExpr().accept(this);

      typeStack.pop();
   }

   public void visit(Read read) {

      String attributionId = read.getLvalue().getId();

      if (checkIfHasVariableDeclared(attributionId)) {
         read.getLvalue().accept(this);

         SType currentVarType = typeStack.pop();

         if (currentVarType.match(typeInt)) {
            this.env.peek().put(attributionId, typeInt);
         } else {
            addErrorMessage(read, TypeCheckUtils.createTypeErrorRead(attributionId, currentVarType));
         }
      } else {
         this.env.peek().put(attributionId, typeInt);
      }

   }

   private boolean checkIfHasVariableDeclared(String varName) {
      return this.env.peek().containsKey(varName);
   }

   public void visit(LessThan lessThan) {

      lessThan.getLeft().accept(this);
      lessThan.getRight().accept(this);

      SType left, right;

      right = typeStack.pop();
      left = typeStack.pop();

      if (TypeCheckUtils.isInstanceOfNumber(left) && TypeCheckUtils.isInstanceOfNumber(right))
         typeStack.push(typeBool);
      else
         typeStack.push(typeErr);
   }

   public void visit(And and) {
      and.getLeft().accept(this);
      and.getRight().accept(this);

      SType left, right;

      right = typeStack.pop();
      left = typeStack.pop();

      if (left.match(typeBool) && right.match(typeBool))
         typeStack.push(typeBool);
      else {
         addErrorMessage(and, "And left and right expression must have type bool");
         typeStack.push(typeErr);
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

      LValue leftSideId = attributeAccess.getLeftValue();

      leftSideId.accept(this);

      SType returned = this.typeStack.pop();

      if (returned instanceof STyData) {

         STyData var;

         if (leftSideId instanceof ArrayPositionAccess) {
            leftSideId.accept(this);

            var = (STyData) typeStack.pop();
         } else
            var = (STyData) this.env.peek().get(leftSideId.getId());

         String rightSideId = attributeAccess.getAcessId().getId();

         STyData data = datas.get(var.getId());

         if (data.getVars().containsKey(rightSideId)) {
            this.typeStack.push(data.getVars().get(rightSideId));
         }

         else {
            addErrorMessage(attributeAccess,
                  TypeCheckUtils.createObjectInvalidAttributeMessage(rightSideId, leftSideId.getId()));

            this.typeStack.push(typeErr);
         }
      } else {
         typeStack.push(typeErr);
      }

   }

   public void visit(NewData data) {

      if (data.getType() instanceof TypeCustom) {
         data.getType().accept(this);

         SType returnedType = paramStack.pop();
         typeStack.push(returnedType);

      } else {
         addErrorMessage(data, data.getTypeName() + " cannot be instantiate with New");
         typeStack.push(typeErr);
      }

   }

   public void visit(ArrayPositionAccess arrayPositionAccess) {

      arrayPositionAccess.getPositionExpr().accept(this);

      SType indexType = typeStack.pop();

      if (indexType.match(typeInt)) {
         arrayPositionAccess.getLeftValue().accept(this);

         SType lValueType = typeStack.pop();

         if (lValueType instanceof STyArray) {
            SType arrayType = ((STyArray) lValueType).getType();
            typeStack.push(arrayType);
         } else {
            addErrorMessage(arrayPositionAccess, "Var " + arrayPositionAccess.getLeftValue().getId() + " isnt a array");
            typeStack.push(typeErr);
         }

      } else {
         addErrorMessage(arrayPositionAccess, TypeCheckUtils.createInvalidArrayIndexTypeMessage(indexType));
         typeStack.push(typeErr);
      }
   }

   public void checkArrayIfArrayIndexIsValid(ArrayPositionAccess arrayPositionAccess) {
      // LiteralInt index = (LiteralInt) functionCall.getReturnExpr();

      // if (index.getValue() < func.getReturns().size()) {

      // // É necessário porquê pela implementação do Return, o mesmo coloca todos
      // tipos
      // // de retorno na pilha de paramêtros
      // cleanParamsStack();

      // func.getReturns().get(index.getValue()).accept(this);

      // SType expectedType = paramStack.pop();
      // typeStack.push(expectedType);

      // } else {
      // addErrorMessage(index, " Return index in function call is out of array
      // limits");
      // typeStack.push(typeErr);
      // }

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

      if (datas.containsKey(type.getTypeName())) {
         paramStack.push(new STyData(type.getTypeName()));
      } else {
         addErrorMessage(type, TypeCheckUtils.createTypeNotDeclaredMessage(type.getTypeName()));
         paramStack.push(typeErr);
      }
   }

   public void visit(TypeArray typeArray) {
      typeArray.getType().accept(this);

      SType returnedType = this.paramStack.pop();
      this.paramStack.push(new STyArray(returnedType));
   }

   public void visit(FunctionCallArray functionCall) {

      Function func = functions.get(functionCall.getFunctionName());

      if (func != null) {
         int receivedParams = functionCall.getParams().size();

         if (func.isQuantityOfParamsValid(receivedParams)) {
            for (Expr expr : functionCall.getParams())
               expr.accept(this);

            func.accept(this);

            if (returnMode) {
               this.onFunctionCallArrayReturn(functionCall, func);
            }
         }

         else {
            addErrorMessage(func, "Function " + functionCall.getFunctionName() + " expected "
                  + func.getParamlist().size() + " params");

            typeStack.push(typeErr);
         }

      } else {
         String errMessage = "Function: " + functionCall.getFunctionName() + " Not declared";
         addErrorMessage(func, errMessage);
      }

   }

   private void onFunctionCallArrayReturn(FunctionCallArray functionCall, Function func) {
      functionCall.getReturnExpr().accept(this);
      SType indexType = typeStack.pop();

      if (indexType.match(typeInt)) {
         if (functionCall.getReturnExpr() instanceof LiteralInt) {
            LiteralInt index = (LiteralInt) functionCall.getReturnExpr();

            if (index.getValue() < func.getReturns().size()) {

               // É necessário porquê pela implementação do Return, o mesmo coloca todos tipos
               // de retorno na pilha de paramêtros
               cleanParamsStack();

               func.getReturns().get(index.getValue()).accept(this);

               SType expectedType = paramStack.pop();
               typeStack.push(expectedType);

            } else {
               addErrorMessage(index, " Return index in function call is out of array limits");
               typeStack.push(typeErr);
            }

         }

      } else {
         addErrorMessage(func, TypeCheckUtils.createInvalidArrayIndexTypeMessage(indexType));
      }
   }

   private void cleanParamsStack() {
      while (!paramStack.empty())
         paramStack.pop();
   }

   public void visit(NewArray newArray) {

      newArray.getType().accept(this);
      SType returnedType;

      returnedType = paramStack.pop();

      newArray.getExpr().accept(this);

      SType indexType = this.typeStack.pop();

      if (indexType.match(typeInt)) {
         this.typeStack.push(new STyArray(returnedType));
      } else {
         addErrorMessage(newArray, TypeCheckUtils.createInvalidArrayIndexTypeMessage(returnedType));
         typeStack.push(typeErr);
      }

   }

}
