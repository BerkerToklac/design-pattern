package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public double cost() {
        return beverage.cost() + .15;
    }

    @Override public String getDescription() {
        return beverage.description + ", Soy";
    }
}
