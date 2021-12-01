package com.kalai.sewing.billing.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Entity
@Getter
@Setter
public class CreateBillEntity {

	@Id
	@GeneratedValue
	private Long billId;
	@NonNull
	private Long billNmber;
	@NonNull
	private String customerName;
	@NonNull
	private String addRess;
	@NonNull
	private String phoneNumber;
	@NonNull
	private String eMail;
	@NonNull
	private LocalDate billDate;
	@NonNull
	private Double cGstvalue;
	@NonNull
	private Double gstValue;
	@NonNull
	private double totalAmount;
	

	
	
}
