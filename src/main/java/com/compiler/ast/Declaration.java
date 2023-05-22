package com.compiler.ast;

import java.util.HashMap;

public class Declaration {

   private ID id;
   private String type;

   public Declaration(ID id, String type) {
      this.id = id;
      this.type = type;
   }

   public int interpret(HashMap<String, Integer> Variables) {
      return 0;
   }

   public ID getId() {
      return id;
   }

   public String getType() {
      return type;
   }

}
