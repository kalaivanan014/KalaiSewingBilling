package com.kalai.sewing.billing.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    @JsonProperty("modelCode")
    private String modelCode;
    @JsonProperty("modelName")
    private String modelName;
    @JsonProperty("quantity")
    private double quantity;
    @JsonProperty("price")
    private double pricePerPiece;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("gst")
    private double gst;
    @JsonProperty("cgst")
    private double cGst;
}
