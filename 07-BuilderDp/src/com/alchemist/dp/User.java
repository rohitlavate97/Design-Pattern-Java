package com.alchemist.dp;

public class User {
	User(UserBuilder ub){
		this.firstName = ub.firstName;
		this.lastName = ub.lastName;
		this.age = ub.age;
		this.mobile = ub.mobile;
	} 
	
	final private String firstName;    //Mandatory field
	final private String lastName;     //Mandatory field
	final private int age;             //Optional Field
	final private long mobile;         //Optional Field
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobile=" + mobile + "]";
	}
}
