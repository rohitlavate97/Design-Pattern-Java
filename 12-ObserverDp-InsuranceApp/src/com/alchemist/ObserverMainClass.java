package com.alchemist;

public class ObserverMainClass {

	public static void main(String[] args) {
		Customer karthik = new Customer("Karthik");
		Customer sachin = new Customer("Sachin");
		Customer ramesh = new Customer("Ramesh");
		Customer yash = new Customer("Yash");
		Customer tinku = new Customer("Tinku");
		
		InsuranceCompany LIC = new InsuranceCompany("LIC");
		InsuranceCompany TATA = new InsuranceCompany("TATA");
		
		LIC.addSubscriber(karthik);
		LIC.addSubscriber(sachin);
		
		TATA.addSubscriber(yash);
		TATA.addSubscriber(tinku);
		TATA.addSubscriber(ramesh);
		
		LIC.tweet("Hi, Everyone --> New policy called Jeevan anand launched");
		TATA.tweet("Hi, TATA website is down...");
		

	}

}
