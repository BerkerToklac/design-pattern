package org.example.designpattern.factory;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Test {

    public static void main(String[] args) {
        ArabaFabrika bmw = new BmwFabrika();
        ArabaFabrika audi = new AudiFabrika();

        for (final Araba araba : bmw.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + ", " + araba.getBeygirGucu());
        }

        for (final Araba araba : audi.getArabaListesi()) {
            System.out.println(araba.getMarka() + " " + araba.getModel() + ", " + araba.getBeygirGucu());
        }
    }
}
