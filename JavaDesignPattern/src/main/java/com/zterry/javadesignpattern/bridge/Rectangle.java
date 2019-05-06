package com.zterry.javadesignpattern.bridge;

public class Rectangle extends Shape {
    @Override
    public void draw(IColor color) {
        System.out.println("draw " + color.getColor() + " Rectangle");
    }
}
