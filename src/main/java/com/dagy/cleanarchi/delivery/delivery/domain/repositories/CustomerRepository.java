package com.dagy.cleanarchi.delivery.delivery.domain.repositories;

import com.dagy.cleanarchi.delivery.delivery.domain.entities.jpa.Customer;

import java.util.Optional;

public interface CustomerRepository {
    Customer persist(Customer customer);

    boolean existsByEmail(String email);

    Optional<Customer> findByEmail(String email);

    Optional<Customer> findById(Long id);
}
