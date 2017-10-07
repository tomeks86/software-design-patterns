package com.company.pizzafactory.factories;

import com.company.pizzafactory.pizzas.Pepperoni;
import com.company.pizzafactory.pizzas.Pizza;

public class PepperoniPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza createPizza() {
        System.out.println("Create pepperoni!");
        return new Pepperoni(null, 30, 2.5);
    }

    @Override
    public Pizza createPizza(String[] toppingsAdd, int size, double dough) {
        System.out.println("Create pepperoni!");
        return new Pepperoni(toppingsAdd, size, dough);
    }
}
