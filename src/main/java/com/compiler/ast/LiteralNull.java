/*  
    Matheus Gomes Luz Werneck (201835037) 
    Pedro Henrique Almeida Cardoso Reis (201835039)
*/

package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class LiteralNull extends Expr {
    private Object value;

    public Object getValue() {
        return value;
    }

    public LiteralNull(int line, int col) {
        super(line, col);
        this.value = null;
    }

    @Override
    public String toString() {
        return "null";
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
