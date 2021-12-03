package com.kalai.sewing.billing.controller;

import com.kalai.sewing.billing.repo.BillingRepo;
import com.kalai.sewing.billing.repo.BillingRepository;
import com.kalai.sewing.billing.request.CreatePriceMasterRequest;
import com.kalai.sewing.billing.service.IBillingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kalai.sewing.billing.request.CreateRequest;
import com.kalai.sewing.billing.response.CreateResponse;
import com.kalai.sewing.billing.service.BillingService;

@RestController

public class BillingController {

	Logger logger = LoggerFactory.getLogger(BillingController.class);

	@Autowired
	IBillingService billService;

	@PostMapping(path="/createBill",produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CreateResponse> addBill(@Validated @RequestBody CreateRequest cRequest) {
		return new ResponseEntity<>(billService.addBillvalue(cRequest), HttpStatus.CREATED);
	}
    @PostMapping(path="/addProduct",produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<?> addProduct(@Validated @RequestBody CreatePriceMasterRequest priceRequest) {
		ResponseEntity response=null;
		try{
			billService.addProduct(priceRequest);
			response=new ResponseEntity<>(HttpStatus.CREATED);
		}catch (Exception e){
			logger.info("exception occured on creating price master "+e.getMessage());
			response=new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
        return response;
    }


}
