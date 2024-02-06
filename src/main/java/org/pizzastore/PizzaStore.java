package org.pizzastore;

import org.pizzastore.pizzas.Pizza;

/**
 * This is the client of the factory. PizzaStore now goes through SimplePizzaFactory to get instances of pizza
 */
public class PizzaStore {

    SimplePizzaFactory factory; // we give PizzaStore a reference to a SimplePizzaFactory

    // PizzaStore gets the factory passed to it in the constructor
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public String type;

    Pizza orderPizza() {

        Pizza pizza;
        pizza = factory.createPizza(type); //we replaced the 'new' operator with a createPizza() method in the factory object. NO MORE concrete instatiations here

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
