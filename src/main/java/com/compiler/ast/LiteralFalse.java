package com.compiler.ast;

import java.util.HashMap;

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

    @Override
    public int interpret(HashMap<String, Integer> Variables) {

        return 0;
    }
}
