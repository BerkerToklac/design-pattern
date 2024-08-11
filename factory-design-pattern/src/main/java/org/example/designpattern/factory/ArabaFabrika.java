package org.example.designpattern.factory;

import java.util.ArrayList;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public abstract class ArabaFabrika {

    private ArrayList<Araba> arabaListesi = new ArrayList<>();

    public ArabaFabrika() {
        createAuto();
    }

    public abstract void createAuto();

    public ArrayList<Araba> getArabaListesi() {
        return arabaListesi;
    }

    public void setArabaListesi(final ArrayList<Araba> arabaListesi) {
        this.arabaListesi = arabaListesi;
    }
}
