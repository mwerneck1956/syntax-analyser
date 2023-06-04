package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class NewData extends LValue {

   BasicType type;
   Expr expr;

   public NewData(int line, int col, BasicType type) {
      super(line, col);
      this.type = type;
      this.expr = null;

   }

   public String toString() {
      return "New " + this.type;
   }

   public Expr getExpr() {
      return expr;
   }

   public BasicType getType() {
      return type;
   }

   public String getTypeName() {
      return type.getType();
   }

   public void setExpr(Expr expr) {
      this.expr = expr;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   @Override
   public String getId() {
      // TODO Auto-generated method stub
      return null;
   }

}