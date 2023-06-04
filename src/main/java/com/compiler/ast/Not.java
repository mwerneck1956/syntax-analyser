package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Not extends Expr {

   private Expr expression;

   public Not(int line, int col, Expr expr) {
      super(line, col);
      this.expression = expr;
   }

   public String toString() {

      return "!" + this.expression.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public Expr getExpression() {
      return expression;
   }
}
