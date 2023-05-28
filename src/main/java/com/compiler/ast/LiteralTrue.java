package com.compiler.ast;

import java.util.HashMap;
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
        // TODO Auto-generated method stub
        return null;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
