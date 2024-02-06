package org.pizzastore;

import org.pizzastore.pizzas.*;

/**
 * This class has only ONE job in life: creating pizzas for its clients
 */
public class SimplePizzaFactory {

    /*
     * We define a createPizza() method in the factory that
     * all clients will use to instatiate new objects.
     */
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        // this code is still parameterized by the type of pizza
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
            return pizza;
    }
}
