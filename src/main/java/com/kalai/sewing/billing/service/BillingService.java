package com.kalai.sewing.billing.service;

import com.kalai.sewing.billing.response.CreateResponse;
import org.apache.logging.slf4j.SLF4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalai.sewing.billing.entity.CreateBillEntity;
import com.kalai.sewing.billing.repo.BillingRepository;
import com.kalai.sewing.billing.request.CreateRequest;

@Service
public class BillingService implements IBillingService {
	Logger logger = LoggerFactory.getLogger(BillingService.class);


	
	@Autowired
	BillingRepository billRepo;
	
	public CreateResponse addBillvalue(CreateRequest cRequest) {
		logger.info(cRequest.toString());
		CreateResponse cResponse = null;
		try {
			cResponse = new CreateResponse();
			CreateBillEntity enValue = new CreateBillEntity();
			enValue.setBillNmber(cRequest.getBillNumber());
			enValue.setTotalAmount(cRequest.getTotalAmount());
			enValue.setBillDate(cRequest.getBillDate());
			enValue.setCGstvalue(cRequest.getCGstvalue());
			enValue.setCustomerName(cRequest.getCName());
			enValue.setEMail(cRequest.getEMail());
			enValue.setGstValue(cRequest.getGstValue());
			enValue.setPhoneNumber(cRequest.getPhoneNumber());
			enValue.setAddRess(cRequest.getAddRess());
			billRepo.save(enValue);
			cResponse.setBillNumber(enValue.getBillNmber().toString());
			cResponse.setBillIdentifier(enValue.getBillId().toString());
			cResponse.setBillStatus("SUCCESS");
		}catch(Exception e){
			cResponse = new CreateResponse();
			cResponse.setBillNumber("NA");
			cResponse.setBillIdentifier("NA");
			cResponse.setBillStatus("FAILED");
			logger.info(e.getMessage());
		}
		return cResponse;
		
		
	}

}
