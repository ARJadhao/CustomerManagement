package com.emart.customers.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.customers.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
