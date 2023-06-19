/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class TypeInt extends Node {

   public TypeInt(int line, int col) {
      super(line, col);
   }

   @Override
   public String toString() {
      return "Int";
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
