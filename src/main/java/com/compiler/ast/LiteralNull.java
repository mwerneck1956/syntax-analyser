package com.compiler.ast;

import java.util.HashMap;

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

    @Override
    public int interpret(HashMap<String, Integer> Variables) {
        // TODO Auto-generated method stub
        return 0;
    }
}
