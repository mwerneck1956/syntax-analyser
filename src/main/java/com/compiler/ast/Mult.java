package com.compiler.ast;

public class Mult extends BinOP {

   public Mult(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("Mult criada :" + l.toString() + " * " + r.toString());
   }

   // @Override
   // public void accept(Visitor v) {v.visit(this);}
}
