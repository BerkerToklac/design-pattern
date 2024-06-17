package org.example.designpattern.observer;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
