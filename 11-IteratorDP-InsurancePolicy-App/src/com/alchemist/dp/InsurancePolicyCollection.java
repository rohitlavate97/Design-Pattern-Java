package com.alchemist.dp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsurancePolicyCollection implements Iterable<InsurancePolicy>{
	private List<InsurancePolicy> policyList;
	public InsurancePolicyCollection() {
		policyList = new ArrayList<>();
	}
	
	public void addPolicy(InsurancePolicy policy) {
		policyList.add(policy);
	}
	
	public void removePolicy(InsurancePolicy policy) {
		policyList.remove(policy);
	}
	
	@Override
	public Iterator<InsurancePolicy> iterator() {
		// TODO Auto-generated method stub
		return new PolicyIterator(policyList);
	}

}
