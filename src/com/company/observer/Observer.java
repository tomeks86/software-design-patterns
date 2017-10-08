package com.company.observer;

import java.util.Observable;

public class Observer implements java.util.Observer {
    private WeatherObservable weather;

    @Override
    public void update(Observable o, Object arg) {
        weather = (WeatherObservable) o;
        System.out.println("Weather update: " + weather.getWeather());
    }
}
