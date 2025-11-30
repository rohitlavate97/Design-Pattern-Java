package com.alchemist.dp;

public class PayTmImpl implements PayTM{
	String paymentType;
	String data;
	@Override
	public void setTypeOfPayment(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String getTypeOfPayment() {
		return paymentType;
	}

	@Override
	public void provideDetails(String data) {
		this.data = data;
	}

	@Override
	public String getDetails() {
		return data;
	}
}
