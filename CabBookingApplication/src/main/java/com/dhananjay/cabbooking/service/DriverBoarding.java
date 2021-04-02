package com.dhananjay.cabbooking.service;

import java.util.List;

import com.dhananjay.cabbooking.model.Driver;
import com.dhananjay.cabbooking.model.Location;

public class DriverBoarding extends Boarding<Driver> {

	
	void addDriver(Driver driver) {
		super.addPerson(driver);
	}
	
	void updateLocation(String driverId,Location location) {
		List<Driver> driver=super.getPerson();
		
		for(Driver d:driver) {
			if(d.equalsByID(driverId))
				d.setLocation(location);
		}
	}
	
	void changeStatus(String driverId,Boolean isAvailable) {
		List<Driver> driver=super.getPerson();
		for(Driver d:driver) {
			if(d.equalsByID(driverId))
				d.setStatus(isAvailable);
		}
	}
	
	List<Driver> getDriver(){
		return super.getPerson();
	}
}
