package com.optistockplatrorm.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String sku;

    @NotBlank
    private String name;

    @NotBlank
    private String category;

    @Positive
    private BigDecimal avgPrice;

    private boolean active;

}

