package org.example.designpattern.bridge;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Defter extends Envanter{

    public Defter(final Uretim uretim) {
        super(uretim);
    }
    @Override
    public void produce() {
        produceDefter();
    }
    public void produceDefter() {
        getUretim().produceDefter();
    }
}
