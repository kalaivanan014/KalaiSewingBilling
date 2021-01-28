package com.kalai.sewing.billing.response;

public class CreateResponse {

	private String billNumber;
	private String billStatus;

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	@Override
	public String toString() {
		return "CreateResponse [billNumber=" + billNumber + ", billStatus=" + billStatus + ", getBillNumber()="
				+ getBillNumber() + ", getBillStatus()=" + getBillStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
