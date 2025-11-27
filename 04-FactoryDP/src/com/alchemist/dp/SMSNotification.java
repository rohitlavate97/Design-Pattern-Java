package com.alchemist.dp;

public class SMSNotification implements Notification{

	@Override
	public void notifi() {
		System.out.println("Triggering notification through SMS...");
	}

}
