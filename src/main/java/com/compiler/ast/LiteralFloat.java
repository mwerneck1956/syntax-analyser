package com.compiler.ast;

import java.util.HashMap;
import com.compiler.visitors.Visitor;

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

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
