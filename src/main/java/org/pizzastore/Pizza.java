package org.pizzastore;

public class Pizza {

    public void prepare() {
        System.out.println("Roll the dough.");
        System.out.println("Put on the sauce.");
        System.out.println("Add the toppings.");
    }

    public void bake() {
        System.out.println("Put the prepared pizza inside the oven.");
    }

    public void cut() {
        System.out.println("Cut the baked pizza in slices.");
    }

    public void box() {
        System.out.println("Put the sliced pizza inside the box.");
    }
}
