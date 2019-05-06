package com.zterry.javadesignpattern.visitor.demo1.demo4;

public interface IBankEmployer {
    void accept(BankVisitor bankVisitor);
    String getName();
}
