package com.company.pizzafactory.pizzas;

public class Margheritta extends Pizza {
    public Margheritta(String[] toppingsAdd, int size, double dough) {
        super(size, dough);
        String[] toppings = {"tomatoes", "parmesane", "biasilic" ,"pepper", "cheese"};
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
