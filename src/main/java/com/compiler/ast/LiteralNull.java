package com.compiler.ast;

import java.util.HashMap;
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
