package com.alchemist.dp;

public class CriticalBenefit extends PolicyDecorator{

	public CriticalBenefit(BasicPlan basicPlan) {
		super(basicPlan);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPremium() {
		// TODO Auto-generated method stub
		return super.getPremium()+200;
	}

	@Override
	public String policyDetails() {
		// TODO Auto-generated method stub
		return super.policyDetails()+" Another Critical Illness cover is provided";
	}
	
}
