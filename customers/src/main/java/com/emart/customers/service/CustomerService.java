package com.emart.customers.service;

import java.util.List;

import com.emart.customers.entity.Customer;
import com.emart.customers.exception.CustomerException;

public interface CustomerService {

	Customer saveCustomer(Customer customer);
	Customer getCustomer(Integer id) throws CustomerException;
	
	//get all customers
	List<Customer> getAllCustomers();
	
	// get customers from given city
	List<Customer> getCustomersInCity(String city);
	
	// delete a customer
	void deleteCustomer(Integer id) throws CustomerException;
	
	Customer updateCustomer(Integer id) throws CustomerException;
}
