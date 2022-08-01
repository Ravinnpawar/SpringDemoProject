package com.demoproj;

/**
 * @author Om
 *
 */
public class Vehicle {
	private String vehicleName;
	private int vehicleSpeed;
	private int price;

	Engine engine;

	public Vehicle(Engine engine) {
		this.engine = engine;
	}

	public Vehicle(String vehicleName, int vehicleSpeed, int price) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleSpeed = vehicleSpeed;
		this.price = price;
	}
	public Vehicle() {
		super();
	}
	public String getVehicleName() {
		System.out.println("Name Of the Vehicle : "+this.vehicleName);
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;

	}
	public int getVehicleSpeed() {
		return vehicleSpeed;
	}
	public void setVehicleSpeed(int vehicleSpeed) {
		this.vehicleSpeed = vehicleSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void init(){
		System.out.println("Object initialization started..");
	}

	public void destroy(){
		System.out.println("Object is Destroyed..");
	}
	
	

}
