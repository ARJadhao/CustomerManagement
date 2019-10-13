package com.emart.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emart.customers.service.CustomerServiceImpl;

@SpringBootApplication
public class CustomersApplication {

	@Autowired
	CustomerServiceImpl custServiceImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}
	
	
	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * 
	 * // customer one Customer customer = new Customer(); Address address = new
	 * Address(); Vehicle bike = new Vehicle(); Vehicle car = new Vehicle();
	 * 
	 * bike.setVehicleId(505); bike.setVehicleType("Bike");
	 * 
	 * car.setVehicleId(707); car.setVehicleType("Car");
	 * 
	 * address.setAddressId(101); address.setAddressLine1("Infosys Circle");
	 * address.setAddressLine2("Pune"); address.setPinCode(411057L);
	 * 
	 * customer.setCustomerId(7); customer.setEmailId("abc@infy.com");
	 * customer.setName("Bond"); customer.setAddress(address);
	 * 
	 * customer.setVehicle(car);
	 * 
	 * 
	 * List<Vehicle> list1 = new ArrayList<>(); list1.add(bike);
	 * customer.setVehicles(list1);
	 * 
	 * 
	 * 
	 * // customer two Customer customer2 = new Customer(); Address address2 = new
	 * Address();
	 * 
	 * address2.setAddressId(102); address2.setAddressLine1("Wipro Circle");
	 * address2.setAddressLine2("Pune"); address2.setPinCode(411057L);
	 * 
	 * customer2.setCustomerId(8); customer2.setEmailId("xyz@wipro.com");
	 * customer2.setName("Rick"); customer2.setAddress(address2);
	 * 
	 * customer2.setVehicle(bike);
	 * 
	 * 
	 * 
	 * List<Vehicle> list2 = null; list2.add(bike); list2.add(car);
	 * customer2.setVehicles(list2);
	 * 
	 * 
	 * 
	 * //***** Persist Object Customer persistedCustomer =
	 * custService.saveCustomer(customer); Customer persistedCustomer2 =
	 * custService.saveCustomer(customer2); //**** retrieve Object
	 * custService.getCustomer(007); System.out.println(persistedCustomer);
	 * System.out.println(persistedCustomer2);
	 * 
	 * //*****get all customers List<Customer> allCustomers =
	 * custService.getAllCustomers(); //System.out.println(allCustomers);
	 * for(Customer iter : allCustomers) { System.out.println(iter.getName()); }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
