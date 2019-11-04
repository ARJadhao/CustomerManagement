package com.emart.customers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name="vehicleId", strategy ="increment")
@Table(name="Vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(generator="vehicleId")
	private Integer vehicleId;
	
	@NotEmpty(message = "Vehicle Type must not be empty")
	private String vehicleType;
	
	public Integer getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + "]";
	}
	
	
}
