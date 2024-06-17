package org.example.designpattern.observer;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface Observer {
    public void update(float temparature, float humidity, float pressure);
}
