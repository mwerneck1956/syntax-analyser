/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.visitors;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.compiler.ast.*;
import com.compiler.typeCheckUtils.STyArray;
import com.compiler.typeCheckUtils.STyBool;
import com.compiler.typeCheckUtils.STyChar;
import com.compiler.typeCheckUtils.STyData;
import com.compiler.typeCheckUtils.STyFloat;
import com.compiler.typeCheckUtils.STyInt;
import com.compiler.typeCheckUtils.SType;

public class JavaVisitor implements Visitor {

   private String fileName;
   private String currentFunctionName;

   private ArrayList<ST> datasTemplate;
   private HashMap<String, STyData> datas;
   HashMap<String, HashMap<String, SType>> typesEnvByFunction;
   HashMap<String, HashMap<String, Boolean>> alreadyDeclaredVariablesByFunction;

   private STGroup groupTemplate;
   private ST currentTypeTemplate;
   private ST currentCommandTemplate;
   private ST currentExprTemplate;
   private ST currentFunctionTemplate;

   private ArrayList<ST> functionsTemplate;

   private Stack<HashMap<String, SType>> env;
   private Stack<Object> operands;

   private int currentIterateVarIndex = 0;

   public JavaVisitor(String fileName, HashMap<String, STyData> datas, HashMap<String, Function> functions,
         Stack<HashMap<String, SType>> env, HashMap<String, HashMap<String, SType>> typesEnvByFunction) {

      this.groupTemplate = new STGroupFile("template/java.stg");

      this.fileName = fileName;

      this.typesEnvByFunction = typesEnvByFunction;
      this.datas = datas;
      this.operands = new Stack<Object>();
      this.env = env;

   }

   public void visit(Prog prog) {

      ST template = groupTemplate.getInstanceOf("program");

      template.add("name", fileName);

      handleDataInstantion(prog, template);
      handleFunctionInstantiation(prog, template);

      try {
         FileWriter writer = new FileWriter("generated/" + fileName + ".java");
         writer.write(template.render());
         writer.close();

      } catch (IOException exception) {
         exception.printStackTrace();
      }

   }

   public void handleDataInstantion(Prog prog, ST progTemplate) {
      this.datasTemplate = new ArrayList<ST>();

      for (Data data : prog.getDataList()) {
         data.accept(this);
      }

      progTemplate.add("data", this.datasTemplate);
   }

   public void handleFunctionInstantiation(Prog prog, ST progTemplate) {
      this.functionsTemplate = new ArrayList<ST>();

      for (Function function : prog.getFunctions()) {
         this.currentFunctionName = function.getName();
         function.accept(this);
      }

      progTemplate.add("functions", functionsTemplate);
   }

   public String getIterateNextAvaliableVariable() {
      this.currentIterateVarIndex++;

      return new String("_a" + this.currentIterateVarIndex);
   }

   public void visit(Data data) {
      ST dataTemplate = groupTemplate.getInstanceOf("data");
      dataTemplate.add("id", data.getIdName());

      STyData dataTypes = datas.get(data.getIdName());

      for (Declaration declaration : data.getDeclarations()) {
         declaration.accept(this);

         ST classDeclarationTemplate = groupTemplate.getInstanceOf("param");
         classDeclarationTemplate.add("name", declaration.getIdName());

         SType type = dataTypes.getVars().get(declaration.getIdName());
         ST typeTemplate = getTypeTemplate(type);

         classDeclarationTemplate.add("type", typeTemplate);
         dataTemplate.add("decl", classDeclarationTemplate);
      }

      this.datasTemplate.add(dataTemplate);
   }

   public ST getTypeTemplate(SType type) {

      if (type == null)
         return groupTemplate.getInstanceOf("type_int");

      Map<Class<? extends SType>, String> templateMap = new HashMap<>();
      templateMap.put(STyInt.class, "type_int");
      templateMap.put(STyBool.class, "type_bool");
      templateMap.put(STyFloat.class, "type_float");
      templateMap.put(STyChar.class, "type_char");

      ST template;
      if (type instanceof STyData) {
         STyData dataType = (STyData) type;
         template = groupTemplate.getInstanceOf("type_data");
         template.add("id", dataType.getId());
      } else if (type instanceof STyArray) {
         STyArray arrayType = (STyArray) type;
         template = groupTemplate.getInstanceOf("type_array");
         template.add("type", arrayType.getType().toString());
      } else {

         String templateName = templateMap.get(type.getClass());

         template = groupTemplate.getInstanceOf(templateName != null ? templateName : "type_int");
      }

      return template;
   }

   public void visit(Declaration declaration) {

   }

