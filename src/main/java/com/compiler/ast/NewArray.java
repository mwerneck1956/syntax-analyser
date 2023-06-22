/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/
package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class NewArray extends LValue {

   Type type;
   Expr arrayIndexExpr;

   public NewArray(int line, int col, Type type, Expr expr) {
      super(line, col);
      this.type = type;
      this.arrayIndexExpr = expr;
   }

   public String toString() {
      return "New " + this.type;
   }

   public Expr getExpr() {
      return arrayIndexExpr;
   }

   public Type getType() {
      return type;
   }

   public String getTypeName() {
      return type.toString();
   }

   public void setExpr(Expr expr) {
      this.arrayIndexExpr = expr;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   @Override
   public String getId() {
      return null;
   }

}