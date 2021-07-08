package com.kalai.sewing.billing.service;

import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalai.sewing.billing.entity.BillValueEntity;
import com.kalai.sewing.billing.entity.CreateBillEntity;
import com.kalai.sewing.billing.repo.BillingRepository;
import com.kalai.sewing.billing.request.CreateRequest;

@Service
public class BillingService {
	Logger logger=LoggerFactory.getLogger(BillingService.class);

	@Autowired
	BillingRepository billRepo;

	public long addBillvalue(CreateRequest cRequest) {
		logger.debug("create bill Service starting");
		CreateBillEntity enValue = new CreateBillEntity();
		enValue.setTotalvalue(cRequest.getTotalAmount());
		enValue.setBillDate(cRequest.getBillDate());
		enValue.setBillNumber(cRequest.getBillId());
		enValue.setcGstvalue(cRequest.getcGstvalue());
		enValue.setcName(cRequest.getcName());
		enValue.seteMail(cRequest.geteMail());
		enValue.setGstValue(cRequest.getGstValue());
		enValue.setPhoneNumber(cRequest.getPhoneNumber());
		enValue.setAddress(cRequest.getAddRess());
		enValue.setBillIdentifier(UUID.randomUUID().toString().replace("-", ""));
		enValue.setBillItems((cRequest.getBillItems().stream().map(e -> {
			BillValueEntity billValue = new BillValueEntity();
			billValue.setModelCode(e.getModelCode());
			billValue.setModelName(e.getModelName());
			billValue.setModelParent(e.getModelParent());
			billValue.setSubModelParent(e.getSubModelParent());
			billValue.setNoOfPieces(e.getNoOfPieces());
			billValue.setPricePerPiece(e.getPricePerPiece());
			billValue.setTotalAmount(e.getTotalAmount());
			billValue.setBillEntity(enValue);
			return billValue;
		}).collect(Collectors.toList())));
		billRepo.save(enValue);
		logger.debug("end of create bill Service ");
		return enValue.getBillNumber();

	}

}
