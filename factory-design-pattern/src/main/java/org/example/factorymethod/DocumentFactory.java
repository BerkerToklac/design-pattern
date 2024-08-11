package org.example.factorymethod;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class DocumentFactory {

    public static Document getDocument(final String type) {
        if (type.equals("Pdf")) {
            return new Pdf();
        } else if (type.equals("Word")) {
            return new Word();
        } else {
            throw new RuntimeException("Dokuman tipi belli degil!!!");
        }
    }
}
