package com.company.pizzafactory.factories;

import com.company.pizzafactory.pizzas.Margheritta;
import com.company.pizzafactory.pizzas.Pizza;

public class MargherittaPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza createPizza() {
        System.out.println("Create margheritta!");
        return new Margheritta(null, 30, 2.5);
    }

    @Override
    public Pizza createPizza(String[] toppingsAdd, int size, double dough) {
        System.out.println("Create margheritta!");
        return new Margheritta(toppingsAdd, size, dough);
    }
}
