package com.alchemist.dp;

public class MainClass {

	public static void main(String[] args) {
		CompanyPortal cp = new CompanyPortal();
		cp.setPaymentType("UPI");
		cp.setDetails("9097808783@apl");
		
		PayTM tm = PaymentAdapter.convertBillDeskToPayTM(cp);
		System.out.println("PayTM Payment Type: "+tm.getTypeOfPayment());
		System.out.println("PayTM Payment Details: "+tm.getDetails());
	}

}
