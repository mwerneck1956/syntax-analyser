package com.compiler.typeCheckUtils;

public class STyArray extends SType {

    private SType type;

    public STyArray(SType type) {
        this.type = type;

    }

    @Override
    public String toString() {
        return type.toString() + "[]";

    }

    @Override
    public boolean match(SType v) {
        return (v instanceof STyErr) || (v instanceof STyArray) && (type.match(((STyArray) v).getType()));
    }

    public SType getType() {
        return type;
    }
}
