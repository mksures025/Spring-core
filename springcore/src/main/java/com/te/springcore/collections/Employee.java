package com.te.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Employee {

	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;

	public Employee() {
		super();
	}

	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addresses, courses, name, phones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(addresses, other.addresses) && Objects.equals(courses, other.courses)
				&& Objects.equals(name, other.name) && Objects.equals(phones, other.phones);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ "]";
	}

}
