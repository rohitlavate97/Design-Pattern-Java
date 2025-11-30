package com.alchemist.dp;

public class CompanyPortal implements BillDesk{
	String paymentType;
	String data;
	@Override
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public String getPaymentType() {
		return paymentType;
	}

	@Override
	public void setDetails(String data) {
		this.data = data;
	}

	@Override
	public String getDetails() {
		return data;
	}

}
