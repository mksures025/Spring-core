package com.te.springcore.coupling.tightcoupling;

import com.te.springcore.coupling.loosecoupling.Cars;
import com.te.springcore.coupling.loosecoupling.Volvos;

public class Drivers {

	public static void main(String[] args) {
		
//		Volvo volvo=new Volvo();
//		
//		volvo.volvo();
		
		
	Cars cars=new Volvos();
	
	cars.drive();

	}

}
