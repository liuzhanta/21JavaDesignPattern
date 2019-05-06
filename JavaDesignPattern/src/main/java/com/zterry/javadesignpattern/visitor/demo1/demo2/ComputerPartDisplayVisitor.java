package com.zterry.javadesignpattern.visitor.demo1.demo2;

public class ComputerPartDisplayVisitor extends ComputerPartVisitor {
    @Override
    void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard ");
    }

    @Override
    void visit(Monitor monitor) {
        System.out.println("Displaying monitor ");

    }

    @Override
    void visit(Mouse mouse) {
        System.out.println("Displaying mouse ");

    }

    @Override
    void visit(Computer computer) {
        System.out.println("displaying computer");
    }
}
