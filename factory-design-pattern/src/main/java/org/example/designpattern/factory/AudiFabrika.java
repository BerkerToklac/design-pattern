package org.example.designpattern.factory;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class AudiFabrika extends ArabaFabrika{
    @Override
    public void createAuto() {
        getArabaListesi().add(new A4(120));
        getArabaListesi().add(new R8(3509));
    }
}
