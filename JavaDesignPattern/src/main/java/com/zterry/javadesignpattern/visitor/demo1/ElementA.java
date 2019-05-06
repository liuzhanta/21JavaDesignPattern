package com.zterry.javadesignpattern.visitor.demo1;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
