package com.compiler.visitors;

import com.compiler.ast.*;

import java.util.HashMap;
import java.util.Stack;

public class InterpretVisitor implements Visitor {

   private HashMap<String, Function> functions;
   private Stack<Object> operands;

   public InterpretVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();

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

   }

   public void visit(Data data) {

   }

   public void visit(Attribution attr) {
      Node id = attr.getID();

      attr.getExp().accept(this);
   }

   public void visit(BasicType attr) {
      System.out.println("Visitando attr");

      // TODO Auto-generated method stub

   }

   @Override
   public void visit(BinOP binOp) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(CmdList cmdList) {

      for (Cmd c : cmdList.getBody()) {
         c.accept(this);
      }
   }

   @Override
   public void visit(Function function) {
      function.getBody().accept(this);
   }

   @Override
   public void visit(ID id) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(If ifExpr) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(Iterate iterate) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(LiteralChar literal) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(LiteralFalse literal) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(LiteralFloat literal) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(LiteralInt literal) {
      try {
         this.operands.push(literal.getValue());
      } catch (Exception err) {

      }

   }

   @Override
   public void visit(LiteralNull literal) {

   }

   @Override
   public void visit(LiteralTrue literal) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(Print print) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(Read read) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(StmtList stmtList) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(Sub sub) {
      // TODO Auto-generated method stub

   }

}
