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
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override public Clams createClam() {
        return new FreshClams();
    }
}
