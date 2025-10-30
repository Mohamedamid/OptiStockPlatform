package com.optistockplatform.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    @PositiveOrZero
    private Integer qtyOnHand;

    @PositiveOrZero
    private Integer qtyReserved;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(Integer qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public Integer getQtyReserved() {
        return qtyReserved;
    }

    public void setQtyReserved(Integer qtyReserved) {
        this.qtyReserved = qtyReserved;
    }
}

