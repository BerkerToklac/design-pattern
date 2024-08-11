package org.example.factorymethod;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public interface Document {

    void open();

    void close();

    String getDocumentType();
}
