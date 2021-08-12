package com.springcore.auto.wire;

public class Address {
	private String state;
	private String country;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [\n   state=" + state + ",\n   country=" + country + "\n ]";
	}
	
	
}
