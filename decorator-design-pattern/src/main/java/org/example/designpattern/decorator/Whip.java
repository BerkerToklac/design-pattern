package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public double cost() {
        return .10 + beverage.cost();
    }

    @Override public String getDescription() {
        return beverage.description + ", Whip";
    }
}
