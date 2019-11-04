package com.emart.customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emart.customers.entity.Customer;
import com.emart.customers.exception.CustomerException;
import com.emart.customers.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer cust) {
		
		cust = customerService.saveCustomer(cust);
		return cust;
	}
	
	@GetMapping("/show/{id}")
	public Customer getCustomer(@PathVariable("id") Integer id) throws CustomerException {
		
		Customer customer = customerService.getCustomer(id);
		
		if(customer == null || customer.getCustomerId() <=0)
		{
			throw new CustomerException("Customer doesn't exist!");
		}
		return customer;
		
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomers() throws CustomerException{
		
		return  customerService.getAllCustomers();
		//return listOfCustomers;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) throws CustomerException{
		customerService.deleteCustomer(id);
	}
	
	
	
	@PutMapping("update/{id}")
	public Customer updateCustomer(@PathVariable("id") Integer id) throws CustomerException{
		
		
		return customerService.updateCustomer(id);
	}

}
