package com.dr.chap01_beforVSafter.after.model.vo;

public class Product {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public String getpName() {
		return pName;
	}
	public String getpCode() {
		return pCode;
	}
	public int getPrice() {
		return price;
	}
	
	
	public String information() {
		return brand + ", " + pName + ", " + pCode + ", " + price;
	}
}
