package com.br.chap03_class.model.vo;

public class Product {
	
	/*
	 * - pName : String
	 * - price : int
	 * - brand : String 
	 */
	private String pName;
	private int price;
	private String brand;
	
	// 기본생성자 (매개변수 없는 생성자)
	public Product() {
		// 객체 생성만
	}
	
	// 매개변수 3개짜리 생성자 (객체 생성과 동시에 각 필드에 값 초기화)
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	// * setter 메소드
	/*
	public void setPName(String pName) {
		
	}
	*/
	
	/*
	public void setPname(String pName) {
		
	}
	*/
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// * getter메소드
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return /*this.*/brand;
	}
	
	// 모든 필드값들을 한 문자열로 합쳐서 반환해주는 메소드
	public String information() {
		String result = "pName : " + pName + ", price : " + price + ", brand : " + brand;
		return result;
	}

}
