package com.debuggeandoideas.gadget_plus.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "products")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigInteger quantity;

    @ManyToOne//(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order")
    private OrderEntity order;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product_catalog")
    private ProductCatalogEntity catalog;
}
