package com.alchemist.dp;

public class AccidentalBenifit extends PolicyDecorator{

	public AccidentalBenifit(BasicPlan basicPlan) {
		super(basicPlan);
	}

	@Override
	public int getPremium() {
		return super.getPremium()+100;
	}

	@Override
	public String policyDetails() {
		return super.policyDetails()+" Extra Accidental cover is provided";
	}

}
