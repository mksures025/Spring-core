package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;

	private Map<String, Integer> features;
	
	private Properties properties;

	public Person() {
		super();
	}


	public Person(List<String> friends, Map<String, Integer> features, Properties properties) {
		super();
		this.friends = friends;
		this.features = features;
		this.properties = properties;
	}


	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeatures() {
		return features;
	}

	public void setFeatures(Map<String, Integer> features) {
		this.features = features;
	}
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", features=" + features + ", properties=" + properties + "]";
	}

	

}
