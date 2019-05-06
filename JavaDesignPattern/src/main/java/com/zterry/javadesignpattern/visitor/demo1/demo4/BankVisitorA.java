package com.zterry.javadesignpattern.visitor.demo1.demo4;

public class BankVisitorA implements BankVisitor {
    @Override
    public void visit(BankWindowA windowA) {
        System.out.println(windowA.getName());
    }

    @Override
    public void visit(BankWindowB windowB) {
        System.out.println(windowB.getName());
    }

    @Override
    public void visit(BankWindowC windowC) {
        System.out.println(windowC.getName());
    }
}
