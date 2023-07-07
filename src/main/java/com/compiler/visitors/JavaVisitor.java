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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
   private HashMap<String, Function> functions;
   HashMap<String, HashMap<String, SType>> typesEnvByFunction;

   private STGroup groupTemplate;
   private ST currentTypeTemplate;
   private ST currentCommandTemplate;
   private ST currentExprTemplate;
   private ST currentFunctionTemplate;

   private ArrayList<ST> functionsTemplate;

   private Stack<HashMap<String, SType>> env;
   private Stack<Object> operands;
   private Boolean returnMode;

   public JavaVisitor(String fileName, HashMap<String, STyData> datas, HashMap<String, Function> functions,
         Stack<HashMap<String, SType>> env, HashMap<String, HashMap<String, SType>> typesEnvByFunction) {

      this.groupTemplate = new STGroupFile("template/java.stg");
      this.fileName = fileName;

      this.typesEnvByFunction = typesEnvByFunction;
      this.datas = datas;
      this.operands = new Stack<Object>();
      this.env = env;
      this.returnMode = false;

   }

   public void visit(Prog prog) {

      ST template = groupTemplate.getInstanceOf("program");

      template.add("name", fileName);

      handleDataInstantion(prog, template);
      handleFunctionInstantiation(prog, template);

      try {
         FileWriter writer = new FileWriter(this.fileName + ".java");
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
         template.add("id", arrayType.getType().toString());
      } else {
         String templateName = templateMap.get(type.getClass());
         template = groupTemplate.getInstanceOf(templateName != null ? templateName : "type_int");
      }

      return template;
   }

   public void visit(Declaration declaration) {
      // System.out.println("Visitando decl " + declaration);

      // ST declarationTemplate = groupTemplate.getInstanceOf("param");

      // declaration.add()

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

   }

   public void visit(Div div) {

   }

   public void visit(Equal equal) {

   }

   public void visit(Diff diff) {

   }

   public void visit(Attribution attr) {

      attr.getID().accept(this);

      ST varDeclTemplate = groupTemplate.getInstanceOf("param");

      varDeclTemplate.add("type", currentTypeTemplate);
      varDeclTemplate.add("name", attr.getID().getId());

      currentCommandTemplate = groupTemplate.getInstanceOf("attribution");
      currentCommandTemplate.add("var", varDeclTemplate);

      attr.getExp().accept(this);
      currentCommandTemplate.add("expr", currentExprTemplate);
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
         this.currentFunctionTemplate.add("statements", currentCommandTemplate);
      }
   }

   @Override
   public void visit(Function function) {
      // Pegar os parametros da função

      currentFunctionTemplate = groupTemplate.getInstanceOf("function");

      currentFunctionTemplate.add("name", function.getName());
      currentFunctionTemplate.add("returnType", "void");

      for (Param param : function.getParamlist()) {
         param.getType().accept(this);

         ST paramTemplate = groupTemplate.getInstanceOf("param");
         paramTemplate.add("name", param.getId().getName());
         paramTemplate.add("type", currentTypeTemplate);

         currentFunctionTemplate.add("params", paramTemplate);
      }

      if (function.getName().equals("main")) {
         currentFunctionTemplate.add("params", "String[] args");
      }

      function.getBody().accept(this);

      this.functionsTemplate.add(currentFunctionTemplate);

   }

   public ST getFunctionReturnType(Function function) {
      ST template;

      System.out.println("Vem" + function.getReturns().size());

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

         System.out.println("Current expr " + currentExprTemplate);

         functionCallTemplate.add("args", currentExprTemplate);
      }

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

   }

   @Override
   public void visit(Iterate iterate) {

   }

   @Override
   public void visit(LiteralChar literal) {
      currentExprTemplate = groupTemplate.getInstanceOf("boolean_expr");
      currentExprTemplate.add("value", literal.getValue());

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

   }

   public void visit(Read read) {

   }

   public void visit(LessThan lessThan) {

   }

   public void visit(And and) {

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
      }

      currentCommandTemplate = returnList;

   }

   public void visit(ParenthesisExpression parenthesisExpression) {

   }

   public void visit(Not not) {

   }

   public void visit(AttributeAccess attributeAccess) {

   }

   public void visit(NewData data) {

   }

   public void visit(ArrayPositionAccess arrayPositionAccess) {

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

   }

   public void visit(TypeArray typeArray) {

   }

   public void visit(FunctionCallArray functionCall) {

   }

   public void visit(NewArray newArray) {

   }
}
