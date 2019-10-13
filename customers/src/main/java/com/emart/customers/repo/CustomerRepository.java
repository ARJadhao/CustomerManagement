package com.emart.customers.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.customers.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
