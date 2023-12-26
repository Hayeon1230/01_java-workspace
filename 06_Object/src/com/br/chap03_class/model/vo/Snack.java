package com.br.chap03_class.model.vo;

public class Snack {
	private String sName;
	private String brand;
	private int price;
	private int kcal;
	
	public void setsName(String sName) {
		this.sName = sName;
	};
	public void setBrand(String brand) {
		this.brand = brand;
	};
	public void setPrice(int price) {
		this.price = price;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public String getsName() {
		return sName;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public int getKcal() {
		return kcal;
	}
	
	public String information() {
		return sName + "/" + brand + "/" + price + "/" + kcal;
	}
	
}
