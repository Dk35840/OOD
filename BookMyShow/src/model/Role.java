package model;

public class Role {

	private String name;
	private String description;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Role() {}
	
	public Role(String name,String desctiption) {
		this.name=name;
		this.description=desctiption;
	}
}
