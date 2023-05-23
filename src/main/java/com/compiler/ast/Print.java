package com.compiler.ast;

import java.util.HashMap;

public class Print extends Node {
   private Expr expr;

   public Print(int line, int column, Expr expr) {
      super(line, column);
      this.expr = expr;
   }

   public Expr getExpr() {
      return expr;
   }

   @Override
   public String toString() {
      return expr.toString();
   }

   public int interpret(HashMap<String, Integer> Variables) {
      return 0;
   }

}
