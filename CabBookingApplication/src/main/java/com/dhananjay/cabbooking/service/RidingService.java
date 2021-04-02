package com.dhananjay.cabbooking.service;

import java.util.List;
import java.util.stream.Collectors;

import com.dhananjay.cabbooking.model.Driver;
import com.dhananjay.cabbooking.model.Location;
import com.dhananjay.cabbooking.model.RideBill;
import com.dhananjay.cabbooking.model.User;

public class RidingService {

	private static RidingService instance = new RidingService();

	private DriverBoarding driverBoarding;
	private UserBoarding userBoarding;

	private Double priceFirst5Km;
	private Double priceSAfter5Km;

	public DriverBoarding getDriverBoarding() {
		return driverBoarding;
	}

	public void setDriverBoarding(DriverBoarding driverBoarding) {
		this.driverBoarding = driverBoarding;
	}

	public UserBoarding getUserBoarding() {
		return userBoarding;
	}

	public void setUserBoarding(UserBoarding userBoarding) {
		this.userBoarding = userBoarding;
	}

	public Double getPriceFirst5Km() {
		return priceFirst5Km;
	}

	public void setPriceFirst5Km(Double priceFirst5Km) {
		this.priceFirst5Km = priceFirst5Km;
	}

	public Double getPriceSAfter5Km() {
		return priceSAfter5Km;
	}

	public void setPriceSAfter5Km(Double priceSAfter5Km) {
		this.priceSAfter5Km = priceSAfter5Km;
	}

	public static RidingService getInstance() {

		return instance;
	}

	List<Driver> findRide(User user, Location source, Location destination) {
		List<Driver> driverList = driverBoarding.getDriver();

		List<Driver> availableDriver = driverList.stream().collect(Collectors.toList());

		return availableDriver;
	}

	private double distance(Location X,Location X2) {
		
		double x1=X.getX();
		double y1=X.getY();
		
		double x2=X2.getX();
		double y2=X2.getY();
		
		return Math.sqrt((y2-y1)*(y2-y1) +(x2-x1)*(x2-x1));
	}
	void chooseRide(User user, Driver driver) {
		System.out.println("Ride started");
		
		double distance=distance(user.getLocation(), user.getDestination());
		
		double price=0;
		if(distance>5) {
			price+=priceFirst5Km;
			distance-=5;
			price+=priceFirst5Km+distance*priceSAfter5Km;
		}else {
			price=priceFirst5Km;
		}
		
		RideBill rideBill= new RideBill(user.getLocation(),user.getDestination(),distance,price);
		user.setRideBill(rideBill);
		driver.setTotalEarning(driver.getTotalEarning()+price);
		userBoarding.updateLocation(user.getUserId(),  user.getDestination());
		driverBoarding.updateLocation(driver.getUserId(), user.getDestination());
		
		
		
	}
	void calculateBill(User user) {
		
		System.out.println(user.getRideBill());
	}

	void calculateTotalEarning() {

		List<Driver> driverList = driverBoarding.getDriver();
			
		// return driverList.stream().mapToDouble(driver ->
		// driver.getTotalEarning()).sum();

		for (Driver driver : driverList)
			System.out.println(driver.getTotalEarning());
	}
}
