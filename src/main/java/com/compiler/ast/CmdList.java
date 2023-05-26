package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;

public class CmdList extends Cmd {

   private Expr condition;
   private ArrayList<Cmd> body;

   public CmdList(int line, int column) {
      super(line, column);

      this.body = new ArrayList<Cmd>();

      System.out.println("Command list created");
   }

   public void addCommand(Cmd command) {
      body.add(command);
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
