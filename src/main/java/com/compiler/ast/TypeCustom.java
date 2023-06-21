/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class TypeCustom extends Type {

   private String typeName;

   public TypeCustom(int line, int col, String typeName) {
      super(line, col);

      this.typeName = typeName;
   }

   @Override
   public String toString() {
      return this.typeName;
   }

   public boolean match(Type t) {
      return t instanceof TypeFloat;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public String getTypeName() {
      return typeName;
   }

}
