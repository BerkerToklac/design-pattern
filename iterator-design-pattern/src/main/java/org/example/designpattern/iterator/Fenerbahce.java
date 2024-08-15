package org.example.designpattern.iterator;


/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Fenerbahce implements Takim{

    private Oyuncu[] takım = new Oyuncu[5];

    public Oyuncu[] getTakım() {
        return takım;
    }

    public void setTakım(Oyuncu[] takım) {
        this.takım = takım;
    }

    public Fenerbahce() {
        takım[0] = new Oyuncu("Ismail", 4);
        takım[1] = new Oyuncu("Willie", 5);
        takım[2] = new Oyuncu("Semih", 9);
        takım[3] = new Oyuncu("Ibrahim", 10);
        takım[4] = new Oyuncu("Serhat", 33);
    }

    @Override
    public Iterator getIterator() {
        return new ArrayListIterator(getTakım());
    }
}
