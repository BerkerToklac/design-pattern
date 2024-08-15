package org.example.designpattern.iterator;

import java.util.ArrayList;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class ArrayListIterator implements Iterator{

    private Oyuncu[] takim;
    private int pozisyon;

    public ArrayListIterator(Oyuncu[] takim) {
        setTakim(takim);
    }

    public Oyuncu[] getTakim() {
        return takim;
    }

    public void setTakim(Oyuncu[] takim) {
        this.takim = takim;
    }

    public int getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(int pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override public Boolean hasNext() {
        if (pozisyon >= getTakim().length ||
                getTakim()[pozisyon] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override public Object next() {
        final Oyuncu oyuncu = getTakim()[pozisyon];
        pozisyon++;
        return oyuncu;
    }
}
