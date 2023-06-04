package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Mult extends BinOP {

   public Mult(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
