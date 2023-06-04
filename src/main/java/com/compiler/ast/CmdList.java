/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import java.util.ArrayList;
import com.compiler.visitors.Visitor;

public class CmdList extends Cmd {

   private ArrayList<Cmd> body;

   public CmdList(int line, int column) {
      super(line, column);

      this.body = new ArrayList<Cmd>();
   }

   public void addCommand(Cmd command) {

      body.add(command);
   }

   public String toString() {
      return null;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }

   public ArrayList<Cmd> getBody() {
      return body;
   }
}
