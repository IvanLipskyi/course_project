package com.brainacad.security.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table (name="Bicycles")
public class Bicycle {

    @Id
    @GeneratedValue
    @Column(name = "bicycle_id", nullable = false)
    private Long id;

    @Column(name = "bicycle_name", length = 72, nullable = false)
    private String bicycleName;

    @Column(name = "brand_name", nullable = false)
    @Enumerated(EnumType.STRING)
    private BrandName brandName;

//    @Column(name = "bicycle_type", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private BicycleType bicycleType;
//
//    @Column(name = "material_type", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private MaterialType materialType;
//
//    @Column(name = "frame_size")
//    private int frameSize;
//
//
//    @Column (name = "price", nullable = false)
//    private BigDecimal price;
//
//    @Column (name = "quantity")
//    private int quantity;


}
