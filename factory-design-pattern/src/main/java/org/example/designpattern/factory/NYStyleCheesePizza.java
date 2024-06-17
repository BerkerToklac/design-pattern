package org.example.designpattern.factory;

import org.example.designpattern.factory.Pizza;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
