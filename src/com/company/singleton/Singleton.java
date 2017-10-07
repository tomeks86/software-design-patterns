package com.company.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {   //very important - only one instance of Singleton can be created!!!
    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
