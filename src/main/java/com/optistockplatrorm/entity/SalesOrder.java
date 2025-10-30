package com.optistockplatrorm.entity;

import com.optistockplatrorm.entity.Enums.OrderStatus;
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
public class SalesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    private Client client;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @NotNull
    private LocalDateTime createdAt;

    private LocalDateTime reservedAt;
    private LocalDateTime shippedAt;

}

