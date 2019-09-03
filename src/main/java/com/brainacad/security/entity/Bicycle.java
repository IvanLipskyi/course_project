package com.brainacad.security.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table (name="Bicycle")
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

    @Column(name = "bicycle_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private BicycleType bicycleType;

    @Column(name = "material_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private MaterialType materialType;

    @Column(name = "frame_size", nullable = false)
    private Integer frameSize;

    @Column (name = "price", nullable = false)
    private Integer price;

    @Column (name = "quantity")
    private Integer quantity;


}
