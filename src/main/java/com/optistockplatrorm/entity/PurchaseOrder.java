package com.optistockplatrorm.entity;

import com.optistockplatrorm.entity.Enums.PurchaseOrderStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    private Supplier supplier;

    @Enumerated(EnumType.STRING)
    @NotNull
    private PurchaseOrderStatus status;

    @NotNull
    private LocalDateTime createdAt;

    private LocalDateTime expectedDelivery;

}

