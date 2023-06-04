/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.HashMap;

public class Declaration {
   private ID id;
   private BasicType type;

   public Declaration(ID id, BasicType type) {
      this.id = id;
      this.type = type;
   }

   public int interpret(HashMap<String, Integer> Variables) {
      return 0;
   }

   public ID getId() {
      return id;
   }

   public String getIdName() {
      return id.getId();
   }

   public BasicType getType() {
      return type;
   }

   @Override
   public String toString() {
      return id + " :: " + type.getType();
   }

}
