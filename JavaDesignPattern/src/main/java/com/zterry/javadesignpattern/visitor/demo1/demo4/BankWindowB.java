package com.zterry.javadesignpattern.visitor.demo1.demo4;

public class BankWindowB implements IBankEmployer {
    @Override
    public void accept(BankVisitor bankVisitor) {
        bankVisitor.visit(this);
    }

    @Override
    public String getName() {
        return "B窗口办理取款";
    }
}
