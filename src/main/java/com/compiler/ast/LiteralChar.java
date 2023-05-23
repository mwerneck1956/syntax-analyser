package com.compiler.ast;

import java.util.HashMap;

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

    @Override
    public int interpret(HashMap<String, Integer> Variables) {
        // TODO Auto-generated method stub
        return 0;
    }

    // @Override
    // public void accept(Visitor v) {v.visit(this);}
}
