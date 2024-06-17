package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public double cost() {
        return .20 + beverage.cost();
    }

    @Override public String getDescription() {
        return beverage.description + ", Mocha";
    }
}
