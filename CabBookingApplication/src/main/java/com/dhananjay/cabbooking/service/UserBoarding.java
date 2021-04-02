package com.dhananjay.cabbooking.service;

import java.util.List;
import java.util.function.Predicate;

import com.dhananjay.cabbooking.model.Driver;
import com.dhananjay.cabbooking.model.Location;
import com.dhananjay.cabbooking.model.User;

public class UserBoarding extends Boarding<User>{

	void addUser(User user) {
		super.addPerson(user);
	}
	
	void updateUser(String userid,String name) {
		List<User> user=super.getPerson();
		
		for(User u:user) {
			if(u.equalsByID(userid)) {
				u.setFirstName(name);
			}
			break;
		}
	}
	
	void updateLocation(String userId,Location location) {
		List<User> users=super.getPerson();
		
		for(User d:users) {
			if(d.equalsByID(userId))
				d.setLocation(location);
		}
	}
}
