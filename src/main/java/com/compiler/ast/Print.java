package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Print extends Cmd {
   private Expr expr;

   public Print(int line, int column, Expr expr) {
      super(line, column);
      this.expr = expr;

      // System.out.println("Print created" + expr.toString());
   }

   public Expr getExpr() {
      return expr;
   }

   @Override
   public String toString() {
      return expr.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
