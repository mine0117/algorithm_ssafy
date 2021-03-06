package com.ssafy.hw;

public class Product {
	private int number;
	private String brand;
	private String price;
	private String amount;

	public Product(int number, String brand, String price, String amount) {
		super();
		this.number = number;
		this.brand = brand;
		this.price = price;
		this.amount = amount;
		return;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [number=" + number + ", brand=" + brand + ", price=" + price + ", amount=" + amount + "]";
	}

}
