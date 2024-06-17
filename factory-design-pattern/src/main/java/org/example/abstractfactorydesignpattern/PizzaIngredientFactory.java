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
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
