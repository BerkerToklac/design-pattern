package org.example.abstractfactorydesignpattern;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class ConcreteFactoryImpl2 implements AbstractFactory{
    @Override
    public Elma getElma() {
        return new YesilElma();
    }

    @Override
    public Biber getBiber() {
        return new YesilBiber();
    }
}
