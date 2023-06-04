/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Read extends Cmd {
   private LValue lvalue;

   public Read(int line, int column, LValue lvalue) {
      super(line, column);
      this.lvalue = lvalue;
   }

   public String toString() {
      return null;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public LValue getLvalue() {
      return lvalue;
   }

}
