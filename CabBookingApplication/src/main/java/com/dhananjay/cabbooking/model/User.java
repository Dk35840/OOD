package com.dhananjay.cabbooking.model;

public class User extends Person {

	private Location destination;
	private RideBill rideBill;
	
	public Location getDestination() {
		return destination;
	}

	public void setDestination(Location destination) {
		this.destination = destination;
	}

	
	

	public RideBill getRideBill() {
		return rideBill;
	}

	public void setRideBill(RideBill rideBill) {
		this.rideBill = rideBill;
	}

	public User(String firstName, String secondName, Location source, Location destination) {
		super(firstName, secondName, source, Role.Driver);
		this.destination = destination;
	}

	public boolean equals(Object obj) {

		if (!(obj instanceof User) || obj == null)
			return false;

		User user = (User) obj;

		return user.getUserId().equals(this.getUserId());
	}

}
