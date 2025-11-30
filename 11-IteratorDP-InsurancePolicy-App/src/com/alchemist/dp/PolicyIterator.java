package com.alchemist.dp;

import java.util.Iterator;
import java.util.List;

public class PolicyIterator implements Iterator<InsurancePolicy> {
	private int currentIndex = 0;
	private List<InsurancePolicy> policyList;

	public PolicyIterator(List<InsurancePolicy> policyList) {
		this.policyList = policyList; // important fix
	}

	@Override
	public boolean hasNext() {
		return currentIndex < policyList.size();
	}

	@Override
	public InsurancePolicy next() {
		if (!hasNext()) {
			return null;
		}
		return policyList.get(currentIndex++);
	}
}
