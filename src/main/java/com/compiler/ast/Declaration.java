/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.HashMap;

public class Declaration {
   private ID id;
   private Type type;

   public Declaration(ID id, Type type) {
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

   public Type getType() {
      return type;
   }

   @Override
   public String toString() {
      return id + " :: " + type.toString();
   }

}
