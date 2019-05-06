package com.zterry.javadesignpattern.adapter;

public class TypeCAdapter implements IDataPlugin {
    private AndroidPlugin plugin;

    public TypeCAdapter() {
        this.plugin = new AndroidPlugin();
    }

    @Override
    public void insert() {
        plugin.insert();
    }

    @Override
    public String getName() {
        return "typeC接口转换器";
    }
}
