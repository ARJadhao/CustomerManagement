package com.emart.customers.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name="custId", strategy ="increment")
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(generator="custId")
	private Integer customerId;
	
	@NotEmpty(message = "first name must not be empty")
	private String name;
	
	@NotEmpty(message = "email must not be empty")
	@Email(message = "email should be a valid email")
	private String emailId;
	
	// one customer has one address
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	
	// one customer has multiple vehicles
	//@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="vehicleId")
	//private List<Vehicle> vehicles;
	private Vehicle vehicle;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailId=" + emailId + ", address=" + address
				+ ", vehicle=" + vehicle + "]";
	}
	
	
	
	

}
