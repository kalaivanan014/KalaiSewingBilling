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
@Table(name = "BILLS_MASTER")
public class CreateBillEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BILL_ID")
	private Long billId;
	@NonNull
	@Column(name = "BILL_NUMBER")
	private Long billNmber;
	@NonNull
	@Column(name = "CUSTOMER_NAME")
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
	@Column(name = "BILL_DATE")
	private LocalDate billDate;
	@NonNull
	@Column(name = "CGST_VALUE")
	private Double cGstvalue;
	@NonNull
	@Column(name = "GST_VALUE")
	private Double gstValue;
	@NonNull
	@Column(name = "TOTAL_AMOUNT")
	private double totalAmount;
	@NonNull
	@OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
	private  List<ItemsEntity> items;
	

	
	
}
