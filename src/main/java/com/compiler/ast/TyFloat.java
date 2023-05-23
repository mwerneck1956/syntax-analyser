/* 
 * Henrique Colonese Echternarcht - 201835028
 * Regina Sarah Monferrari Amorim de Paula - 201835007
 */

package vast.ast;

import java.util.HashMap;

import vast.visitors.Visitor;

/*
 * Esta classe representa um tipo Float.
 * Expr
 */
public class TyFloat extends BType {
      
      public TyFloat(){ 
            super(new SimpleID("Float"));
      }
      
      public boolean match(BType t){
         return t instanceof TyFloat; 
      }
      
      public String toString(){ return "Float"; }
      
      public void accept(Visitor v){ v.visit(this);}

}
