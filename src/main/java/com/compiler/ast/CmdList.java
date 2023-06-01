package com.compiler.ast;

import java.util.HashMap;
import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class CmdList extends Cmd {

   private ArrayList<Cmd> body;

   public CmdList(int line, int column) {
      super(line, column);

      this.body = new ArrayList<Cmd>();
   }

   public void addCommand(Cmd command) {

      // if (command != null)
      // System.out.println("Adicionando commando " + command);

      body.add(command);
   }

   public String toString() {
      // TODO Auto-generated method stub
      return null;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public ArrayList<Cmd> getBody() {
      return body;
   }
}
