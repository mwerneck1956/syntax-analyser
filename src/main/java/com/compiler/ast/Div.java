package com.compiler.ast;

//mexp DIV sexp #div
public class Div extends BinOP {

   public Div(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("Div criada :" + l.toString() + " / " + r.toString());
   }

   // @Override
   // public void accept(Visitor v) {v.visit(this);}
}
