package com.compiler.ast;

import com.compiler.visitors.Visitor;

import java.util.HashMap;

public class ID extends LValue {
   private String name;

   public ID(int line, int column, String name) {
      super(line, column);
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   // @Override
   public String toString() {
      return this.name;
   }

   public int interpret(HashMap<String, Integer> variables) {
      return variables.get(name);
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
