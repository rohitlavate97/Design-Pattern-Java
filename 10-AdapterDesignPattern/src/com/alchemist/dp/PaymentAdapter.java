package com.alchemist.dp;

public class PaymentAdapter {

    public static PayTM convertBillDeskToPayTM(BillDesk billDesk) {
        PayTmImpl paytm = new PayTmImpl();
        paytm.setTypeOfPayment(billDesk.getPaymentType());
        paytm.provideDetails(billDesk.getDetails());
        return paytm;
    }
}
