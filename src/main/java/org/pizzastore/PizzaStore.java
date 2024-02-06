package org.pizzastore;

import org.pizzastore.pizzas.CheesePizza;
import org.pizzastore.pizzas.GreekPizza;
import org.pizzastore.pizzas.PepperoniPizza;
import org.pizzastore.pizzas.Pizza;

public class PizzaStore {

    public String type;

    Pizza orderPizza() {

        Pizza pizza; // type determines the type of pizza

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
