package com.alchemist.dp;

import java.util.Iterator;

public class IteratorMainClass {

	public static void main(String[] args) {
		InsurancePolicyCollection policyCollection = new InsurancePolicyCollection();
		policyCollection.addPolicy(new InsurancePolicy("1001","John Smith","Life",1000.00));
		policyCollection.addPolicy(new InsurancePolicy("1002","John Doe","Critical",700.00));
		policyCollection.addPolicy(new InsurancePolicy("1003","Dwayne Smith","Medical",1500.00));
		
		Iterator<InsurancePolicy> policyIterator = policyCollection.iterator();
		while(policyIterator.hasNext()) {
			InsurancePolicy policy = policyIterator.next();
			System.out.println("Policy Number: "+policy.getPolicyNumber());
			System.out.println("Policy Holder Name: "+policy.getPolicyHolderName());
			System.out.println("Policy Type: "+policy.getPolicyType());
			System.out.println("Policy Amount: "+policy.getPolicyAmount());
			System.out.println("------------------------------------------------");
		}
	}

}
