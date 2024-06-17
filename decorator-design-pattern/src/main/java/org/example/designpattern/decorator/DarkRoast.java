package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class DarkRoast extends Beverage {
    @Override public double cost() {
        return .99;
    }
}
