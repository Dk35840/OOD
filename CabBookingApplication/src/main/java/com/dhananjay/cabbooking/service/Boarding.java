package com.dhananjay.cabbooking.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.dhananjay.cabbooking.model.Person;



public abstract class Boarding<T> {

	private List<T> persons;
	
	
	public Boarding() {
		persons= new LinkedList<>();
	}
	
	void addPerson(T person) {
		persons.add(person);
	}
	
	List<T> getPerson(){
		return persons;
	}
}

