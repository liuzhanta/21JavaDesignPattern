package com.zterry.javadesignpattern.adapter;

public class IPhonePlugin implements IDataPlugin {
    @Override
    public void insert() {
        System.out.println("插入");
    }

    @Override
    public String getName() {
        return "苹果数据线";
    }
}
