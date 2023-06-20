/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.util;

import com.compiler.typeCheckUtils.STyBool;
import com.compiler.typeCheckUtils.STyChar;
import com.compiler.typeCheckUtils.STyErr;
import com.compiler.typeCheckUtils.STyFloat;
import com.compiler.typeCheckUtils.STyInt;
import com.compiler.typeCheckUtils.SType;

public class TypeCheckUtils {
   private STyFloat typeFloat = STyFloat.newSTyFloat();
   private STyBool typeBool = STyBool.newSTyBool();
   private STyErr typeErr = STyErr.newSTyErr();
   private STyInt typeInt = STyInt.newSTyInt();
   private STyChar typeChar = STyChar.newSTyChar();

   public static String createInvalidOperandsErrorMessage(String operator, SType leftType, SType rightType) {
      String errMessage = " Operator " + operator + " do not apply to the types : " + leftType.toString() + " and "
            + rightType.toString();

      return errMessage;

   }

   public static String createEqualErrorMessage(SType leftType, SType rightType) {
      String errMessage = "Cannot compare " + leftType.toString() + " with " + rightType.toString();

      return errMessage;

   }

   public static boolean isInstanceOfNumber(SType type) {
      STyInt typeInt = STyInt.newSTyInt();
      STyFloat typeFloat = STyFloat.newSTyFloat();

      return type.match(typeFloat) || type.match(typeInt);
   }

}
