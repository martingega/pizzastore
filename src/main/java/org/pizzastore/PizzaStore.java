package org.pizzastore;

import org.pizzastore.pizzas.CheesePizza;
import org.pizzastore.pizzas.GreekPizza;
import org.pizzastore.pizzas.PepperoniPizza;
import org.pizzastore.pizzas.Pizza;

public class PizzaStore {

    public String type;

    Pizza orderPizza() {

        Pizza pizza; // type determines the type of pizza

        /*
         * Based on the type of pizza, we instantiate the correct conrete class
         * and assign it to the pizza instance variable. Note that each pizza
         * has to implement the Pizza interface.
         */
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else
            pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
