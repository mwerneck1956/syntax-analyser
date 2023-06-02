package com.compiler.ast;

import java.util.ArrayList;
import java.util.HashMap;

import com.compiler.visitors.Visitor;

public class If extends Cmd {

   private Expr condition;
   private Cmd then;
   private Cmd onElse;

   public If(int line, int column, Expr condition, Cmd then, Cmd onElse) {
      super(line, column);

      this.condition = condition;
      this.then = then;
      this.onElse = onElse;

      System.out.println("If criado com else");
   }

   public If(int line, int column, Expr condition, Cmd then) {
      super(line, column);

      this.condition = condition;
      this.then = then;
      this.onElse = null;

      System.out.println("If criado sem else");
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

   public Expr getCondition() {
      return condition;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
