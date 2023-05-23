package com.compiler.ast;

public class Minus extends BinOP {

   public Minus(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("Add created" + l.toString() + " + " + r.toString());
   }

   public String toString() {

      return "";

      // String leftOperator = getLeft().toString();
      // String RightOperator = getRight().toString();
      // if (getRight() instanceof Add) {
      // RightOperator = "(" + RightOperator + ")";
      // }
      // return leftOperator + " + " + RightOperator;
   }

}
