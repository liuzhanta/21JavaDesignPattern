package com.zterry.javadesignpattern.visitor.demo1.demo4;

public class BankWindowA implements IBankEmployer {
    @Override
    public void accept(BankVisitor bankVisitor) {
        bankVisitor.visit(this);
    }

    @Override
    public String getName() {
        return "A窗口办理存款";
    }
}
