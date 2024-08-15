package org.example.designpattern.iterator;


/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class AnadoluEfes implements Takim{

    private Oyuncu[] takim = new Oyuncu[5];

    public AnadoluEfes() {
        takim[0] = new Oyuncu("Drew", 4);
        takim[1] = new Oyuncu("Ender", 6);
        takim[2] = new Oyuncu("Cenk", 7);
        takim[3] = new Oyuncu("Kerem", 12);
        takim[4] = new Oyuncu("Loren", 15);
    }

    public Oyuncu[] getTakim() {
        return takim;
    }

    public void setTakim(Oyuncu[] takim) {
        this.takim = takim;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayListIterator(getTakim());
    }
}
