package com.compiler.visitors;

import com.compiler.ast.*;

import java.util.HashMap;
import java.util.Stack;

public class InterpretVisitor implements Visitor {

   private Stack<HashMap<String, Object>> env;
   private HashMap<String, Function> functions;
   private Stack<Object> operands;

   public InterpretVisitor() {
      this.functions = new HashMap<String, Function>();
      this.operands = new Stack<Object>();
      this.env = new Stack<HashMap<String, Object>>();
      env.push(new HashMap<String, Object>());

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
      // System.out.println("Visiting add");

      add.getLeft().accept(this);
      add.getRight().accept(this);

      Number left, right;

      left = (Number) operands.pop();
      right = (Number) operands.pop();

      operands.push(left.intValue() + right.intValue());
   }

   public void visit(Data data) {

   }

   public void visit(Attribution attr) {
      LValue id = attr.getID();

      attr.getExp().accept(this);
      Object val = operands.pop();

      env.peek().put(id.getId(), val);
   }

   public void visit(BasicType bType) {

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
      try {

         if (env.peek().containsKey(id.getName())) {
            Object idValue = env.peek().get(id.getName());
            operands.push(idValue);
         } else
            throw new RuntimeException("Variable " + id.getName() + " Not declared");

      } catch (Exception e) {
         throw new RuntimeException(e.getMessage());
      }

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
      print.getExpr().accept(this);

      System.out.println(operands.pop());
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
