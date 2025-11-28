package com.alchemist.dp;

public class Notes100Rack implements DispenseChain{
	DispenseChain chain;

	@Override
	public void dispence(Currency currency) {
		Integer noOf100Notes = (int)currency.getAmount()/100;
		System.out.println("Dispatching: " + noOf100Notes + " 100 notes");
		
		Integer remainder = (int)currency.getAmount()%100;
		if(remainder != 0) {
			this.chain.dispence(new Currency(remainder));
		}
	}

	@Override
	public void chain(DispenseChain chain) {
		this.chain = chain;
	}
}
