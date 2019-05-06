package com.zterry.javadesignpattern.adapter;

/**
 * 使用iphone手机充电
 */
public class IPhone implements ICharge {
    @Override
    public void charge(String type) {

        IPhonePlugin iPhonePlugin = new IPhonePlugin();
        iPhonePlugin.insert();
        System.out.println("iphone 使用"+iPhonePlugin.getName()+" 充电");
    }
}
