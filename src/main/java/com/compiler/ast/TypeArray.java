/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class TypeArray extends Type {

   Type type;

   public TypeArray(int line, int col, Type t) {
      super(line, col);
      this.type = t;
   }

   @Override
   public String toString() {
      return "Int";
   }

   public boolean match(Type t) {
      return t instanceof TypeInt;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
