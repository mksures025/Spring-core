package com.springcore.xml.constructorinjection.objectinj;

public class Employee {
	
	private int empId;
	private String empName;
	private String address;
	private Project project;
	
	
	public Employee() {
		super();
		
	}


	public Employee(int empId, String empName, String address, Project project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.project = project;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", project=" + project
				+ "]";
	}
	
	
	
	
	

}
