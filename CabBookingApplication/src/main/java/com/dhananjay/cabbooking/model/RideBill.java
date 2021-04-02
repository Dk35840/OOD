package com.dhananjay.cabbooking.model;

public class RideBill {

	private Location source;
	private Location destination;
	public RideBill(Location source, Location destination, double totalDistance, double totalAmount) {
		super();
		this.source = source;
		this.destination = destination;
		this.totalDistance = totalDistance;
		this.totalAmount = totalAmount;
	}
	@Override
	public String toString() {
		return "RideBill [source=" + source + ", destination=" + destination + ", totalDistance=" + totalDistance
				+ ", totalAmount=" + totalAmount + "]";
	}
	private Double totalDistance;
	private Double totalAmount;
	public Location getSource() {
		return source;
	}
	public void setSource(Location source) {
		this.source = source;
	}
	public Location getDestination() {
		return destination;
	}
	public void setDestination(Location destination) {
		this.destination = destination;
	}
	public Double getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(Double totalDistance) {
		this.totalDistance = totalDistance;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
