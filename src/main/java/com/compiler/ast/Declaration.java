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

   public BasicType getType() {
      return type;
   }

   @Override
   public String toString() {
      return id + " :: " + type.getType();
   }

}