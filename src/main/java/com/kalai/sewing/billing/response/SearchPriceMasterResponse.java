package com.kalai.sewing.billing.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchPriceMasterResponse {
    @JsonProperty("modelcode")
    private String modelCode;
    @JsonProperty("modelname")
    private String modelName;
    @JsonProperty("mrp")
    private double mrpValue;
    @JsonProperty("consumerprice")
    private double consumePrice;
    @JsonProperty("dealerprice")
    private double dealerPrice;
    @JsonProperty("brand")
    private String brandName;
    @JsonProperty("modeltype")
    private String modelType;
}
