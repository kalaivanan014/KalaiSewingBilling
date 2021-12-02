package com.kalai.sewing.billing.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Entity
@Getter
@Setter
public class CreateBillEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BILLID")
	private Long billId;
	@NonNull
	@Column(name = "BILLNUMBER")
	private Long billNmber;
	@NonNull
	@Column(name = "CUSTOMERNAME")
	private String customerName;
	@NonNull
	@Column(name = "ADDRESS")
	private String addRess;
	@NonNull
	@Column(name = "PHONENUMBER")
	private String phoneNumber;
	@NonNull
	@Column(name = "EMAIL")
	private String eMail;
	@NonNull
	@Column(name = "BILLDATE")
	private LocalDate billDate;
	@NonNull
	@Column(name = "CGSTVALUEE")
	private Double cGstvalue;
	@NonNull
	@Column(name = "GSTVALUE")
	private Double gstValue;
	@NonNull
	@Column(name = "TOTALAMOUNT")
	private double totalAmount;
	@NonNull
	@OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
	private  List<ItemsEntity> items;
	

	
	
}
