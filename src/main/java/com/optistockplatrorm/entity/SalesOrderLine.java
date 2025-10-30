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
public class SalesOrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    private Product product;

    @Positive
    private Integer quantity;

    @Positive
    private BigDecimal unitPrice;

    private boolean backOrder;

    @ManyToOne
    private SalesOrder salesOrder;

}

