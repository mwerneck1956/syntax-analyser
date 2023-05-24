package com.compiler.ast;

public class LessThan extends BinOP {

   public LessThan(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("LessThan created" + l.toString() + " < " + r.toString());
   }

   public String toString() {
      String leftOperator = getLeft().toString();
      String RightOperator = getRight().toString();
      if (getRight() instanceof Add) {
         RightOperator = "(" + RightOperator + ")";
      }
      return leftOperator.toString() + " < " + RightOperator.toString();
   }

}
