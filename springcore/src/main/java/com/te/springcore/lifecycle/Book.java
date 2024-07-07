package com.te.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// here we initialize the life method directly using configuration-xml file.
public class Book {

	private double bookPrice;

	public Book() {
		super();
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookPrice=" + bookPrice + "]";
	}

	@PostConstruct
	public void hi() {
		System.out.println("from book inti method : HI");
	}

	@PreDestroy
	public void bye() {
		System.out.println("from  Book  destroy method : bye");
	}

}
