package com.company.pizzafactory.pizzas;

public class Pepperoni extends Pizza {
    public Pepperoni(String[] toppingsAdd, int size, double dough) {
        super(size, dough);
        String[] toppings = {"tomatoes", "saussage", "salami" ,"pepper"};
        for (String topping : toppings) {
            this.addTopping(topping);
        }
        if (toppingsAdd != null) {
            for (String topping : toppingsAdd) {
                this.addTopping(topping);
            }
        }
    }
}
