package org.example.designpattern.command;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Kumanda {

    public Komut[] tus = new Komut[2];

    public Kumanda() {
        final Televizyon tv = new Televizyon();
        tus[0] = new TvAcKomutu(tv);
        tus[1] = new TvKapatKomutu(tv);
    }

    public void tusla(final int i) {
        if (i > tus.length || i < 0) {
            throw new RuntimeException("" + "Tus gecersiz!");
        }
        tus[i].execute();
    }

}
