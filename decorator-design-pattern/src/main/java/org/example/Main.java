package org.example;

import org.example.designpattern.decorator.Beverage;
import org.example.designpattern.decorator.DarkRoast;
import org.example.designpattern.decorator.Espresso;
import org.example.designpattern.decorator.HouseBlend;
import org.example.designpattern.decorator.Mocha;
import org.example.designpattern.decorator.Soy;
import org.example.designpattern.decorator.Whip;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage.getDescription() + " $" + beverage2.cost());
    }
}