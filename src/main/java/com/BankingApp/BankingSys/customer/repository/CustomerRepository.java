
package com.BankingApp.BankingSys.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingApp.BankingSys.customer.entity.Customer;

public interface CustomerRepository
        extends com.BankingApp.BankingSys.customer.repository.JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByPhone(String phone);
}
