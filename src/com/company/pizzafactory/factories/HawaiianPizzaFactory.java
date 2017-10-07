package com.company.pizzafactory.factories;

import com.company.pizzafactory.pizzas.Hawaiian;
import com.company.pizzafactory.pizzas.Pizza;

public class HawaiianPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza createPizza() {
        System.out.println("Create hawaiian!");
        return new Hawaiian(null, 30, 2.5);
    }

    @Override
    public Pizza createPizza(String[] toppingsAdd, int size, double dough) {
        System.out.println("Create hawaiian!");
        return new Hawaiian(toppingsAdd, size, dough);
    }


}
