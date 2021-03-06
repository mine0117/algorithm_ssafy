package com.ssafy.hw;

public class Refrigerator extends Product {

	private String volume;

	public Refrigerator(int number, String brand, String price, String amount, String volume) {
		super(number, brand, price, amount);
		this.volume = volume;

	}

	public String toString() {

		return super.toString() + volume;

	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	

}
