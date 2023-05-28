package com.compiler.visitors;

public interface Visitable {
    public void accept(Visitor visitor);
}
