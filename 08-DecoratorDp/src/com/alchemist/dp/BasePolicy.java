package com.alchemist.dp;

public class BasePolicy implements BasicPlan{

	@Override
	public int getPremium() {
		return 1500;
	}

	@Override
	public String policyDetails() {
		return "This is Basic Cover";
	}

}
