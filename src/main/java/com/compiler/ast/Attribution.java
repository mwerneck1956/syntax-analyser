package com.compiler.ast;

import java.util.HashMap;

public class Attribution extends Node {

   private ID id;
   private Expression expression;

   public Attribution(int line, int column, ID id, Expression expression) {
      super(line, column);
      this.id = id;
      this.expression = expression;
   }

   public ID getID() {
      return id;
   }

   public Expression getExp() {
      return this.expression;
   }

   public String toString() {
      return id.toString() + " = " + expression.toString();
   }

   public int interpret(HashMap<String, Integer> m) {
      int x = expression.interpret(m);
      m.put(id.getName(), x);
      return x;
   }
}
