/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class LiteralTrue extends Expr {
    private boolean value;

    public boolean getValue() {
        return value;
    }

    public LiteralTrue(int line, int col) {
        super(line, col);
        this.value = true;
    }

    public String toString() {
        return null;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
