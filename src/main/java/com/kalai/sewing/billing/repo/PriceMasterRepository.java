package com.kalai.sewing.billing.repo;

import com.kalai.sewing.billing.entity.PriceMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PriceMasterRepository extends JpaRepository<PriceMasterEntity,Long> {
}
