package com.kalai.sewing.billing.repo;

import com.kalai.sewing.billing.entity.PriceMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PriceMasterRepository extends JpaRepository<PriceMasterEntity,Long> {
    @Query(value = "select * from price_master  where model_code= :searchString OR model_name LIKE CONCAT('%',:searchString,'%')",nativeQuery = true)
    List<PriceMasterEntity> findBySeacrhString(@Param("searchString") String searchString);
}
