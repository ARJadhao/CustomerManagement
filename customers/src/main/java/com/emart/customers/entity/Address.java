package com.emart.customers.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name="addressId", strategy ="increment")
@Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue(generator="addressId")
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private Long pinCode;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Long getPinCode() {
		return pinCode;
	}
	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", pinCode=" + pinCode + "]";
	}

	
}
