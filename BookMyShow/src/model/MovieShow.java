package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieShow {

	Movie movie;
	Date timingFrom;
	Date timingTo;
	
	Auditorium hall;
	List<Booking> bookings= new ArrayList();
	
	public MovieShow(Movie movie, Date timingFrom,Date timingTo) {
		this.movie=movie;
		this.timingFrom=timingFrom;
		this.timingTo= timingTo;
		
	}
}
