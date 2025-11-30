package com.alchemist.dp;

public abstract class PolicyDecorator implements BasicPlan{
	BasicPlan basicPlan;
	
	public PolicyDecorator(BasicPlan basicPlan) {
		this.basicPlan = basicPlan;
	}
	
	public int getPremium() {
		return basicPlan.getPremium();
	}
	
	public String policyDetails() {
		return basicPlan.policyDetails();
	}
}
