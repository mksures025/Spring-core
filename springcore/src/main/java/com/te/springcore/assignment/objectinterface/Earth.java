package com.te.springcore.assignment.objectinterface;

public class Earth {
	
	private double planetRadius;
	private double waterOnPlanetPercentage;
	
	//* Dependency injection for interface Creature type attribute /
	private Creature creature;

	public Earth() {
		super();
	}

	public double getPlanetRadius() {
		return planetRadius;
	}

	public void setPlanetRadius(double planetRadius) {
		this.planetRadius = planetRadius;
	}

	public double getWaterOnPlanetPercentage() {
		return waterOnPlanetPercentage;
	}

	public void setWaterOnPlanetPercentage(double waterOnPlanetPercentage) {
		this.waterOnPlanetPercentage = waterOnPlanetPercentage;
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	@Override
	public String toString() {
		return "Earth [planetRadius=" + planetRadius + ", waterOnPlanetPercentage=" + waterOnPlanetPercentage
				+ ", creature=" + creature + "]";
	}
	
	

}
