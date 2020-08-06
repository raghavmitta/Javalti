package com.lti.resource;

public class Passenger {
	private String name;
	private Gender gender;
	private Status status;
	public Passenger(String name, Gender gender, Status status) {
		super();
		this.name = name;
		this.gender = gender;
		this.status = status;
	}
	public Passenger() {}
	
	public static enum Status{
		WAITING,RAC,CONFIRMED;
	}
	public static enum Gender{
		MALE,FEMALE,OTHER;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
