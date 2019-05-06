package com.zterry.javadesignpattern.prototype;

public class ProtoType implements Cloneable {


    @Override
    protected ProtoType clone() throws CloneNotSupportedException {
        ProtoType protoType = null;
        protoType = (ProtoType) super.clone();
        return protoType;
    }
}

