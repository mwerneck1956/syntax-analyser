package com.compiler.ast;

import com.compiler.visitors.Visitor;

public class LiteralChar extends Expr {
    private String value;

    public String getValue() {
        return value;
    }

    public LiteralChar(int line, int col, String value) {
        super(line, col);
        this.value = value;
    }

    @Override
    public String toString() {

        return "" + this.value;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
