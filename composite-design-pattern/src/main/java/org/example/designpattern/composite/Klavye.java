package org.example.designpattern.composite;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Klavye implements Parca{
    public Klavye() {
        super();
    }

    @Override public int fiyatiNedir() {
        return 50;
    }
}
