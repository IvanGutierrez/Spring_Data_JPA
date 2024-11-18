package com.debuggeandoideas.gadget_plus.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "client_name", length = 32, nullable = false)
    private String clientName;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "id_bill", nullable = false, unique = true)
    private BillEntity bill;

    //Cascade PERSIST es para los save
    //Cascade MERGE es para los Update, cuando quieres persistir una entidad referenciada
}
