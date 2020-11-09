package model;

public class Auditorium {

	private Cinema cinema;
	private boolean hasAirConditioner;
	private int numberOfExits;
	private int numberOfEmergencyExits;
	private boolean canHost3D;
	private String hallName;
	
	private Auditorium(Cinema cinema, String hallName) {
		this.cinema=cinema;
		this.hallName=hallName;
	}
}
