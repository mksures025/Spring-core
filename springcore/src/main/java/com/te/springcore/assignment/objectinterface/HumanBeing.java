package com.te.springcore.assignment.objectinterface;

public class HumanBeing implements Creature{

	@Override
	public String creatureName() {
		
		return "Mk";
	}

	@Override
	public String creatureType() {
		// TODO Auto-generated method stub
		return " natural";
	}

	@Override
	public String toString() {
		return "HumanBeing [creatureName : " + creatureName()
		+ ", creatureType : " + creatureType() + "]";
	}
	
	

}
