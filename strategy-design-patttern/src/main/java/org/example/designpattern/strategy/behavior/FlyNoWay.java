package org.example.designpattern.strategy.behavior;

import org.example.designpattern.strategy.FlyBehavior;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class FlyNoWay implements FlyBehavior {
    @Override public void fly() {
        System.out.println("I can't fly");
    }
}
