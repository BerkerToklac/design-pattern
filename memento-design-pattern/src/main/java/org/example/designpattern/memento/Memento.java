package org.example.designpattern.memento;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Memento {

    private Object[] elements;

    public Memento(Object[] elements) {
        this.elements = elements;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
