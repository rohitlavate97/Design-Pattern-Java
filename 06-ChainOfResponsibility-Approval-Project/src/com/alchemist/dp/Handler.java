package com.alchemist.dp;

public abstract class Handler {
	protected Handler next;

	public Handler setNext(Handler next) {
		this.next = next;
		return next;
	}

	public abstract void handleRequest(String request);
}
