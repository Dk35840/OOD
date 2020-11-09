package model;

import java.util.ArrayList;
import java.util.List;

public class City {

	private String name;
	private String state;
	private String country;
	
	private List<Cinema> cinemas= new ArrayList<>();
	
	public City() {}
	
	public City(String name,String state,String country) {
		this.name=name;
		this.state=state;
		this.country=country;
	}
}
