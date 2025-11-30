package com.alchemist.dp;

public class InsurancePolicy {
	private String policyNumber;
	private String policyHolderName;
	private String policyType;
	private Double policyAmount;
	
	public InsurancePolicy(String policyNumber, String policyHolderName, String policyType, Double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyType = policyType;
		this.policyAmount = policyAmount;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Double getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(Double policyAmount) {
		this.policyAmount = policyAmount;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName
				+ ", policyType=" + policyType + ", policyAmount=" + policyAmount + "]";
	}
}
