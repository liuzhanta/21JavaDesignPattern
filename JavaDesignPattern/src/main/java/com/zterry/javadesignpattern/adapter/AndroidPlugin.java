package com.zterry.javadesignpattern.adapter;

public class AndroidPlugin implements IDataPlugin {
    @Override
    public void insert() {
        System.out.println("插入");
    }

    @Override
    public String getName() {
        return "普通android数据线";
    }
}
