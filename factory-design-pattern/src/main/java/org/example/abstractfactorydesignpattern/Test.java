package org.example.abstractfactorydesignpattern;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactoryImpl();
        Elma elma = factory.getElma();
        Biber biber = factory.getBiber();
        System.out.println(elma.getType());
        System.out.println(biber.getType());

        factory = new ConcreteFactoryImpl2();
        elma = factory.getElma();
        biber = factory.getBiber();
        System.out.println(elma.getType());
        System.out.println(biber.getType());
    }
}
