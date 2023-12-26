package com.br.chap03_class.model.vo;

public class Snack {
	private String sName;
//	private String brand;
	private int price;
	private int kcal;
	
	public static final String BRAND = "농심"; //상수필드라 대문자
	
	// 기본생성자
	public Snack() {
		
	}
	
	// 매개변수생성자 => sName, price, kcal
	public Snack(String sName, int price, int kcal) {
		this.sName = sName;
		this.price = price;
		this.kcal =kcal;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	};
	/*
	public void setBrand(String brand) {
		this.brand = brand;
	};
	*/
	public void setPrice(int price) {
		this.price = price;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public String getsName() {
		return sName;
	}
	/*
	public String getBrand() {
		return brand;
	}
	*/
	public int getPrice() {
		return price;
	}
	public int getKcal() {
		return kcal;
	}
	
	public String information() {
		return sName + "/" + BRAND + "/" + price + "/" + kcal;
	}
	
}
