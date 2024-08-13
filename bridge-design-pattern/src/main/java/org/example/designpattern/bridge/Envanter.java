package org.example.designpattern.bridge;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public abstract class Envanter {

    private Uretim uretim;
    public abstract void produce();
    public Envanter(final Uretim uretim) {
        setUretim(uretim);
    }

    public Uretim getUretim() {
        return uretim;
    }
    public void setUretim(final Uretim uretim) {
        this.uretim = uretim;
    }

}
