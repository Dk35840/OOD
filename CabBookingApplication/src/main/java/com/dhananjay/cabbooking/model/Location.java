package com.dhananjay.cabbooking.model;

public class Location {

	public Location(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}
	private Integer x;
	@Override
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}
	private Integer y;
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
}
