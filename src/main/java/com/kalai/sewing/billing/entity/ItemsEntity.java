package com.kalai.sewing.billing.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "ITEMS")
@Getter
@Setter
public class ItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "ITEMID")
    private Long id;
    @NonNull
    @Column(name = "MODELCODE")
    private String modelCode;
    @NonNull
    @Column(name = "MODELNAME")
    private String modelName;
    @NonNull
    @Column(name = "QUANTITY")
    private double quantity;
    @NonNull
    @Column(name = "PRICEPERPIECE")
    private double pricePerPiece;
    @NonNull
    @Column(name = "AMOUNT")
    private double amount;
    @NonNull
    @Column(name = "GST")
    private double gst;
    @NonNull
    @Column(name = "CGST")
    private double cGst;
}
