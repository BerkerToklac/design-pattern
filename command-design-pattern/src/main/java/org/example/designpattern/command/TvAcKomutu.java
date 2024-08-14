package org.example.designpattern.command;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class TvAcKomutu implements Komut{

    private Televizyon tv;

    public TvAcKomutu(Televizyon tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.ac();
    }
}
