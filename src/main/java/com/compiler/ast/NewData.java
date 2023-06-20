/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class NewData extends LValue {

   Type type;
   Expr expr;

   public NewData(int line, int col, Type type) {
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

   public Type getType() {
      return type;
   }

   public String getTypeName() {
      return type.toString();
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