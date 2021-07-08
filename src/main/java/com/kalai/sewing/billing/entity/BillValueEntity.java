package com.kalai.sewing.billing.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="BillValue")
public class BillValueEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@NotNull
	private String modelCode;
	@NotNull
	private String modelParent;
	@NotNull
	private String modelName;
	@NotNull
	private Double pricePerPiece;
	@NotNull
	private Double totalAmount;
	@NotNull
	private int noOfPieces;
	@NotNull
	private String subModelParent;
	@ManyToOne
	@JoinColumn(name="billId",nullable = false)
	private CreateBillEntity billEntity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelCode() {
		return modelCode;
	}
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getModelParent() {
		return modelParent;
	}
	public void setModelParent(String modelParent) {
		this.modelParent = modelParent;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Double getPricePerPiece() {
		return pricePerPiece;
	}
	public void setPricePerPiece(Double pricePerPiece) {
		this.pricePerPiece = pricePerPiece;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNoOfPieces() {
		return noOfPieces;
	}
	public void setNoOfPieces(int noOfPieces) {
		this.noOfPieces = noOfPieces;
	}
	public String getSubModelParent() {
		return subModelParent;
	}
	public void setSubModelParent(String subModelParent) {
		this.subModelParent = subModelParent;
	}
	public CreateBillEntity getBillEntity() {
		return billEntity;
	}
	public void setBillEntity(CreateBillEntity billEntity) {
		this.billEntity = billEntity;
	}
	
	
	

}
