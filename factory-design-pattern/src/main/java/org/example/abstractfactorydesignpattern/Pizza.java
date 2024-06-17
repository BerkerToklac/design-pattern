package org.example.abstractfactorydesignpattern;

import org.example.abstractfactorydesignpattern.ingredient.Cheese;
import org.example.abstractfactorydesignpattern.ingredient.Clams;
import org.example.abstractfactorydesignpattern.ingredient.Dough;
import org.example.abstractfactorydesignpattern.ingredient.Pepperoni;
import org.example.abstractfactorydesignpattern.ingredient.Sauce;
import org.example.abstractfactorydesignpattern.ingredient.Veggies;

import java.util.ArrayList;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
