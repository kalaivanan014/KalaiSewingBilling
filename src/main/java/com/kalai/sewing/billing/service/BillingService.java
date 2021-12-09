package com.kalai.sewing.billing.service;

import com.kalai.sewing.billing.entity.ItemsEntity;
import com.kalai.sewing.billing.entity.PriceMasterEntity;
import com.kalai.sewing.billing.repo.PriceMasterRepository;
import com.kalai.sewing.billing.request.CreatePriceMasterRequest;
import com.kalai.sewing.billing.request.Item;
import com.kalai.sewing.billing.response.CreateResponse;
import com.kalai.sewing.billing.response.SearchPriceMasterResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalai.sewing.billing.entity.CreateBillEntity;
import com.kalai.sewing.billing.repo.BillingRepository;
import com.kalai.sewing.billing.request.CreateRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BillingService implements IBillingService {
	Logger logger = LoggerFactory.getLogger(BillingService.class);


	
	@Autowired
	BillingRepository billRepo;
	@Autowired
	PriceMasterRepository priceMaterRepo;
	
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
			List<ItemsEntity> itemsList=new ArrayList<>();
			cRequest.getItems().forEach(e->itemsList.add(getItems(e)));
			enValue.setItems(itemsList);
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

	@Override
	public void addProduct(CreatePriceMasterRequest requestData) {
		logger.info(requestData.toString());
			PriceMasterEntity entity = new PriceMasterEntity();
			entity.setConsumerPrice(requestData.getConsumePrice());
			entity.setBrandName(requestData.getBrandName());
			entity.setDealerPrice(requestData.getDealerPrice());
			entity.setModelType(requestData.getModelType());
			entity.setMrp(requestData.getMrpValue());
			entity.setPurchasePrice(requestData.getPurchasePrice());
			entity.setModelName(requestData.getModelName());
			entity.setModelCode(requestData.getModelCode());
			priceMaterRepo.save(entity);
	}

	@Override
	public List<SearchPriceMasterResponse> searchProduct(String searchString) {
		Optional<List<PriceMasterEntity>> dataRetrieved = Optional.ofNullable(priceMaterRepo.findBySeacrhString(searchString));
		List<SearchPriceMasterResponse> response = new ArrayList<>();
		if (dataRetrieved.isPresent()) {
			dataRetrieved.get().forEach(e -> response.add(getProducts(e)));
		}
		return response;
	}

	private SearchPriceMasterResponse getProducts(PriceMasterEntity e){
		SearchPriceMasterResponse resValue = new SearchPriceMasterResponse();
		resValue.setMrpValue(e.getMrp());
		resValue.setConsumePrice(e.getConsumerPrice());
		resValue.setBrandName(e.getBrandName());
		resValue.setDealerPrice(e.getDealerPrice());
		resValue.setModelCode(e.getModelCode());
		resValue.setModelType(e.getModelType());
		resValue.setModelName(e.getModelName());
		return resValue;
	}

	/*
    adding each item to entity from request
     */
	private ItemsEntity getItems(Item item){
		ItemsEntity entity= new ItemsEntity();
		entity.setAmount(item.getAmount());
		entity.setGst(item.getGst());
		entity.setCGst(item.getCGst());
		entity.setModelName(item.getModelName());
		entity.setModelCode(item.getModelCode());
		entity.setQuantity(item.getQuantity());
		entity.setPricePerPiece(item.getPricePerPiece());
		return entity;
	}

}
