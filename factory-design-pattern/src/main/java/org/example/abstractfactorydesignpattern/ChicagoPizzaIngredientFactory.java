package org.example.abstractfactorydesignpattern;

import org.example.abstractfactorydesignpattern.ingredient.Cheese;
import org.example.abstractfactorydesignpattern.ingredient.Clams;
import org.example.abstractfactorydesignpattern.ingredient.Dough;
import org.example.abstractfactorydesignpattern.ingredient.Pepperoni;
import org.example.abstractfactorydesignpattern.ingredient.Sauce;
import org.example.abstractfactorydesignpattern.ingredient.Veggies;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override public Dough createDough() {
        return null;
    }

    @Override public Sauce createSauce() {
        return null;
    }

    @Override public Cheese createCheese() {
        return null;
    }

    @Override public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override public Pepperoni createPepperoni() {
        return null;
    }

    @Override public Clams createClam() {
        return null;
    }
}
