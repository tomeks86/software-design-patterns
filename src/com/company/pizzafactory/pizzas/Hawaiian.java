package com.company.pizzafactory.pizzas;

public class Hawaiian extends Pizza {
    public Hawaiian(String[] toppingsAdd, int size, double dough) {
        super(size, dough);
        String[] toppings = {"chicken", "ham", "tomatoes", "saussage", "pineapple"};
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
