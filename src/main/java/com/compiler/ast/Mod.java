/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Mod extends BinOP {

   public Mod(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);
   }

   public String toString() {

      String leftOperator = getLeft().toString();
      String rightOperator = getRight().toString();
      if (getRight() instanceof Sub) {
         rightOperator = "(" + rightOperator + ")";
      }
      return leftOperator + " - " + rightOperator;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
