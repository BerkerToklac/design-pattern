package org.example.designpattern.strategy.behavior;

import org.example.designpattern.strategy.FlyBehavior;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class FlyWithWings implements FlyBehavior {
    @Override public void fly() {
        System.out.println("I' m flying!!");
    }
}
