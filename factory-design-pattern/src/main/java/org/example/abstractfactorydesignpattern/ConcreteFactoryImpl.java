package org.example.abstractfactorydesignpattern;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class ConcreteFactoryImpl implements AbstractFactory{
    @Override
    public Elma getElma() {
        return new KirmiziElma();
    }

    @Override
    public Biber getBiber() {
        return new DolmaBiber();
    }
}
