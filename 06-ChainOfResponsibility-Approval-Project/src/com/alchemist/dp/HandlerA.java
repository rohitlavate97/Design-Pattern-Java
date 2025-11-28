package com.alchemist.dp;

class HandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("Handler A processed the request");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}