package com.emart.customers.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.customers.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
