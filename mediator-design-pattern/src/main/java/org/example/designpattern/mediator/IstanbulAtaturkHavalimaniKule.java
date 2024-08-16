package org.example.designpattern.mediator;

import java.util.ArrayList;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class IstanbulAtaturkHavalimaniKule implements Kule{

    private ArrayList<Sefer> seferList = new ArrayList<Sefer>();

    public ArrayList<Sefer> getSeferList() {
        return seferList;
    }

    public void setSeferList(ArrayList<Sefer> seferList) {
        this.seferList = seferList;
    }

    public void seferEkle(Sefer sefer) {
        if (!getSeferList().contains(sefer)) {
            getSeferList().add(sefer);
            System.out.println("Kule: " + sefer.toString()
                    + " " + "- sefer listesine eklendi");
        }
    }
    /**
     * Sefer listesinden bir uçağı silmek için kullanılır.
     *
     * @param sefer
     */
    public void seferSil(Sefer sefer) {
        if (getSeferList().contains(sefer)) {
            getSeferList().remove(sefer);
            System.out.println("Kule: " + sefer.toString()
                    + " " + "- sefer listesinen silindi");
        }
    }
    /**
     * İniş izni almak isteyen ucaklar bu metot ile kuleden
     * iniş izni talep
     * ederler.
     */
    public void inisIzniVer(Sefer sefer) {
        boolean inisYapiliyor = false;
        Sefer inisYapanSefer = null;
        if (getSeferList().contains(sefer)) {
/**
 * Tüm sefer listesini kontrol ediyoruz
 */
            for (int i = 0; i < getSeferList().size(); i++) {
                Sefer tempSefer = getSeferList().get(i);
/**
 * Eğer listede herhangi bir ucak iniş yapıyorsa,
 * o zaman sefer
 280
 * değişkenindeki uçağa iniş izni verilmez!
 */
                if (tempSefer.isInisYapiyor()) {
                    inisYapiliyor = true;
                    inisYapanSefer = tempSefer;
                    break;
                }
            }
            if (!inisYapiliyor) {
/**
 * Eğer iniş yapan ucak yoksa, iniş izni verilir.
 * Aynı anda
 * sadece bir ucak iniş yapabilir.
 */
                sefer.setInisYapiyor(true);
                System.out.println("Kule: " +
                        sefer.toString() + "iniş izni verildi.");
            } else {
                if (!sefer.equals(inisYapanSefer)) {
                    System.out.println("Kule: " +
                            inisYapanSefer + " iniş yapıyor. " + "Bu yüzden "
                            + sefer
                            + " seferine " +
                            " iniş izni verilemiyor!");
                }
            }
        } else {
            System.out.println(
                    sefer.toString() + " sefer "
                            + "listesinde yeralmiyor!");
        }
    }
    /**
     * Kalkis izni almak isteyen ucaklar bu metot
     * ile kuleden kalkış izni talep
     * ederler.
     */
    public void kalkisIzniVer(Sefer sefer) {
        boolean kalkisYapiliyor = false;
        Sefer kalkisYapanSefer = null;
        if (getSeferList().contains(sefer)) {
/**
 * Tüm sefer listesini kontrol ediyoruz
 281
 */
            for (int i = 0; i < getSeferList().size(); i++) {
                Sefer tempSefer = getSeferList().get(i);
/**
 * Eğer listede herhangi bir ucak kalkış yapıyorsa,
 * o zaman
 * sefer değişkenindeki uçağa kalkış izni verilmez!
 */
                if (tempSefer.isKalkisYapiyor()) {
                    kalkisYapiliyor = true;
                    kalkisYapanSefer = tempSefer;
                    break;
                }
            }
            if (!kalkisYapiliyor) {
/**
 * Eğer kakis yapan ucak yoksa, kalkış
 * izni verilir. Aynı anda
 * sadece bir ucak kalkış yapabilir.
 */
                sefer.setKalkisYapiyor(true);
                System.out.println("Kule: " +
                        sefer.toString() + "kalkış izni verildi.");
            } else {
                if (!sefer.equals(kalkisYapanSefer)) {
                    System.out.println("Kule: " +
                            kalkisYapanSefer + " kalkış yapıyor. "
                            + " Bu yüzden " + sefer + " "
                            + "seferine kalkış izni verilemiyor!");
                }
            }
        } else {
            System.out.println(sefer.toString() + " "
                    + "sefer " + "listesinde yeralmiyor!");
        }
    }

}
