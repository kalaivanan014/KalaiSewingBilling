package com.kalai.sewing.billing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalai.sewing.billing.entity.CreateBillEntity;
import com.kalai.sewing.billing.repo.BillingRepository;
import com.kalai.sewing.billing.request.CreateRequest;

@Service
public class BillingService {
	
	@Autowired
	BillingRepository billRepo;
	
	public void addBillvalue(CreateRequest cRequest) {
		CreateBillEntity enValue= new CreateBillEntity();
		enValue.setTotalvalue(cRequest.getTotalAmount());
		enValue.setBillDate(cRequest.getBillDate());
		enValue.setBillId(cRequest.getBillId());
		enValue.setcGstvalue(cRequest.getcGstvalue());
		enValue.setcName(cRequest.getcName());
		enValue.seteMail(cRequest.geteMail());
		enValue.setGstValue(cRequest.getGstValue());
		enValue.setPhoneNumber(cRequest.getPhoneNumber());
		enValue.setAddress(cRequest.getAddRess());
		billRepo.save(enValue);
		
		
	}

}
