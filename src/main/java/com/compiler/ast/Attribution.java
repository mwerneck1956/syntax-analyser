package com.compiler.ast;

import com.compiler.visitors.Visitor;

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

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
