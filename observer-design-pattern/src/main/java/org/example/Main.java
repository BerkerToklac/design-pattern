package org.example;

import org.example.designpattern.observer.CurrentConditionsDisplay;
import org.example.designpattern.observer.WeatherData;

/**
 * @author Berker Toklac <berker.toklac@payten.com>
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

    }
}