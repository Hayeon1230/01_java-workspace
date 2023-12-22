package com.br.chap03_class.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getPName(){
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String information() {
		//return pName+price+brand;
		String result = "pName : " + pName + "price : " + price + "brand : " + brand;
		return result;
	}
	
}
