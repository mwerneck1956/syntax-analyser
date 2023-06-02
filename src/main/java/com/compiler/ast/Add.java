package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Add extends BinOP {

   public Add(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

   }

   public String toString() {
      String leftOperator = getLeft().toString();
      String RightOperator = getRight().toString();
      if (getRight() instanceof Add) {
         RightOperator = "(" + RightOperator + ")";
      }
      return leftOperator + " + " + RightOperator;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
