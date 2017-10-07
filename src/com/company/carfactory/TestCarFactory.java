package com.company.carfactory;

import com.company.carfactory.cars.CarType;

public class TestCarFactory {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.buildCar(CarType.SEDAN));
        System.out.println(carFactory.buildCar(CarType.LUXURY));
        System.out.println(carFactory.buildCar(CarType.SMALL));
    }
}
