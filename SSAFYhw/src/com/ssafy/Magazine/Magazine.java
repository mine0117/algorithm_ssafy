package com.ssafy.Magazine;

public class Magazine {

	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int month;
	private int price;
	private String desc;

	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year,
			int month) {

		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
		this.year = year;
		this.month = month;
	}
	public String toString() {
		return this.isbn + " | " + this.title + " | " + this.author+ " | " + this.author +" | " + this.publisher + " | " +
				this.price + " | " + this.desc+" | " + this.year +" | " + this.month;
	}
	
}
