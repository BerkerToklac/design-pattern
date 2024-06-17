package org.example.designpattern.decorator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public abstract class Beverage {

    String description = "Unknown Beverage";
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
