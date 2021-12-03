package com.kalai.sewing.billing.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "PRICE_MASTER")
public class PriceMasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "MODEL_CODE")
    @NonNull
    private String modelCode;
    @Column(name = "MODEL_NAME")
    @NonNull
    private String modelName;
    @Column(name = "MODEL_TYPE")
    @NonNull
    private String modelType;
    @Column(name = "BRAND_NAME")
    @NonNull
    private String brandName;
    @Column(name = "PURCHASE_PRICE")
    @NonNull
    private double purchasePrice;
    @Column(name = "DEALER_PRICE")
    @NonNull
    private double dealerPrice;
    @Column(name = "MRP")
    @NonNull
    private double mrp;
    @Column(name = "CONSUMER_PRICE")
    @NonNull
    private double consumerPrice;
}
