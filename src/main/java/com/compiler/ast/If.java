package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class If extends Cmd {

   private Expr condition;
   private Cmd then;
   private Cmd onElse;

   public If(int line, int column, Expr condition, Cmd then, Cmd onElse) {
      super(line, column);

      this.condition = condition;
      this.then = then;
      this.onElse = onElse;

   }

   public If(int line, int column, Expr condition, Cmd then) {
      super(line, column);

      this.condition = condition;
      this.then = then;
      this.onElse = null;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

   public Expr getCondition() {
      return condition;
   }

   public Cmd getThen() {
      return then;
   }

   public Cmd getOnElse() {
      return onElse;
   }

   public void setOnElse(Cmd onElse) {
      this.onElse = onElse;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
