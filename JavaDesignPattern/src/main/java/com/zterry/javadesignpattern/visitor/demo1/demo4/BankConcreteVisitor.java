package com.zterry.javadesignpattern.visitor.demo1.demo4;

public class BankConcreteVisitor implements IBankEmployer {

    @Override
    public void accept(BankVisitor bankVisitor) {

    }

    @Override
    public String getName() {
        return "jiedaiyuan";
    }
}
