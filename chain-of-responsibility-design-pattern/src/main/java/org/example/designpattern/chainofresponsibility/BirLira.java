package org.example.designpattern.chainofresponsibility;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class BirLira extends MetalPara{

    public String toString()  {
        return "1 Lira";
    }

    public BirLira() {
        setValue(100);
    }
}
