package model;

import java.util.Date;

public class Coupon {

	private String code;
	private int maxUsage;
	private Date expiresOn= new Date();
	private Coupon(String code) {
		this.code=code;
	}
	
}
