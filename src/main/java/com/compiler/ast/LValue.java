/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

public abstract class LValue extends Expr {
   public LValue(int line, int column) {
      super(line, column);
   }

   public abstract String getId();
}
