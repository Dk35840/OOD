package com.dhananjay.cabbooking.model;

public class Driver extends Person {

	private String vehicleName;
	
	private boolean isAvailable;
	
	private double totalEarning;

	public Driver(String firstName, String secondName,Location location) {

		super(firstName, secondName,location, Role.Driver);

	}

	@Override
	public  String toString() {
		return "Driver" + super.toString();
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public double getTotalEarning() {
		return totalEarning;
	}

	public void setTotalEarning(double totalEarning) {
		this.totalEarning = totalEarning;
	}

	public void setLocation(Location location) {
		super.setLocation(location); 
	}

	public void setStatus(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public void setName(String firstName, String lastName) {
		
		super.setFirstName(firstName);
		super.setLastName(lastName);
	}

	
}
