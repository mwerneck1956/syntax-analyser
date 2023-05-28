package com.compiler.visitors;

import com.compiler.ast.*;
import java.util.HashMap;

public class InterpretVisitor implements Visitor {

   private HashMap<String, Function> functions;

   public InterpretVisitor() {
      this.functions = new HashMap<String, Function>();

   }

   public void visit(Prog prog) {
      Node main = null;

      this.functions = prog.getFunctions();

      for (Function f : this.functions.values()) {

         if (f.getName().equals("main")) {
            main = f;
         }

      }

      if (main == null)
         throw new RuntimeException("The program doesnt have a main function");

   }

   public void visit(Add add) {

   }

   public void visit(Data data) {

   }

   public void visit(Attribution attr) {

   }

   public void visit(BasicType attr) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(BinOP binOp) {
      // TODO Auto-generated method stub

   }

   @Override
   public void visit(CmdList cmdList) {

   }

   @Override
   public void visit(Function function) {
      // TODO Auto-generated method stub

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
      // TODO Auto-generated method stub

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
