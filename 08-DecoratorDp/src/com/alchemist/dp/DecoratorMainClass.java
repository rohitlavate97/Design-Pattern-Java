package com.alchemist.dp;

public class DecoratorMainClass {

	public static void main(String[] args) {
		BasicPlan karthikPolicy = new BasePolicy();
		System.out.println(karthikPolicy.getPremium());
		System.out.println(karthikPolicy.policyDetails());
		System.out.println("---------------------------");
		
		BasicPlan ajayPolicy = new BasePolicy();
		System.out.println(ajayPolicy.getPremium());
		System.out.println(ajayPolicy.policyDetails());
		System.out.println("---------------------------");
		
		ajayPolicy = new AccidentalBenifit(ajayPolicy);
		System.out.println(ajayPolicy.getPremium());
		System.out.println(ajayPolicy.policyDetails());
		System.out.println("---------------------------");
		
		ajayPolicy = new CriticalBenefit(ajayPolicy);
		System.out.println(ajayPolicy.getPremium());
		System.out.println(ajayPolicy.policyDetails());
		System.out.println("---------------------------");
		
		//To check if object is not modified
		System.out.println(karthikPolicy.getPremium());
		System.out.println(karthikPolicy.policyDetails());
		System.out.println("---------------------------");
	}

}
