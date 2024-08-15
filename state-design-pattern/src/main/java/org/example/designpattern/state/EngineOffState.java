package org.example.designpattern.state;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class EngineOffState implements State {

    @Override
    public void on(Engine engine) {
        engine.setState(new EngineOnState());
        System.out.println("Motor çalıştı...");
    }

    @Override
    public void off(Engine engine) {
        System.out.println("Motor kapalı durumda!");
    }
}
