package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside Constructor parameterised");
		this.address = address;
	}

	public Emp(Address address) {
		super();
		System.out.println("Inside Constructor default");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [\n address=" + address + "\n]";
	}
	
	
}
