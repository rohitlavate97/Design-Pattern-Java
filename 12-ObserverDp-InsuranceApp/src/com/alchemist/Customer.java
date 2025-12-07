package com.alchemist;

public class Customer implements NotifyCustomerInterface{
	String name;
	Customer(String name){
		this.name = name;
	}

	@Override
	public void notification(String tweet) {
		System.out.println(name+" has notification received: "+tweet);
	}

}
