package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Sub extends BinOP {

   public Sub(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

   }

   public String toString() {

      String leftOperator = getLeft().toString();
      String RightOperator = getRight().toString();
      if (getRight() instanceof Sub) {
         RightOperator = "(" + RightOperator + ")";
      }
      return leftOperator + " - " + RightOperator;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
