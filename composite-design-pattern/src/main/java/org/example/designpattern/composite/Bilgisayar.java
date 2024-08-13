package org.example.designpattern.composite;

import java.util.ArrayList;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Bilgisayar implements Parca{

    private ArrayList<Parca> parcaList = new ArrayList<>();
    public void parcaEkle(final Parca parca) {
        getParcaList().add(parca);
    }

    public void parcaSil(final Parca parca) {
        if (getParcaList().contains(parca)) {
            getParcaList().remove(parca);
        }
    }

    public ArrayList<Parca> getParcaList() {
        return parcaList;
    }

    public void setParcaList(ArrayList<Parca> parcaList) {
        this.parcaList = parcaList;
    }

    @Override
    public int fiyatiNedir() {
        int fiyat = 0;
        for (int i = 0; i < getParcaList().size(); i++) {
            fiyat += getParcaList().get(i).fiyatiNedir();
        }
        return fiyat;

    }
}
