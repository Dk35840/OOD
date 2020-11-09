package model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

	private City city;
	private String name;
	
	private String address;
	
	private List<Auditorium> halls = new ArrayList<>();
	
	private boolean hasParking;
	
	private boolean hasDinner;
	
	private Cinema(City city,String name) {
		this.city=city;
		this.name=name;
	}
}
