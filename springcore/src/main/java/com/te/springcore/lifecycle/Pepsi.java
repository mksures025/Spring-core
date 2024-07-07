package com.te.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


// to initialize the life cycle method by interface 
public class Pepsi implements InitializingBean,DisposableBean {

	private double pepsiPrice;

	public Pepsi() {
		super();
	}

	public double getPepsiPrice() {
		return pepsiPrice;
	}

	public void setPepsiPrice(double pepsiPrice) {
		this.pepsiPrice = pepsiPrice;
	}

	@Override
	public String toString() {
		return "Pepsi [pepsiPrice=" + pepsiPrice + "]";
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("pepsi : init");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("pepsi : destroy");
		
	}
	
	
}
