package com.company.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Drink coffee1 = new Cream(new Chocolate(new Espresso()));
        System.out.println(coffee1.getDescription());
        System.out.println("price: " + coffee1.calculateCosts());
        Drink coffee2 = new Cream(new Espresso());
        System.out.println(coffee2.getDescription());
        System.out.println("price: " + coffee2.calculateCosts());
        Drink coffee3 = new Espresso();
        System.out.println(coffee3.getDescription());
        System.out.println("price: " + coffee3.calculateCosts());
        Drink coffee4 = new Cream(new Chocolate(new Black()));
        System.out.println(coffee4.getDescription());
        System.out.println("price: " + coffee4.calculateCosts());
    }
}
