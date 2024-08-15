package org.example.designpattern.state;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Engine {

    private State state;

    public Engine() {
        setState(new EngineOffState());
        System.out.println("Motor kapali.");
    }

    public void start() {
        getState().on(this);
    }
    public void stop() {
        getState().off(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
