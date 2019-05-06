package com.zterry.javadesignpattern.visitor.demo1.demo2;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
