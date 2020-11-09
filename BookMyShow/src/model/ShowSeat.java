package model;

public class ShowSeat {

	private Booking booking;
	private MovieShow show;
	private ShowSeatStatus status = ShowSeatStatus.AVAILABLE;
	private double price;

	private ShowSeat(MovieShow show, double price) {
		this.show = show;
		this.price = price;
	}
	
}
