package org.example;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class DocumentManagerImpl extends DocumentManager{
    @Override
    public Document openDocument(String name) {
        System.out.println("Document " + name + " opened");
        return new Pdf();
    }

    @Override
    public void checkDocument(Document dokument) {
        System.out.println("Document checked...");
    }
}
