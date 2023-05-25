package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;

public class Function extends Cmd {

   private ID id;
   private ArrayList<Cmd> body;
   private ArrayList<Param> paramlist;

   public Function(ID id, ArrayList<Cmd> body, ArrayList<Param> paramList) {
      super(id.getLine(), id.getCol());
      this.body = body;
      this.paramlist = paramList;
   }

   @Override
   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public int interpret(HashMap<String, Integer> Variables) {
      // TODO Auto-generated method stub
      return 0;
   }
}
