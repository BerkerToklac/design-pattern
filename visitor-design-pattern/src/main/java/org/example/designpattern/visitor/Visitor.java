package org.example.designpattern.visitor;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface Visitor {

    void visit(HPPrinter p);
    void visit(LexMarkPrinter p);
}
