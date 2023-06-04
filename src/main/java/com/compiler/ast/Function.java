package com.compiler.ast;

import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class Function extends Cmd {

   private ID id;
   private CmdList body;
   private ArrayList<Param> paramlist;
   private ArrayList<BasicType> returns;

   public Function(ID id) {
      super(id.getLine(), id.getCol());
      this.body = null;
      this.paramlist = new ArrayList<Param>();
      this.id = id;
      this.returns = new ArrayList<BasicType>();
   }

   public String getName() {
      return this.id.getName();
   }

   @Override
   public String toString() {
      System.out.println("(" + this.id.getName() + ")");
      System.out.println("{");

      return "";
   }

   public Boolean isQuantityOfParamsValid(int receivedParams) {
      return receivedParams == this.paramlist.size();
   }

   public void setParamlist(ArrayList<Param> paramlist) {
      this.paramlist = paramlist;
   }

   public ArrayList<Param> getParamlist() {
      return paramlist;
   }

   public void addReturn(BasicType type) {
      this.returns.add(type);

   }

   public void setBody(CmdList body) {
      this.body = body;
   }

   public CmdList getBody() {
      return body;
   }

   public ArrayList<BasicType> getReturns() {
      return returns;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

}
