package com.zterry.javadesignpattern.adapter;

import java.lang.reflect.Proxy;

/**
 * 使用普通接口的Android手机
 */
public class NormalAndroidPhone implements ICharge {
    @Override
    public void charge(String type) {
        if (type.equals("xiaomi_note")) {
            AndroidPlugin androidPlugin = new AndroidPlugin();
            androidPlugin.insert();
            System.out.println(type + " 使用 " + androidPlugin.getName() + " 充电");
        } else if (type.equals("xiaomi9")) {
            TypeCAdapter typeCAdapter = new TypeCAdapter();
            typeCAdapter.insert();
            System.out.println(type + " 使用 " + typeCAdapter.getName() + " 充电");
        }
    }
}
