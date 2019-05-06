package com.zterry.javadesignpattern.visitor.demo1.demo2;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
