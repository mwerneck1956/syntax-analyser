package com.compiler.ast;

import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class Function extends Cmd {

   private ID id;
   private CmdList body;
   private ArrayList<Param> paramlist;

   public Function(ID id, CmdList body) {
      super(id.getLine(), id.getCol());
      this.body = body;
      this.paramlist = null;
      this.id = id;
   }

   public Function(ID id, CmdList body, ArrayList<Param> params) {
      super(id.getLine(), id.getCol());
      this.body = body;
      this.paramlist = params;
      this.id = id;

      System.out.println("Params : " + this.paramlist.toString());
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

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public CmdList getBody() {
      return body;
   }
}
