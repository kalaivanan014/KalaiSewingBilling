package com.kalai.sewing.billing.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class CreateRequest {
	@JsonIgnore
	private Long billId;
	@JsonProperty("billNumber")
	private Long BillNumber;
	@JsonProperty("customerName")
	private String cName;
	@JsonProperty("address")
	private String addRess;
	@JsonProperty("phoneNumber")
	private String phoneNumber;
	@JsonProperty("e-mail")
	private String eMail;
	@JsonProperty("billDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate billDate;
	@JsonProperty("cgstvalue")
	private Double cGstvalue;
	@JsonProperty("gstValue")
	private Double gstValue;
	@JsonProperty("totalAmount")
	private double totalAmount;
	@JsonProperty("items")
	private List<Item> items;
}
