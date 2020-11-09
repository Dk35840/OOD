package model;

import java.util.ArrayList;
import java.util.List;

public class AudiSeat extends Auditable{

	private List<ShowSeat> showSeats= new ArrayList<>();
	private List<SeatFeature> features= new ArrayList<>();
	private String rowNumber;
	private String seatNumber;
	
	public AudiSeat() {
		
	}
	
	public AudiSeat(String rowNumber,String seatNumber) {
		this.rowNumber=rowNumber;
		this.seatNumber=seatNumber;
	}
	
	// getter setters
	public List<ShowSeat> getShowSeats() {
		return showSeats;
	}
	public void setShowSeats(List<ShowSeat> showSeats) {
		this.showSeats = showSeats;
	}
	public List<SeatFeature> getFeatures() {
		return features;
	}
	public void setFeatures(List<SeatFeature> features) {
		this.features = features;
	}
	public String getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
}
