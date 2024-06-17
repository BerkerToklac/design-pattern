package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Decaf extends Beverage {
    @Override public double cost() {
        return 1.05;
    }
}
