package org.example.designpattern.strategy;

import org.example.designpattern.strategy.behavior.FlyWithWings;
import org.example.designpattern.strategy.behavior.Quack;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override public void display() {
        System.out.println("I`m a real Mallard duck");
    }
}
