package com.alchemist.dp;

public class Client {
    public static void main(String[] args) {
        HandlerA h1 = new HandlerA();
        HandlerB h2 = new HandlerB();
 
        h1.setNext(h2);
 
        h1.handleRequest("B");
    }
}
