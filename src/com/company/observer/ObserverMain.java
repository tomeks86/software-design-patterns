package com.company.observer;

public class ObserverMain {

    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherObservable("");
        Observer userObserver = new Observer();
        Observer userObserver2 = new Observer();
        weatherObservable.addObserver(userObserver);
        weatherObservable.addObserver(userObserver2);
        weatherObservable.setWeather("It will be sunny!");
        weatherObservable.setWeather("It will rain!");
    }
}
