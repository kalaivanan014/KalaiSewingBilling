package com.kalai.sewing.billing.request;

import java.time.LocalDateTime;

public class CreateRequest {
	private Long billId;
	private String cName;
	private String addRess;
	private String phoneNumber;
	private String eMail;
	private LocalDateTime billDate;
	private Double cGstvalue;
	private Double gstValue;
	private double totalAmount;
	public Long getBillId() {
		return billId;
	}
	public void setBillId(Long billId) {
		this.billId = billId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getAddRess() {
		return addRess;
	}
	public void setAddRess(String addRess) {
		this.addRess = addRess;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public LocalDateTime getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDateTime billDate) {
		this.billDate = billDate;
	}
	public Double getcGstvalue() {
		return cGstvalue;
	}
	public void setcGstvalue(Double cGstvalue) {
		this.cGstvalue = cGstvalue;
	}
	public Double getGstValue() {
		return gstValue;
	}
	public void setGstValue(Double gstValue) {
		this.gstValue = gstValue;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "CreateRequest [billId=" + billId + ", cName=" + cName + ", addRess=" + addRess + ", phoneNumber="
				+ phoneNumber + ", eMail=" + eMail + ", billDate=" + billDate + ", cGstvalue=" + cGstvalue
				+ ", gstValue=" + gstValue + ", totalAmount=" + totalAmount + "]";
	}
	
	

}
