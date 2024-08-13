package org.example.designpattern.bridge;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class UretimImpl2 implements Uretim{

    final Fabrika1 fabrika1 = new Fabrika1();
    @Override public void produceDefter() {
        fabrika1.produceKareliDefter();
    }

    @Override public void produceKalem() {
        fabrika1.produceTukenmezKalem();
    }
}
