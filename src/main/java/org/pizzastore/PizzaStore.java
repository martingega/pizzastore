package org.pizzastore;

import org.pizzastore.pizzas.Pizza;

/**
 * Each subclass provies an implementation of the createPizza() method, overriding the abstract createPizza() method
 *  in PizzaStore, while all the subclasses make use of the orderPizza() method defined in PizzaStore.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type); // createPizza is back to being a call to a method in the PizzaStore rather than on a factory object

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}
