package org.example.designpattern.strategy.behavior;

import org.example.designpattern.strategy.QuackBehavior;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class MuteQuack implements QuackBehavior {
    @Override public void quack() {
        System.out.println("<<Silence>>");
    }
}
