package com.company.carfactory;

import com.company.carfactory.cars.CarType;

public class TestCarFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.buildCar(CarType.SEDAN);
        carFactory.buildCar(CarType.LUXURY);
        carFactory.buildCar(CarType.SMALL);
        carFactory.buildCar(CarType.SMALL);
    }
}
