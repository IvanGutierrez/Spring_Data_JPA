package com.debuggeandoideas.gadget_plus.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "bill")
@Data
public class BillEntity {

    @Id
    @Column(length = 64, nullable = true)//El nullabe TRUE es ṕor default y lo marca en gris
    private String id;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "client_rfc", length = 14, nullable = false)
    private String rfc;
}
