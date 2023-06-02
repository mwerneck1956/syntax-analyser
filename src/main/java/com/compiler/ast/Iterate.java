package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class Iterate extends Cmd {

   private Expr condition;
   private Cmd body;

   public Iterate(int line, int column, Expr condition, Cmd body) {
      super(line, column);

      this.condition = condition;
      this.body = body;
   }

   @Override
   public String toString() {
      return null;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public Expr getCondition() {
      return condition;
   }

   public Cmd getBody() {
      return body;
   }
}
