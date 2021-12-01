package com.kalai.sewing.billing.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@ToString
public class CreateRequest {
	@JsonIgnore
	private Long billId;
	@JsonProperty("BillNumber")
	private Long BillNumber;
	@JsonProperty("CustomerName")
	private String cName;
	@JsonProperty("Address")
	private String addRess;
	@JsonProperty("PhoneNumber")
	private String phoneNumber;
	@JsonProperty("E-mail")
	private String eMail;
	@JsonProperty("BillDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate billDate;
	@JsonProperty("cGstvalue")
	private Double cGstvalue;
	@JsonProperty("GstValue")
	private Double gstValue;
	@JsonProperty("TotalAmount")
	private double totalAmount;
}
