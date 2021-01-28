package com.kalai.sewing.billing.controller;

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
	@Autowired
	BillingService billService;

	@PostMapping(path="/createBill",produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<CreateResponse> addBill(@Validated @RequestBody CreateRequest cRequest) {
		CreateResponse cResponse = new CreateResponse();
		billService.addBillvalue(cRequest);
		cResponse.setBillNumber(cRequest.getBillId().toString());
		cResponse.setBillStatus("SUCCESS");
		return new ResponseEntity<>(cResponse, HttpStatus.CREATED);
	}

}
