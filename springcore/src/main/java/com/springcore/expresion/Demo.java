package com.springcore.expresion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{4+5}")
	private int x;
	@Value("#{15+5}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;

	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	@Value("#{new java.lang.String('suresh')}")
	private String name;

	@Value("#{8>4}")
	private boolean ispresent;

	public Demo() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIspresent() {
		return ispresent;
	}

	public void setIspresent(boolean ispresent) {
		this.ispresent = ispresent;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", ispresent=" + ispresent
				+ "]";
	}

}
