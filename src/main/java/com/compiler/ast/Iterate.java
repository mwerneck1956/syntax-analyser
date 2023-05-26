package com.compiler.ast;

import java.util.HashMap;

public class Iterate extends Cmd {

   private Expr condition;
   private Cmd body;

   public Iterate(int line, int column, Expr condition, Cmd body) {
      super(line, column);

      this.condition = condition;
      this.body = body;
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
