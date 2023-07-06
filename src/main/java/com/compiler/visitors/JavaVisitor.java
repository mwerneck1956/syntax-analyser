/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.visitors;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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

   private static final Logger logger = LogManager.getLogger(JavaVisitor.class);

   private String fileName;
   private STGroup groupTemplate;
   private ST type, statement, expr;
   private ArrayList<ST> functionsArray, params, datasTemplate;
   private HashMap<String, STyData> datas;

   private Stack<HashMap<String, Object>> env;
   private Stack<Object> operands;
   private Boolean returnMode;

   public JavaVisitor(String fileName, HashMap<String, STyData> datas) {

      this.groupTemplate = new STGroupFile("template/java.stg");
      this.fileName = fileName;
      this.datas = datas;

      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, Object>>();
      env.push(new HashMap<String, Object>());
      this.returnMode = false;

   }

   public void visit(Prog prog) {

      ST template = groupTemplate.getInstanceOf("program");

      template.add("name", fileName);

      this.datasTemplate = new ArrayList<ST>();

      for (Data data : prog.getDataList()) {
         data.accept(this);
      }

      template.add("data", this.datasTemplate);

      try {
         FileWriter writer = new FileWriter(this.fileName + ".java");
         writer.write(template.render());
         writer.close();

      } catch (IOException exception) {
         exception.printStackTrace();
      }

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

      ST template = groupTemplate.getInstanceOf("int_type");

      if (type instanceof STyInt)
         template = groupTemplate.getInstanceOf("int_type");
      else if (type instanceof STyBool)
         template = groupTemplate.getInstanceOf("boolean_type");
      else if (type instanceof STyFloat)
         template = groupTemplate.getInstanceOf("float_type");
      else if (type instanceof STyChar)
         template = groupTemplate.getInstanceOf("char_type");
      else if (type instanceof STyData) {
         STyData dataType = ((STyData) type);
         template = groupTemplate.getInstanceOf("data_type");
         template.add("id", dataType.getId());
      } else if (type instanceof STyArray) {
         STyArray arrayType = ((STyArray) type);
         template = groupTemplate.getInstanceOf("data_type");
         template.add("id", arrayType.getType().toString());
      }

      return template;
   }

   public void visit(Declaration declaration) {
      // System.out.println("Visitando decl " + declaration);

      // ST declarationTemplate = groupTemplate.getInstanceOf("param");

      // declaration.add()

   }

   public void visit(Add add) {

   }

   public void visit(Sub sub) {

   }

   public void visit(Mod mod) {

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

   }

   public void visit(FunctionCall functionCall) {

   }

   @Override
   public void visit(ID id) {

   }

   @Override
   public void visit(If ifExpr) {

   }

   @Override
   public void visit(Iterate iterate) {

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

   }

   public void visit(NewArray newArray) {

   }
}