   public void visit(Add add) {
      ST addTemplate = groupTemplate.getInstanceOf("add_expression");

      add.getLeft().accept(this);
      addTemplate.add("left_expr", currentExprTemplate);

      add.getRight().accept(this);
      addTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = addTemplate;
   }

   public void visit(Sub sub) {
      ST subTemplate = groupTemplate.getInstanceOf("sub_expression");

      sub.getLeft().accept(this);
      subTemplate.add("left_expr", currentExprTemplate);

      sub.getRight().accept(this);
      subTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = subTemplate;
   }

   public void visit(Mod mod) {
      ST modTemplate = groupTemplate.getInstanceOf("mod_expression");

      mod.getLeft().accept(this);
      modTemplate.add("left_expr", currentExprTemplate);

      mod.getRight().accept(this);
      modTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = modTemplate;
   }

   public void visit(Mult mult) {
      ST multTemplate = groupTemplate.getInstanceOf("mult_expression");

      mult.getLeft().accept(this);
      multTemplate.add("left_expr", currentExprTemplate);

      mult.getRight().accept(this);
      multTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = multTemplate;
   }

   public void visit(Div div) {
      ST divTemplate = groupTemplate.getInstanceOf("div_expression");

      div.getLeft().accept(this);
      divTemplate.add("left_expr", currentExprTemplate);

      div.getRight().accept(this);
      divTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = divTemplate;
   }

   public void visit(Equal equal) {
      ST equalTemplate = groupTemplate.getInstanceOf("equals_expr");

      equal.getLeft().accept(this);
      equalTemplate.add("left_expr", currentExprTemplate);

      equal.getRight().accept(this);
      equalTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = equalTemplate;
   }

   public void visit(Diff diff) {
      ST diffTemplate = groupTemplate.getInstanceOf("diff_expr");

      diff.getLeft().accept(this);
      diffTemplate.add("left_expr", currentExprTemplate);

      diff.getRight().accept(this);
      diffTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = diffTemplate;
   }

   public void visit(Attribution attr) {

      if (attr.getExp() instanceof FunctionCallArray) {

         attr.getID().accept(this);
         ST idTemplate = currentExprTemplate;

         attr.getExp().accept(this);
         currentExprTemplate.add("id", idTemplate);
         currentCommandTemplate = currentExprTemplate;
      } else {

         attr.getID().accept(this);

         currentCommandTemplate = groupTemplate.getInstanceOf("attribution");
         currentCommandTemplate.add("var", currentExprTemplate);

         attr.getExp().accept(this);
         currentCommandTemplate.add("expr", currentExprTemplate);
      }

   }

   public void visit(BasicType bType) {

   }

   public void visit(BinOP binOp) {

   }

   public void visit(CmdList cmdList) {

      ST statement_list = groupTemplate.getInstanceOf("stmt_list");

      for (Cmd c : cmdList.getBody()) {

         c.accept(this);

         statement_list.add("stmt", currentCommandTemplate);
      }

      currentCommandTemplate = statement_list;
   }

   public void onCmdList(CmdList cmdList) {

      ST statement_list = groupTemplate.getInstanceOf("stmt_list");

      for (Cmd c : cmdList.getBody()) {

         c.accept(this);

         statement_list.add("stmt", currentCommandTemplate);
      }

      currentCommandTemplate = statement_list;
   }

   public void visit(Function function) {
      // Pegar os parametros da função

      currentFunctionTemplate = groupTemplate.getInstanceOf("function");

      currentFunctionTemplate.add("name", function.getName());
      currentFunctionTemplate.add("returnType", "void");

      HashMap<String, SType> varsInFunction = typesEnvByFunction.get(function.getName());

      for (Param param : function.getParamlist()) {
         param.getType().accept(this);

         ST paramTemplate = groupTemplate.getInstanceOf("param");
         paramTemplate.add("name", param.getId().getName());
         paramTemplate.add("type", currentTypeTemplate);

         currentFunctionTemplate.add("params", paramTemplate);
      }

      if (function.getName().equals("main")) {
         varsInFunction = this.env.peek();
         currentFunctionTemplate.add("params", "String[] args");
      }

      for (String var : varsInFunction.keySet()) {
         SType varType = varsInFunction.get(var);

         Boolean hasToDeclareVariable = true;

         for (Param p : function.getParamlist()) {
            if (p.getId().getName() == var) {
               hasToDeclareVariable = false;
               break;
            }
         }

         if (hasToDeclareVariable) {
            currentTypeTemplate = getTypeTemplate(varType);

            ST varDeclTemplate = groupTemplate.getInstanceOf("param");

            varDeclTemplate.add("type", currentTypeTemplate);
            varDeclTemplate.add("name", var);
            currentFunctionTemplate.add("statements", varDeclTemplate);
         }

      }

      function.getBody().accept(this);

      this.currentFunctionTemplate.add("statements", currentCommandTemplate);

      this.functionsTemplate.add(currentFunctionTemplate);

   }

