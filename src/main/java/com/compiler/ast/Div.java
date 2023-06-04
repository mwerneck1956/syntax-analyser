/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Div extends BinOP {

   public Div(int line, int col, Expr l, Expr r) {
      super(line, col, l, r);

      System.out.println("Div criada :" + l.toString() + " / " + r.toString());
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
