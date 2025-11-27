package com.alchemist.dp;

public class Factory {
	public Notification createNotification(String mode) {
		if(mode.equalsIgnoreCase("sms")) {
			Notification n = new SMSNotification();
			return n;
		}
		if(mode.equalsIgnoreCase("email")) {
			Notification n = new EmailNotification();
		}
		return null;
	}
}
