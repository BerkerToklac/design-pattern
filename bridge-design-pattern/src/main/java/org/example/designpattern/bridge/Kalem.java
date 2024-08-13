package org.example.designpattern.bridge;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Kalem extends Envanter{

    public Kalem(final Uretim uretim) {
        super(uretim);
    }
    @Override
    public void produce() {
        produceKalem();
    }
    public void produceKalem() {
        getUretim().produceKalem();
    }

}
