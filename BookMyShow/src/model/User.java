package model;

import java.util.HashSet;
import java.util.Set;

public class User {

	Set<Role> roles= new HashSet<>();
	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSaltedHashedPassword() {
		return saltedHashedPassword;
	}


	public void setSaltedHashedPassword(String value) {
		this.saltedHashedPassword = value;//new BCryptPasswordEncoder(5).encode(value);
	}


	private String email;
	private String saltedHashedPassword;
	
	
	public User(User user) {
		email=user.getEmail();
		saltedHashedPassword=user.getSaltedHashedPassword();
		roles=user.getRoles();
	}
	
	
	
}
