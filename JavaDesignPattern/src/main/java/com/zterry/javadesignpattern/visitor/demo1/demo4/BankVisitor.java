package com.zterry.javadesignpattern.visitor.demo1.demo4;

public interface BankVisitor {
    void visit(BankWindowA windowA);
    void visit(BankWindowB windowB);
    void visit(BankWindowC windowC);
}
