package org.example.designpattern.state;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class EngineOnState implements State{
    @Override
    public void on(Engine engine) {
        System.out.println("Motor calisti!");
    }

    @Override
    public void off(Engine engine) {
        engine.setState(new EngineOffState());
        System.out.println("Motor kapalı durumda!");
    }
}
