package model;

import java.util.ArrayList;
import java.util.List;

public class Genre {

	
	private String name;
	private String Descriptions;
	private List<Movie> movies= new ArrayList<>();
	
	public Genre() {}
	
	public Genre(String name, String description) {
		this.name= name;
		this.Descriptions=description;
	}
}
