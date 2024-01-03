package com.br.chap01.poly.model.vo;

public class Electronic {

	private String brand;
	private String name;
	private int price;
	
	public Electronic() {}
	public Electronic(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public String setName() {
		return name;
	}
	public int setPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return brand + name + price;
	}
	
}
