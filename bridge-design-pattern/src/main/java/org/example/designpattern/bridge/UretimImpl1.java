package org.example.designpattern.bridge;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class UretimImpl1 implements Uretim{

    final Fabrika2 fabrika2 = new Fabrika2();
    @Override
    public void produceDefter() {
        fabrika2.produceMuzikDefteri();
    }

    @Override
    public void produceKalem() {
        fabrika2.produceKursunKalem();
    }
}
