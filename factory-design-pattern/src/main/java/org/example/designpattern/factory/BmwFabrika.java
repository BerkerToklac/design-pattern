package org.example.designpattern.factory;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class BmwFabrika extends ArabaFabrika{
    @Override
    public void createAuto() {
        getArabaListesi().add(new Z4(170));
    }
}
