package com.dagy.cleanarchi.delivery.delivery.application.customer.repository;

import com.dagy.cleanarchi.delivery.delivery.application.customer.query.FilterCriteria;
import com.dagy.cleanarchi.delivery.delivery.domain.customer.Customer;
import com.dagy.cleanarchi.delivery.delivery.domain.customer.CustomerId;
import com.dagy.cleanarchi.delivery.delivery.domain.customer.EmailAddress;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    /**
     * Change details of a customer
     *
     * @param customer {@link Customer} including modified details.
     * @return {@link Customer} with modified details
     */
    Customer updateDetails(Customer customer);

    /**
     * Deletes a customer by id
     *
     * @param customerId {@link CustomerId} id of customer
     */
    void deleteBy(CustomerId customerId);

    /**
     * Retrieves all customer
     *
     * @param query {@link FilterCriteria} criteria filter
     * @return a list of {@link Customer} customers.
     */
    List<Customer> findAllBy(FilterCriteria query);

    /**
     * Retrieves a customer by {@link CustomerId} id
     *
     * @param customerId {@link CustomerId} unique identifier of customer
     * @return found customer
     */
    Optional<Customer> findBy(CustomerId customerId);

    /**
     * Retrieves a customer by {@link EmailAddress} email address
     *
     * @param email {@link EmailAddress} unique email address of customer
     * @return found customer
     */
    Optional<Customer> findByEmailAddress(EmailAddress email);

    /**
     * Stores a customer
     *
     * @param customer {@link Customer} to be stored
     */
    Customer save(Customer customer);
}
