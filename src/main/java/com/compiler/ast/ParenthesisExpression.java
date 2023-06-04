/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class ParenthesisExpression extends LValue {

   Expr expr;

   public ParenthesisExpression(int line, int col, Expr expr) {
      super(line, col);
      this.expr = expr;

      System.out.println("Pexp criada" + this.toString());
   }

   public String toString() {

      return "(" + expr + ')';
   }

   @Override
   public String getId() {
      return null;
   }

   public Expr getExpr() {
      return expr;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}