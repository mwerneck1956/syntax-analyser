package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class BasicType extends Node {
   private String type;

   public BasicType(int line, int col, String type) {
      super(line, col);
      this.type = type;
   }

   public String getType() {
      return type;
   }

   @Override
   public String toString() {
      return type;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
