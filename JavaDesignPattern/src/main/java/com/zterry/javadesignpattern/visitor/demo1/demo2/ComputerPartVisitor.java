package com.zterry.javadesignpattern.visitor.demo1.demo2;

public abstract class ComputerPartVisitor {

    abstract void visit(Keyboard keyboard);

    abstract void visit(Monitor monitor);

    abstract void visit(Mouse mouse);

    abstract void visit(Computer computer);
}
