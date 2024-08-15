package org.example.designpattern.state;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface State {

    void on(Engine engine);
    void off(Engine engine);
}
