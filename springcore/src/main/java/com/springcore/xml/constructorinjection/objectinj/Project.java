package com.springcore.xml.constructorinjection.objectinj;

public class Project {
	
	private String projectName;
	private String projectDuration;
	private String projectClient;
	
	public Project() {
		super();
	}

	public Project(String projectName, String projectDuration, String projectClient) {
		super();
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.projectClient = projectClient;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectDuration=" + projectDuration + ", projectClient="
				+ projectClient + "]";
	}
	
	
	
	

}
