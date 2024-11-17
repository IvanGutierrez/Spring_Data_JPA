package com.debuggeandoideas.gadget_plus.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "client_name", length = 32, nullable = false)
    private String clientName;


}
