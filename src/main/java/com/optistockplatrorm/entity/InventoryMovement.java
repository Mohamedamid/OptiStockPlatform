package com.optistockplatrorm.entity;

import com.optistockplatrorm.entity.Enums.MovementType;
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
public class InventoryMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private MovementType type;

    @Positive
    private Integer quantity;

    @NotNull
    private LocalDateTime occurredAt;

    @Size(max = 255)
    private String referenceDocument;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Warehouse warehouse;

    private String description;

}

