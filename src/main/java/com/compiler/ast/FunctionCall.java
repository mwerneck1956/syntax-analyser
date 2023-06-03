package com.compiler.ast;

import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class FunctionCall extends Cmd {
   private String functionName;
   private ArrayList<Expr> params;
   private ArrayList<LValue> ReturnsId;

   public FunctionCall(int line, int column, String functionName) {
      super(line, column);
      this.functionName = functionName;
      this.params = new ArrayList<Expr>();
      this.ReturnsId = new ArrayList<LValue>();
   }

   public void addParams(ArrayList<Expr> lvalue) {
      this.params = lvalue;
   }

   public void addReturn(LValue returnId) {
      this.ReturnsId.add(returnId);
   }

   public String getFunctionName() {
      return functionName;
   }

   @Override
   public String toString() {
      return "";
   }

   public ArrayList<Expr> getParams() {
      return params;
   }

   public ArrayList<LValue> getReturnsId() {
      return ReturnsId;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
