package com.alchemist.dp;

public class Client {

	public static void main(String[] args) {

		User user = new UserBuilder("Rohit", "Lavate")
				.age(28)
				.mobile(9876543210L)
				.build();

		System.out.println(user);
	}

}
