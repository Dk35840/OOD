package com.dhananjay.cabbooking.model;

public abstract class Person {

	
	private String firstName;
	private String lastName;
	private String userId;
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private Role role;

	public Person(String firstName,String lastName,Location location,Role role) {

		this.firstName=firstName;
		this.lastName=lastName;
		this.role = role;
		this.location=location;
		this.userId=firstName+lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public boolean equalsByID(String id) {
		return this.getUserId().equals(id);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", role=" + role + "]";
	}

	

}
