package org.example.designpattern.command;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class TvKapatKomutu implements Komut{

    private Televizyon tv;

    public TvKapatKomutu(Televizyon tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.kapat();
    }
}
