package com.optistockplatrorm.entity;

import com.optistockplatrorm.entity.Enums.CarrierStatus;
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
}

