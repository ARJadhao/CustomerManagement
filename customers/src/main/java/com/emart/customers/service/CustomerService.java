package com.emart.customers.service;

import java.util.List;

import com.emart.customers.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	Customer getCustomer(Integer id);
	
	//get all customers
	List<Customer> getAllCustomers();
	
	// get customers from given city
	List<Customer> getCustomersInCity(String city);
	
	// delete a customer
	void deleteCustomer(Integer id);
	
	Customer updateCustomer(Integer id);
}
