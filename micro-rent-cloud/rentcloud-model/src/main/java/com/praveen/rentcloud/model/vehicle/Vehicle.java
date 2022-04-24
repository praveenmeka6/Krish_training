package com.praveen.rentcloud.model.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String make;
    String model;
    String type;
    int year;
    int odometerValueOnRegister;
    String color;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getOdometerValueOnRegister() {
		return odometerValueOnRegister;
	}
	public void setOdometerValueOnRegister(int odometerValueOnRegister) {
		this.odometerValueOnRegister = odometerValueOnRegister;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}   
}
