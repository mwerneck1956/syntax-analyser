package com.compiler.ast;

import java.util.HashMap;

public class LiteralFloat extends Expr {
    private float value;

    public LiteralFloat(int line, int col, float value) {
        super(line, col);
        this.value = value;
    }

    public float getValue() {
        return value;
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
}
