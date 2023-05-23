/* 
 * Henrique Colonese Echternarcht - 201835028
 * Regina Sarah Monferrari Amorim de Paula - 201835007
 */

package vast.ast;

import java.util.HashMap;

import vast.visitors.Visitor;

/*
 * Esta classe representa um tipo Inteiro.
 * Expr
 */
public class TyInt extends BType {
      
      private String tipo;

      public TyInt(){
            super(new SimpleID("Int"));
      }

      public String getTipo(){ return tipo;}
      
      public boolean match(BType t){
         return t instanceof TyInt; 
      }
      
      public String toString(){ return "Int"; }
      
      public void accept(Visitor v){ v.visit(this);}

}
