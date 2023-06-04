/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Attribution extends Cmd {

   private LValue id;
   private Expr expression;

   public Attribution(int line, int column, LValue id, Expr expression) {
      super(line, column);
      this.id = id;
      this.expression = expression;

   }

   public LValue getID() {
      return id;
   }

   public Expr getExp() {
      return this.expression;
   }

   public String toString() {
      return id.toString() + " = " + expression.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
