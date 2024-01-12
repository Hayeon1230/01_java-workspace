package com.br.chap03_class.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	// 기본생성자 (매개변수 없는 생성자)
	public Product() {
		//객체 생성만
	}
	//매개변수 3개짜리 생성자(객체 생성과 동시에 각 필드에 값 초기화)
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	// * setter 메소드
	/*
	public void setPName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// * getter 메소드
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
	*/
}
