package com.debuggeandoideas.gadget_plus.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
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

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bill", nullable = false, unique = true)
    private BillEntity bill;

    @OneToMany(mappedBy = "order",
                fetch = FetchType.EAGER,
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private List<ProductEntity> products = new ArrayList<>();

    //Cascade PERSIST es para los save
    //Cascade MERGE es para los Update, cuando quieres persistir una entidad referenciada

    public void addProduct(ProductEntity product){
        this.products.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
