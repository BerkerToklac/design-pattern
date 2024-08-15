package org.example.designpattern.iterator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Oyuncu {

    private String isim;

    private int number;

    public Oyuncu(String isim, int number) {
        this.isim = isim;
        this.number = number;
    }

    public String getIsim() {
        return isim;
    }

    public void setName(String isim) {
        this.isim = isim;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
