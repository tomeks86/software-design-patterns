package com.company.observer;

import java.util.Observable;

public class WeatherObservable extends Observable {
    private String weather;

    public WeatherObservable(String weather) {
        this.weather = weather;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        setChanged();
        notifyObservers();
    }
}
