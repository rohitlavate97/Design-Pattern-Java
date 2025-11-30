package com.alchemist.dp;

public interface PayTM {
	void setTypeOfPayment(String paymentType);
	String getTypeOfPayment();
	void provideDetails(String data);
	String getDetails();
}
