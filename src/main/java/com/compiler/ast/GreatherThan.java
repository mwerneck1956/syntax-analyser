/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class GreatherThan extends BinOP {

   public GreatherThan(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);
   }

   public String toString() {
      String leftOperator = getLeft().toString();
      String RightOperator = getRight().toString();
      if (getRight() instanceof Add) {
         RightOperator = "(" + RightOperator + ")";
      }
      return leftOperator.toString() + " > " + RightOperator.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
