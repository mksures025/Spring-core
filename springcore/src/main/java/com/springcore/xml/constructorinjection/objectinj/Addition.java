package com.springcore.xml.constructorinjection.objectinj;

public class Addition {
	
	private int a;
	private int b;
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("Int Constructor");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b =(int) b;
		System.out.println("Double Constructor");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String Constructor");
	}
	
	
	
	
	public void sum() {
		System.out.println("sum is :"+ (this.a +this.b));
	}
	

}
