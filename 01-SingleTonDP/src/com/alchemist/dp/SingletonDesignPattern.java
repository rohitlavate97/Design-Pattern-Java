package com.alchemist.dp;

public class SingletonDesignPattern {

    // instance is created at the time of class loading
    static SingletonDesignPattern instance = new SingletonDesignPattern();

    // private constructor to prevent instantiation
    SingletonDesignPattern() {
    }

    // public method to provide access to the instance
    public static SingletonDesignPattern getInstance() {
        return instance;                        //from static method only static variable can be accessed
    }

    // example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
