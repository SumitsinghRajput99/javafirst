package com.psl.model;

public class Car {
	private String make, model, color;
	private int price;
	// no arg Constructor
	public Car() {
		this.make="maruti";
		this.model="sports";
		this.color="White";
		this.price=300000;
	}
	//parameterized constructor
	public Car(String make,String model, String color, int price) {
		this.make=make;
		this.model=model;
		this.color=color;
		this.price=price;
	}
	//getter for make variable
	public String getMake() {
		return make;
	}
	// setter for make variable
	public void setMake(String make) {
		this.make = make;
	}
	//getter for model variable
	public String getModel() {
		return model;
	}
	//setter for model variable
	public void setModel(String model) {
		this.model = model;
	}
	//getter for color
	public String getColor() {
		return color;
	}
	//setter for color
	public void setColor(String color) {
		this.color = color;
	}
	// getter for price
	public int getPrice() {
		return price;
	}
	// setter for price
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
