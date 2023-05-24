package com.compiler.ast;

import java.util.HashMap;

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

   @Override
   public int interpret(HashMap<String, Integer> Variables) {
      // TODO Auto-generated method stub
      return 0;
   }
}
