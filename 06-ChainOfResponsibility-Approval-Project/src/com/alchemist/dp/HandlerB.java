package com.alchemist.dp;

class HandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handler B processed the request");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}