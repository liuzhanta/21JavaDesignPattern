package com.zterry.javadesignpattern.visitor.demo1.demo2;

public class Computer implements ComputerPart {

    ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Keyboard(),new Monitor(),new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(visitor);
        }
    }
}
