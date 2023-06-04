package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class AttributeAccess extends LValue {
   private LValue leftValue;
   private ID acessId;

   public AttributeAccess(int line, int column, LValue leftValue, ID acesssId) {
      super(line, column);
      this.leftValue = leftValue;
      this.acessId = acesssId;
   }

   public String toString() {
      return this.leftValue.toString() + "." + this.acessId.toString();
   }

   public String getId() {
      return this.acessId.getId();
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public LValue getLeftValue() {
      return leftValue;
   }

   public ID getAcessId() {
      return acessId;
   }
}
