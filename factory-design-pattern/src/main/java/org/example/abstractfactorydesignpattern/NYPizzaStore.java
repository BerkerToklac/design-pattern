package org.example.abstractfactorydesignpattern;

import org.example.designpattern.factory.Pizza;
import org.example.designpattern.factory.PizzaStore;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class NYPizzaStore extends PizzaStore {
    @Override protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        return null;
    }
}
