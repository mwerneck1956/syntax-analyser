package com.compiler.ast;

import java.util.HashMap;
import com.compiler.visitors.Visitor;

public class LiteralFalse extends Expr {
    private boolean value;

    public boolean getValue() {
        return value;
    }

    public LiteralFalse(int line, int col) {
        super(line, col);
        this.value = false;

    }

    @Override
    public String toString() {
        return "" + this.value;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
