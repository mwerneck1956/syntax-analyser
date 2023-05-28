package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;
import com.compiler.visitors.Visitor;

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

   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
