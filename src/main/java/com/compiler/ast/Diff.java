package com.compiler.ast;

public class Diff extends BinOP {

   public Diff(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("Diff created" + l.toString() + " != " + r.toString());
   }

   public String toString() {
      String leftOperator = getLeft().toString();
      String RightOperator = getRight().toString();
      if (getRight() instanceof Add) {
         RightOperator = "(" + RightOperator + ")";
      }
      return leftOperator.toString() + " != " + RightOperator.toString();
   }

}
