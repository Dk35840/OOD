package model;

public class SeatFeature {

	String name;
	String descriptions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public SeatFeature() {

	}

	public SeatFeature(String name, String descriptions) {

		this.name = name;
		this.descriptions = descriptions;
	}

}
