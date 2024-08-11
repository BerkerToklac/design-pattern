package org.example.factorymethod;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Application {

    public static void main(String[] args) {
        Document document = DocumentFactory.getDocument("Pdf");
        System.out.println(document.getDocumentType());

    }
}
