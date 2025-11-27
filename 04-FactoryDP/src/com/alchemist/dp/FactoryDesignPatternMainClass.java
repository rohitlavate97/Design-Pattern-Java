package com.alchemist.dp;

public class FactoryDesignPatternMainClass {
	public static void main(String[] args) {
		Factory f = new Factory();
		Notification n = f.createNotification("sms");
		n.notifi();
	}
}
