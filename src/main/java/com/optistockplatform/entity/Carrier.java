package com.optistockplatform.entity;

import com.optistockplatform.entity.Enums.CarrierStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;


@Entity
public class Carrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String contactEmail;

    @Positive
    private BigDecimal capacityWeight;

    @Positive
    private BigDecimal capacityVolume;

    private boolean active;

    @Enumerated(EnumType.STRING)
    private CarrierStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public BigDecimal getCapacityWeight() {
        return capacityWeight;
    }

    public void setCapacityWeight(BigDecimal capacityWeight) {
        this.capacityWeight = capacityWeight;
    }

    public BigDecimal getCapacityVolume() {
        return capacityVolume;
    }

    public void setCapacityVolume(BigDecimal capacityVolume) {
        this.capacityVolume = capacityVolume;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CarrierStatus getStatus() {
        return status;
    }

    public void setStatus(CarrierStatus status) {
        this.status = status;
    }
}

