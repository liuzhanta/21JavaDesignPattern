package com.zterry.javadesignpattern.factory;

public class HomeMadeCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new AudiCar();
    }
}
