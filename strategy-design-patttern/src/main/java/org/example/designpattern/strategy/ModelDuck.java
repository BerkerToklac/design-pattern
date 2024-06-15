package org.example.designpattern.strategy;

import org.example.designpattern.strategy.behavior.FlyNoWay;
import org.example.designpattern.strategy.behavior.Quack;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override public void display() {
        System.out.println("I'm a model duck");
    }
}
