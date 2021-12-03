package com.kalai.sewing.billing.service;

import com.kalai.sewing.billing.request.CreatePriceMasterRequest;
import com.kalai.sewing.billing.request.CreateRequest;
import com.kalai.sewing.billing.response.CreateResponse;

public interface IBillingService {
    public CreateResponse addBillvalue(CreateRequest cRequest);
    public void addProduct(CreatePriceMasterRequest requestData);
}