   public ST getFunctionReturnType(Function function) {
      ST template;

      if (function.getReturns().size() == 0)
         template = groupTemplate.getInstanceOf("void");
      else {
         function.getReturns().get(0).accept(this);
         template = currentTypeTemplate;
      }

      return template;
   }

   public void visit(FunctionCall functionCall) {
      ST functionCallTemplate = groupTemplate.getInstanceOf("function_call");

      functionCallTemplate.add("name", functionCall.getFunctionName());

      for (Expr expr : functionCall.getParams()) {
         expr.accept(this);
         functionCallTemplate.add("args", currentExprTemplate);
      }

      int index = 0;

      ST functionCallAssignsTemplate = groupTemplate.getInstanceOf("call_variable_assign_list");

      for (LValue returnId : functionCall.getReturnsId()) {
         returnId.accept(this);

         ST callVariableAssignTemplate = groupTemplate.getInstanceOf("call_variable_assign");

         callVariableAssignTemplate.add("id", currentExprTemplate);
         callVariableAssignTemplate.add("type", currentTypeTemplate);
         callVariableAssignTemplate.add("index", index);

         functionCallAssignsTemplate.add("call_variable_assign", callVariableAssignTemplate);

         index++;
      }

      functionCallTemplate.add("receives", functionCallAssignsTemplate);
      currentCommandTemplate = functionCallTemplate;

   }

   public void visit(ID id) {
      SType idType;

      if (currentFunctionName.equals("main")) {
         idType = this.env.peek().get(id.getName());
      } else
         idType = this.typesEnvByFunction.get(currentFunctionName).get(id.getName());

      currentTypeTemplate = getTypeTemplate(idType);

      currentExprTemplate = groupTemplate.getInstanceOf("var");
      currentExprTemplate.add("var", id.getName());
   }

   public void visit(If ifExpr) {
      ST ifTemplate = groupTemplate.getInstanceOf("if");

      ifExpr.getCondition().accept(this);

      ifTemplate.add("expr", currentExprTemplate);

      ifExpr.getThen().accept(this);

      ifTemplate.add("thenExpr", currentCommandTemplate);

      if (ifExpr.getOnElse() != null) {
         ifExpr.getOnElse().accept(this);
         ifTemplate.add("elseExpr", currentCommandTemplate);
      }

      currentCommandTemplate = ifTemplate;

   }

   @Override
   public void visit(Iterate iterate) {
      ST iterateTemplate = groupTemplate.getInstanceOf("iterate");

      String iterateVarName = this.getIterateNextAvaliableVariable();
      iterateTemplate.add("iterateVarName", iterateVarName);

      iterate.getCondition().accept(this);
      iterateTemplate.add("count", currentExprTemplate);

      iterate.getBody().accept(this);
      iterateTemplate.add("stmt", currentCommandTemplate);

      currentCommandTemplate = iterateTemplate;
   }

   @Override
   public void visit(LiteralChar literal) {
      currentExprTemplate = groupTemplate.getInstanceOf("char_expr");

      String literalValue;

      switch (literal.getValue()) {
         case '\n':
            literalValue = "\\n";
            break;
         case '\t':
            literalValue = "\\t";
         default:
            literalValue = "" + literal.getValue();
      }

      currentExprTemplate.add("value", literalValue);

   }

   public void visit(LiteralFalse literal) {
      currentExprTemplate = groupTemplate.getInstanceOf("boolean_expr");
      currentExprTemplate.add("value", literal.getValue());
   }

   public void visit(LiteralFloat literal) {
      currentExprTemplate = groupTemplate.getInstanceOf("float_expr");
      currentExprTemplate.add("value", literal.getValue());
   }

   public void visit(LiteralInt literal) {
      currentExprTemplate = groupTemplate.getInstanceOf("int_expr");
      currentExprTemplate.add("value", literal.getValue());

   }

   public void visit(LiteralNull literal) {
      this.operands.push(null);
   }

   public void visit(LiteralTrue literal) {
      this.operands.push(new Boolean(true));

   }

   public void visit(Print print) {
      ST printTemplate = groupTemplate.getInstanceOf("print");
      print.getExpr().accept(this);

      printTemplate.add("expr", currentExprTemplate);

      currentCommandTemplate = printTemplate;
   }

   public void visit(Read read) {
      ST readTemplate = groupTemplate.getInstanceOf("read");
      read.getLvalue().accept(this);

      readTemplate.add("expr", currentExprTemplate);

      currentCommandTemplate = readTemplate;
   }

