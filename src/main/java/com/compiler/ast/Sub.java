package com.compiler.ast;

public class Sub extends BinOP {

   public Sub(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("Minus created created" + l.toString() + " - " + r.toString());
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
