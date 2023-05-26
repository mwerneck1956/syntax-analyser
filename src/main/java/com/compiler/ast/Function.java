package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;

public class Function extends Cmd {

   private ID id;
   private CmdList body;
   private ArrayList<Param> paramlist;

   // public Function(ID id, CmdList body, ArrayList<Param> paramList) {

   // super(id.getLine(), id.getCol());
   // this.body = body;
   // this.paramlist = paramList;
   // this.id = id;

   // System.out.println("Function created");
   // }

   public Function(ID id, CmdList body) {
      super(id.getLine(), id.getCol());
      this.body = body;
      this.paramlist = null;
      this.id = id;

      System.out.println("Function created without params");

   }

   public String getName() {
      return this.id.getName();
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      System.out.println("(" + this.id.getName() + ")");
      System.out.println("{");

      return null;
   }

   @Override
   public int interpret(HashMap<String, Integer> Variables) {
      // TODO Auto-generated method stub
      return 0;
   }
}
