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
	public Customer getCustomer(@PathVariable("id") Integer id) {
		
		Customer customer = customerService.getCustomer(id);
		return customer;
		
	}
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomers(){
		
		return  customerService.getAllCustomers();
		//return listOfCustomers;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		customerService.deleteCustomer(id);
	}
	
	
	
	@PutMapping("update/{id}")
	public Customer updateCustomer(@PathVariable("id") Integer id) {
		return customerService.updateCustomer(id);
	}

}
