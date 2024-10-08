package org.example.designpattern.mediator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public abstract class BaseSefer implements Sefer {

    private boolean inisTamamlandi;
    private boolean kalkisTamamlandi;
    private boolean inisYapiyor;
    private boolean kalkisYapiyor;
    private Kule kule;

    public Kule getKule() {
        return kule;
    }

    public void setKule(Kule kule) {
        this.kule = kule;
    }

    public boolean isInisTamamlandi() {
        return inisTamamlandi;
    }

    public void setInisTamamlandi(boolean
                                          inisTamamlandi) {
        this.inisTamamlandi = inisTamamlandi;
        this.inisYapiyor = false;
        System.out.println(this.toString() +
                " inişi tamamladı.");
    }

    public boolean isKalkisTamamlandi() {
        return kalkisTamamlandi;
    }

    public void setKalkisTamamlandi(
            boolean kalkisTamamlandi) {
        this.kalkisTamamlandi = kalkisTamamlandi;
        this.kalkisYapiyor = false;
        System.out.println(this.toString()
                        + " kalkışı tamamladı.");
    }

    public boolean isInisYapiyor() {
        return inisYapiyor;
    }

    public void setInisYapiyor(boolean inisYapiyor) {
        this.inisYapiyor = inisYapiyor;
    }

    public boolean isKalkisYapiyor() {
        return kalkisYapiyor;
    }

    public void setKalkisYapiyor(boolean kalkisYapiyor) {
        this.kalkisYapiyor = kalkisYapiyor;
    }

}