   public void visit(LessThan lessThan) {
      ST lessThanTemplate = groupTemplate.getInstanceOf("less_than_expr");

      lessThan.getLeft().accept(this);
      lessThanTemplate.add("left_expr", currentExprTemplate);

      lessThan.getRight().accept(this);
      lessThanTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = lessThanTemplate;
   }

   public void visit(And and) {
      ST andTemplate = groupTemplate.getInstanceOf("and_expr");
      and.getLeft().accept(this);
      andTemplate.add("left_expr", currentExprTemplate);

      and.getRight().accept(this);
      andTemplate.add("right_expr", currentExprTemplate);

      currentExprTemplate = andTemplate;
   }

   public void visit(GreatherThan greatherThan) {

   }

   public void visit(Param param) {

   }

   public void visit(Return ret) {

      ST returnList = groupTemplate.getInstanceOf("returnList");

      for (Expr expr : ret.getReturnedExprs()) {
         ST returnTemplate = groupTemplate.getInstanceOf("return_array_add");
         expr.accept(this);
         returnTemplate.add("value", currentExprTemplate);

         returnList.add("exprList", returnTemplate);
         returnList.add("return", "return;");
      }

      ST returnTemplate = groupTemplate.getInstanceOf("return_expr");

      returnTemplate.add("exprList", returnList);

      currentCommandTemplate = returnTemplate;

   }

   public void visit(ParenthesisExpression parenthesisExpression) {
      ST pexpTemplate = groupTemplate.getInstanceOf("parenthesis_expr");

      parenthesisExpression.getExpr().accept(this);

      pexpTemplate.add("value", currentExprTemplate);

      currentExprTemplate = pexpTemplate;

   }

   public void visit(Not not) {

   }

   public void visit(AttributeAccess attributeAccess) {
      ST currentTemplate = groupTemplate.getInstanceOf("data_access");

      attributeAccess.getLeftValue().accept(this);
      currentTemplate.add("name", currentExprTemplate);

      attributeAccess.getAcessId().accept(this);
      currentTemplate.add("attribute", currentExprTemplate);

      currentExprTemplate = currentTemplate;
   }

   public void visit(NewData data) {
      ST dataTemplate = groupTemplate.getInstanceOf("new");

      data.getType().accept(this);

      dataTemplate.add("type", currentTypeTemplate);

      if (data.getExpr() != null) {
         data.getExpr().accept(this);

         dataTemplate.add("expr", currentExprTemplate);
      }

      currentExprTemplate = dataTemplate;
   }

   public void visit(ArrayPositionAccess arrayPositionAccess) {
      ST template = groupTemplate.getInstanceOf("array_pos_access");

      arrayPositionAccess.getLeftValue().accept(this);
      template.add("name", currentExprTemplate);

      arrayPositionAccess.getPositionExpr().accept(this);
      template.add("expr", currentExprTemplate);

      currentExprTemplate = template;
   }

   public void visit(TypeInt typeInt) {
      currentTypeTemplate = groupTemplate.getInstanceOf("type_int");
   }

   public void visit(TypeFloat typeFloat) {
      currentTypeTemplate = groupTemplate.getInstanceOf("type_float");
   }

   public void visit(TypeBool typeBool) {
      currentTypeTemplate = groupTemplate.getInstanceOf("type_bool");
   }

   public void visit(TypeChar typeChar) {
      currentTypeTemplate = groupTemplate.getInstanceOf("type_char");
   }

   public void visit(TypeCustom customType) {
      currentTypeTemplate = groupTemplate.getInstanceOf("type_data");
      currentTypeTemplate.add("id", customType.getTypeName());
   }

   public void visit(TypeArray typeArray) {
      ST template = groupTemplate.getInstanceOf("type_array");

      typeArray.getType().accept(this);
      template.add("id", currentTypeTemplate);

      currentTypeTemplate = template;
   }

   public void visit(FunctionCallArray functionCall) {
      ST functionCallTemplate = groupTemplate.getInstanceOf("function_call_array");

      functionCallTemplate.add("functionName", functionCall.getFunctionName());

      for (Expr expr : functionCall.getParams()) {
         expr.accept(this);
         functionCallTemplate.add("args", currentExprTemplate);
      }

      functionCall.getReturnExpr().accept(this);

      functionCallTemplate.add("type", currentTypeTemplate);

      functionCall.getReturnExpr().accept(this);
      functionCallTemplate.add("index", currentExprTemplate);

      currentExprTemplate = functionCallTemplate;
   }

   public void visit(NewArray newArray) {
      ST template = groupTemplate.getInstanceOf("new_array");

      newArray.getType().accept(this);
      template.add("type", currentTypeTemplate);

      newArray.getExpr().accept(this);
      template.add("expr", currentExprTemplate);

      currentExprTemplate = template;
   }
}
