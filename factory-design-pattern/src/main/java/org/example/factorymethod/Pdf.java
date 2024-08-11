package org.example.factorymethod;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Pdf implements Document{
    @Override public void open() {

    }

    @Override public void close() {

    }

    @Override public String getDocumentType() {
        return "Pdf";
    }
}
