package com.berry;

public class commonEntity {
	private String id;
	private String name;
	private String occuption;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccuption() {
		return occuption;
	}

	public void setOccuption(String occuption) {
		this.occuption = occuption;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " , name :" + name + ", occuption: " + occuption;
	}

}
