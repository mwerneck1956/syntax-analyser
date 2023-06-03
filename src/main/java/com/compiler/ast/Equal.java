package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Equal extends BinOP {

   public Equal(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

   }

   public String toString() {
      String leftOperator = getLeft().toString();
      String RightOperator = getRight().toString();
      if (getRight() instanceof Add) {
         RightOperator = "(" + RightOperator + ")";
      }
      return leftOperator.toString() + " == " + RightOperator.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
