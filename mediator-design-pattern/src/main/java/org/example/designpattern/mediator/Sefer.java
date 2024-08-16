package org.example.designpattern.mediator;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface Sefer {

    /**
     * Kuleden iniş izni almak için kullanılır.
     */
    void inisIzniAl();
    /**
     * Kuleden kalkış izni almak için kullanılır.
     */
    void kalkisIzniAl();
    /**
     * true ise ucak kalkış aşamasındadır.
     * Sadece bir sefer aynı anda kalkış
     * yapabilir. Kule bunu kontrol eder.
     *
     * @return
     */
    boolean isKalkisYapiyor();
    /**
     * true ise ucak iniş aşamasındadır Sadece bir
     * sefer aynı anda iniş
     * yapabilir. Kule bunu kontrol eder.
     *
     * @return
     */
    boolean isInisYapiyor();
    /**
     * Kule tarafından iniş yapan bir ucak için
     * true olarak set edilir.
     *
     * @param value
     */
    void setInisYapiyor(boolean value);
    /**
     * Kule tarafından kalkış yapan bir ucak için true
     * olarak set edilir.
     *
     * @param value
     */
    void setKalkisYapiyor(boolean value);
    /**
     * Kalkis yapan bir ucak, kalkış işlemini
     * bitirdiğini göstermek için true
     * olarak set eder.
     *
     * @param value
     */
    void setKalkisTamamlandi(boolean value);
    /**
     * İniş yapan bir ucak, iniş işlemini bitirdiğini
     * göstermek için true olarak
     * set eder.
     *
     * @param value
     */
    void setInisTamamlandi(boolean value);
}
