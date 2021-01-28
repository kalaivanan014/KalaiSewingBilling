package com.kalai.sewing.billing.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class CreateBillEntity {

	@Id
	private Long billId;
	@NonNull
	private String cName;
	@NonNull
	private String Address;
	@NonNull
	private String phoneNumber;
	@NonNull
	private String eMail;
	@NonNull
	private LocalDateTime billDate;
	@NonNull
	private Double cGstvalue;
	@NonNull
	private Double gstValue;
	private double totalvalue;
	
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
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
	public double getTotalvalue() {
		return totalvalue;
	}
	public void setTotalvalue(double totalvalue) {
		this.totalvalue = totalvalue;
	}
	
	
}
