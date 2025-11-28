package com.alchemist.dp;

public class Notes2000Rack implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void dispence(Currency currency) {
        Integer noOf2000Notes = currency.getAmount() / 2000;
        System.out.println("Dispatching: " + noOf2000Notes + " 2000 notes");
        
        Integer remainder = currency.getAmount() % 2000;

        if (remainder != 0) {
            this.chain.dispence(new Currency(remainder));
        }
    }

    @Override
    public void chain(DispenseChain chain) {
        this.chain = chain;   // FIXED
    }
}
