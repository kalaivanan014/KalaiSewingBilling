package com.kalai.sewing.billing.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalai.sewing.billing.entity.CreateBillEntity;

public interface BillingRepository extends JpaRepository<CreateBillEntity, Long> {

}
