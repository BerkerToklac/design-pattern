package org.example.designpattern.visitor;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class HPPrinter implements Printer{

    public void accept(Visitor v) {
        v.visit(this);
    }
    public void print() {
        System.out.println(this.toString()
                + " is printing...");
    }
    public String toString() {
        return "HP Printer";
    }

}
