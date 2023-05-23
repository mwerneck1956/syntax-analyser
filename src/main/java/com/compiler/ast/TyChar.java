package vast.ast;

import java.util.HashMap;

import vast.visitors.Visitor;

public class Char {

      public TyChar(){
            super(new SimpleID("Char"));
      }

      public boolean match(BType t) {
            return t instanceof TyChar;
      }

      public String toString() {
            return "Char";
      }

      public void accept(Visitor v) {
            v.visit(this);
      }

}
