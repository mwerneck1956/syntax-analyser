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

        System.out.println("Literal true criado");

    }

    public String toString() {
        return null;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
