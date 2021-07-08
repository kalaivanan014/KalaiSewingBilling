package com.kalai.sewing.billing.request;

import com.sun.istack.NotNull;

public class BillItemRequest {
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
	
	

}
