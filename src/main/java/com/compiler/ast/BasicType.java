package com.compiler.ast;

import java.util.HashMap;

public class BasicType extends Node {
   private String type;

   public BasicType(int line, int col, String type) {
      super(line, col);
      this.type = type;
   }

   public String getType() {
      return type;
   }

   public int interpret(HashMap<String, Integer> Variables) {
      return 0;
   }

}
