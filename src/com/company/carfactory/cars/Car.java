package com.company.carfactory.cars;

public abstract class Car {
    private CarType model;

    public Car(CarType model) {
        this.model = model;
    }

    public abstract void construct();
}
