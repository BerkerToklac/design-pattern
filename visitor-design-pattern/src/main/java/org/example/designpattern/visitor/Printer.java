package org.example.designpattern.visitor;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface Printer {

    void print();

    void accept(Visitor v);
}
