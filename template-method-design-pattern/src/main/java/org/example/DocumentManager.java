package org.example;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public abstract class DocumentManager {

    public final Document getDocument(String name) {
        Document dokument = openDocument(name);
        checkDocument(dokument);
        return dokument;
    }

    public abstract Document openDocument(String name);

    public abstract void checkDocument(Document dokument);
}
