package org.example.designpattern.memento;

import java.util.ArrayList;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Dokument {

    private ArrayList<String> satirlar = new ArrayList<>();

    public void addSatir(final int index, final String satır) {
        getSatirlar().add(index, satır);
    }
    public void removeSatir(final int index) {
        getSatirlar().remove(index);
    }
    public Memento createMemento() {
        return new Memento(getSatirlar().toArray());
    }
    public void setMemento(final Memento memento) {
        getSatirlar().clear();
        final Object[] tempSatirlar = memento.getElements();
        for (int i = 0; i < tempSatirlar.length; i++) {
            final String satır = (String) tempSatirlar[i];
            getSatirlar().add(satır);
        }
    }
    @Override
    public String toString() {
        final StringBuilder temp = new StringBuilder();
        for (int i = 0; i < getSatirlar().size(); i++) {
            temp.append(getSatirlar().get(i)).append(" \n");
        }
        return temp.toString();
    }
    public ArrayList<String> getSatirlar() {
        return satirlar;
    }
    public void setSatirlar(final ArrayList<String> satirlar) {
        this.satirlar = satirlar;
    }

}
