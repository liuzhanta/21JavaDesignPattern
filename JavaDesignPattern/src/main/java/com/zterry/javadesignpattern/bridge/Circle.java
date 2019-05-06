package com.zterry.javadesignpattern.bridge;

public class Circle extends Shape {
    @Override
    public void draw(IColor color) {
        System.out.println("draw "+color.getColor()+" circle");
    }
}
