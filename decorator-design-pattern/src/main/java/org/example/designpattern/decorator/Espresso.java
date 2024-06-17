package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override public double cost() {
        return 1.99;
    }

}
