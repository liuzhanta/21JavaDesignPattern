package com.zterry.javadesignpattern.visitor.demo1.demo2;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
