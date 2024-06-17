package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class SteamedMilk extends CondimentDecorator{
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override public double cost() {
        return beverage.cost() + .10;
    }

    @Override public String getDescription() {
        return beverage.description + ", Steamed Milk";
    }
}
