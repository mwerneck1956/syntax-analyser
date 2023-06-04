/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Param extends Node {

   private ID id;
   private BasicType type;

   public Param(ID id, BasicType type) {
      super(id.getLine(), id.getCol());
      this.id = id;
      this.type = type;
   }

   public ID getId() {
      return id;
   }

   public BasicType getType() {
      return type;
   }

   @Override
   public String toString() {
      return id.toString() + "::" + type.toString();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
