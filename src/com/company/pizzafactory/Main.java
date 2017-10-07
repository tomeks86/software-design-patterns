package com.company.pizzafactory;

import com.company.pizzafactory.factories.HawaiianPizzaFactory;
import com.company.pizzafactory.factories.MargherittaPizzaFactory;
import com.company.pizzafactory.factories.PizzaCreator;
import com.company.pizzafactory.pizzas.Pizza;

public class Main {

    public static void main(String[] args) {
        PizzaCreator pizzaCreator = new PizzaCreator();
        String[] topMarg1 = {"mushrooms"};
        Pizza order1 = pizzaCreator.getPizza(new MargherittaPizzaFactory());// (topMarg1, 35, 1.5));
        order1.addTopping("cheese");
        Pizza order2 = pizzaCreator.getPizza(new HawaiianPizzaFactory());
        order2.setDough(3);
        order1.listPizzaParameters();
        order2.listPizzaParameters();
        //System.out.println(order2.getDough());
        //pizzaCreator.getPizza(new PepperoniPizzaFactory());
    }
}
