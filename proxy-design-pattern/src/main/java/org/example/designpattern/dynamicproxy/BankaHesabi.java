package org.example.designpattern.dynamicproxy;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface BankaHesabi {

    public int paraCek(int miktar) throws Exception;
    public void paraYatir(int miktar);
    public String getIsim();
    public void setIsim(String isim);
    public String getSoyad();
    public void setSoyad(String soyad);
    public int getHesapDurumu();
    public void setHesapDurumu(int hesapDurumu);
    public boolean iptalEt();

}
