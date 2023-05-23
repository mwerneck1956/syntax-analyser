package com.compiler.ast;

public class Param {

   private ID id;
   private BasicType type;

   public Param(ID id, BasicType type) {
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

}
