package com.alchemist.dp;

public class UserBuilder {
	String firstName;
	String lastName;
	int age;
	long mobile;
	
	public UserBuilder(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//creating method for optional parameter
	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public UserBuilder mobile(long mobile) {
		this.mobile = mobile;
		return this;
	}
	
	User build() {
		User u = new User(this);     //In order to create outer class object
		return u;
	}
}
