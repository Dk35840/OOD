package com.dhananjay.cabbooking.service;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.dhananjay.cabbooking.model.Driver;
import com.dhananjay.cabbooking.model.Location;
import com.dhananjay.cabbooking.model.User;

class RidingServiceTest {

	@Test
	void test() throws IOException {

		File f = new File("Resourses.txt");

		BufferedReader br = new BufferedReader(new FileReader(f));

		List<Driver> driver = null;
		List<User> user = null;
		Double priceFirst5Km = 0.0;
		Double priceSAfter5Km = 0.0;
		String string;
		while ((string = br.readLine()) != null) {

			int num = Integer.valueOf(string.trim());
			driver = new ArrayList<>();
			System.out.println("Driver" + num);
			for (int i = 0; i < num; i++) {
				String[] str = br.readLine().split(" ");
				String firstName = str[0];
				String secondName = str[1];
				int x = Integer.valueOf(str[2].trim());
				int y = Integer.valueOf(str[3].trim());

				Location location = new Location(x, y);
				driver.add(new Driver(firstName, secondName, location));
			}

			num = Integer.valueOf(br.readLine().trim());
			user = new ArrayList<>();
			System.out.println("User" + user);
			for (int i = 0; i < num; i++) {
				String[] str = br.readLine().split(" ");

				String firstName = str[0];
				String secondName = str[1];
				int x = Integer.valueOf(str[2].trim());
				int y = Integer.valueOf(str[3].trim());
				int x2 = Integer.valueOf(str[4].trim());
				int y2 = Integer.valueOf(str[5].trim());

				Location src = new Location(x, y);
				Location dest = new Location(x2, y2);

				user.add(new User(firstName, secondName, src, dest));
			}

			priceFirst5Km = Double.valueOf(br.readLine().trim());
			priceSAfter5Km = Double.valueOf(br.readLine().trim());

		}

		RidingService ridingService = RidingService.getInstance();

		DriverBoarding driverBoarding = new DriverBoarding();
		UserBoarding userBoarding = new UserBoarding();
		ridingService.setPriceFirst5Km(priceFirst5Km);
		ridingService.setPriceFirst5Km(priceSAfter5Km);
		ridingService.setDriverBoarding(driverBoarding);
		ridingService.setUserBoarding(userBoarding);

		for (Driver d : driver) {
			driverBoarding.addDriver(d);
		}
		for (User u : user) {
			userBoarding.addUser(u);
		}

		
		List<Driver> availdriver=ridingService.findRide(user.get(0), user.get(0).getLocation(), user.get(0).getDestination());
		System.out.println("Availabel Driver" + availdriver);
		ridingService.chooseRide(user.get(0), availdriver.get(0));
		ridingService.calculateBill(user.get(0));
		ridingService.calculateTotalEarning();
		
	}

}
