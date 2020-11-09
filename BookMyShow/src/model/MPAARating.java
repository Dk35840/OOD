package model;

public enum MPAARating {

	GeneralAudiences("G"), Restricted("R");

	private String code;

	MPAARating(String code) {
		this.code = code;
	}

}
