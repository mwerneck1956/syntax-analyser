/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.util;

import com.compiler.ast.BinOP;
import com.compiler.typeCheckUtils.SType;

public class TypeCheckUtils {
   public static boolean isInteger(String input) {
      try {
         Integer.parseInt(input);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }

}
