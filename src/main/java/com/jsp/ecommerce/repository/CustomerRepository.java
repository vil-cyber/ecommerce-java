package com.jsp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	boolean existsByEmail(String email);
	Customer findByEmail(String email);
}
