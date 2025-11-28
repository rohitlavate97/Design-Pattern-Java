package com.alchemist.dp;

public class Notes500Rack implements DispenseChain{
	DispenseChain chain;

	@Override
	public void dispence(Currency currency) {
		Integer noOf500Notes = (int)currency.getAmount()/500;
		System.out.println("Dispatching: " + noOf500Notes + " 500 notes");
		
		Integer remainder = (int)currency.getAmount()%500;
		if(remainder != 0) {
			this.chain.dispence(new Currency(remainder));
		}
		
	}

	@Override
	public void chain(DispenseChain chain) {
		this.chain =chain;
	}
	

}
