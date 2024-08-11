package org.example;

import org.example.designpattern.strategy.Duck;
import org.example.designpattern.strategy.MallardDuck;
import org.example.designpattern.strategy.ModelDuck;
import org.example.designpattern.strategy.behavior.FlyRocketPowered;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}