package com.kalai.sewing.billing.service;

import com.kalai.sewing.billing.request.CreatePriceMasterRequest;
import com.kalai.sewing.billing.request.CreateRequest;
import com.kalai.sewing.billing.response.CreateResponse;
import com.kalai.sewing.billing.response.SearchPriceMasterResponse;

import java.util.List;
import java.util.Optional;

public interface IBillingService {
    public CreateResponse addBillvalue(CreateRequest cRequest);
    public void addProduct(CreatePriceMasterRequest requestData);
    public List<SearchPriceMasterResponse> searchProduct(String searchString);
}
