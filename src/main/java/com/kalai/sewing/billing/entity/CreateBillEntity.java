package com.kalai.sewing.billing.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.NonNull;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Bills")
public class CreateBillEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long billNumber;
	@NotNull
	private String billIdentifier;
	@NotNull
	private String cName;
	@NotNull
	private String Address;
	@NotNull
	private String phoneNumber;
	@NotNull
	private String eMail;
	@NotNull
	private LocalDateTime billDate;
	@NotNull
	private Double cGstvalue;
	@NotNull
	private Double gstValue;
	@NotNull
	private Double totalvalue;
	@NotNull
	@OneToMany(mappedBy = "billEntity",cascade = CascadeType.ALL)
	private List<BillValueEntity> billItems;
	
	public Long getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(Long billNumber) {
		this.billNumber = billNumber;
	}
	public String getBillIdentifier() {
		return billIdentifier;
	}
	public void setBillIdentifier(String billIdentifier) {
		this.billIdentifier = billIdentifier;
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
	public Double getTotalvalue() {
		return totalvalue;
	}
	public void setTotalvalue(Double totalvalue) {
		this.totalvalue = totalvalue;
	}
	public List<BillValueEntity> getBillItems() {
		return billItems;
	}
	public void setBillItems(List<BillValueEntity> billItems) {
		this.billItems = billItems;
	}

	
	

}
