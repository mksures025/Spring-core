package com.springcore.autowire.xml;

public class Employee {

	private Address adress;

	public Employee() {
		super();
	}

	public Employee(Address adress) {
		super();
		System.out.println("Constructor injection");
		this.adress = adress;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		
		System.out.println("Setter injection");
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [adress=" + adress + "]";
	}

}
