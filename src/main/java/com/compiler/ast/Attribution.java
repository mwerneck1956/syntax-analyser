package com.compiler.ast;

import java.util.HashMap;

public class Attribution extends Cmd {

   private LValue id;
   private Expr expression;

   public Attribution(int line, int column, LValue id, Expr expression) {
      super(line, column);
      this.id = id;
      this.expression = expression;

      System.out.println("Attribution criada" + " " + this.toString());
   }

   public LValue getID() {
      return id;
   }

   public Expr getExp() {
      return this.expression;
   }

   public String toString() {
      return id.toString() + " = " + expression.toString();
   }

   public int interpret(HashMap<String, Integer> m) {
      int x = expression.interpret(m);
      m.put(id.toString(), x);
      return x;
   }
}
