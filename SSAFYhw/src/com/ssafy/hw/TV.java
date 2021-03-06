package com.ssafy.hw;

public class TV extends Product {

	private String inch;
	private String type;

	public TV(int number, String brand, String price, String amount, String inch, String type) {
		super(number, brand, price, amount);

		this.inch = inch;
		this.type = type;
	}

	public String toString() {

		return super.toString() + inch + type;
	}

	public String getInch() {
		return inch;
	}

	public void setInch(String inch) {
		this.inch = inch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
