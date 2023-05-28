package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;

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

   public String getName() {
      return this.id.getName();
   }

   @Override
   public String toString() {
      System.out.println("(" + this.id.getName() + ")");
      System.out.println("{");

      return "";
   }

   @Override
   public int interpret(HashMap<String, Integer> Variables) {
      // TODO Auto-generated method stub
      return 0;
   }
}
