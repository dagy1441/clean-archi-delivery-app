package com.dagy.cleanarchi.delivery.delivery.domain.entities.jpa;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.Set;

@Entity(name = "order")
@EqualsAndHashCode(of = {"customer", "store", "total", "status", "createdAt", "updatedAt"})
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Table(name = "orders")
@ToString(of = {"customer", "store", "total", "status", "createdAt", "updatedAt"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "order",
            cascade = {CascadeType.MERGE, CascadeType.PERSIST},
            orphanRemoval = true
    )
    private Set<OrderItem> orderItems;

    @Column(nullable = false)
    private Double total;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @CreatedDate
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
