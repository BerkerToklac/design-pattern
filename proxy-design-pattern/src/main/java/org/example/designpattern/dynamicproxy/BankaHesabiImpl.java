package org.example.designpattern.dynamicproxy;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class BankaHesabiImpl implements BankaHesabi {

    private String isim;
    private String soyad;
    private int hesapDurumu = 0;
    private boolean iptalEdildi = false;

    public BankaHesabiImpl(final String isim, final String soyad,
                           final int miktar) {
        setIsim(isim);
        setSoyad(soyad);
        setHesapDurumu(miktar);
    }

    public BankaHesabiImpl() {
    }

    /**
     * Belirli bir miktar parayı hesaptan çeker.
     */
    @Override
    public int paraCek(final int miktar) throws Exception {
        if (getHesapDurumu() - miktar > 0) {
            setHesapDurumu(getHesapDurumu() - miktar);
        } else {
            throw new Exception("Hesabinizda yeterinde " + "para bulunmuyor.");
        }
        return miktar;
    }

    /**
     * Hesaba bir miktar para yatırmak için kullanılan metot.
     */
    @Override
    public void paraYatir(final int miktar) {
        setHesapDurumu(getHesapDurumu() + miktar);
    }

    /**
     * Bir banka hesabını iptal etmek için kullanılan metot. Sadece banka
     * çalışanları tarafından bu metot kullanılabilir. Hesap sahibi kendi
     * hesabını iptal edemez.
     */

    @Override
    public boolean iptalEt() {
        setIptalEdildi(true);
        return isIptalEdildi();
    }

    @Override
    public String getIsim() {
        return isim;
    }

    @Override
    public void setIsim(final String isim) {
        this.isim = isim;
    }

    @Override
    public String getSoyad() {
        return soyad;
    }

    @Override
    public void setSoyad(final String soyad) {
        this.soyad = soyad;
    }

    @Override
    public int getHesapDurumu() {
        return hesapDurumu;
    }

    @Override
    public void setHesapDurumu(final int hesapDurumu) {
        this.hesapDurumu = hesapDurumu;
    }

    public boolean isIptalEdildi() {
        return iptalEdildi;
    }

    public void setIptalEdildi(final boolean iptalEdildi) {
        this.iptalEdildi = iptalEdildi;
    }
}
