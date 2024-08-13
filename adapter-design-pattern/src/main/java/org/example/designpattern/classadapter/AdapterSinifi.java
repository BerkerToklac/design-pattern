package org.example.designpattern.classadapter;

import org.example.designpattern.adapter.AdapteEdilenSinif;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class AdapterSinifi extends KullanilanSinif{

    private AdapteEdilenSinif adapteEdilenSinif = new AdapteEdilenSinif();

    @Override
    public void birMetod() {
        getAdapteEdilenSinif().herhangiBirMetod();
    }

    public AdapteEdilenSinif getAdapteEdilenSinif() {
        return adapteEdilenSinif;
    }

    public void setAdapteEdilenSinif(AdapteEdilenSinif adapteEdilenSinif) {
        this.adapteEdilenSinif = adapteEdilenSinif;
    }
}
