package model;

import java.util.ArrayList;
import java.util.List;

public class Booking {
private MovieShow show;
private List<Transaction> transaction = new ArrayList<>();
private List<ShowSeat> seats= new ArrayList<>();
private double totalPrice=0;
private Coupon coupon;

public int numberOfSeats() {
	return seats.size();
}
}
