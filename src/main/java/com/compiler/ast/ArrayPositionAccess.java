package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class ArrayPositionAccess extends LValue {
   private LValue leftValue;
   private Expr positionExpr;

   public ArrayPositionAccess(int line, int column, LValue leftValue, Expr positionExpr) {
      super(line, column);
      this.leftValue = leftValue;
      this.positionExpr = positionExpr;
   }

   public String toString() {
      return this.leftValue.toString() + "[" + this.positionExpr.toString() + "]";
   }

   public String getId() {
      return this.leftValue.getId();
   }

   public LValue getLeftValue() {
      return leftValue;
   }

   public Expr getPositionExpr() {
      return positionExpr;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
