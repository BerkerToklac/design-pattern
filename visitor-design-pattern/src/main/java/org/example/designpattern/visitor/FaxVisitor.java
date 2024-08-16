package org.example.designpattern.visitor;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class FaxVisitor implements Visitor{
    @Override
    public void visit(HPPrinter p) {
        System.out.println(p.toString() +
                " is faxing...");

    }

    @Override
    public void visit(LexMarkPrinter p) {
        System.out.println(p.toString()
                + " can not fax! " + "(not implemented)");
    }
}
