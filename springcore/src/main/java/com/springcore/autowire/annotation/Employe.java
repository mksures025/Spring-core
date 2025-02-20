package com.springcore.autowire.annotation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;


public class Employe{
	
		private int empid;
		private String empName;
	
	    @Autowired
		@Qualifier("adress1")
		private final Address adress;
	    
    


	public Employe(int empid, String empName, Address adress) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.adress = adress;
	}


	public Employe() {
		super();
		
	this.adress =new Address();
	System.out.println("Empty construtor");
	
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
		return "Employe [adress=" + adress + "]";
	}

}
