package com.qa.day4.vehicle_exercise;

public abstract class Vehicle {

	private String manufacturer;
	private String colour;
	private int numOfWheels;
	private double price;
	private int id;
	
	public Vehicle (String colour, String manufacturer, int numOfWheels, double price, int id) {
		this.colour = colour;
		this.manufacturer = manufacturer;
		this.numOfWheels = numOfWheels;
		this.price = price;
		this.id = id;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public int getNumOfWheels() {
		return this.numOfWheels;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public int getId() {
		return this.id;
	}
	
	public abstract double calculateBill();
	
	@Override
	public String toString() {
		return String.format(
				"ID: %d | This vehicle is a %s %s made by %s, with %d wheels and costs %.2f", 
				this.id, this.colour, this.getClass().getSimpleName(), this.manufacturer, this.numOfWheels, this.price
		);
	}
}
