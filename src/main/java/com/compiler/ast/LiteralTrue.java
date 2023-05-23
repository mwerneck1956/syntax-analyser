package com.compiler.ast;

import java.util.HashMap;

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

    @Override
    public int interpret(HashMap<String, Integer> Variables) {
        // TODO Auto-generated method stub
        return 0;
    }
}
