package com.br.chap02_objectArray.model.vo;

public class Phone {
	
	// 이름, 브랜드명, 가격, 시리즈
	private String name;
	private String brand;
	private int price;
	private String series;
	
	// 기본생성자
	public Phone() {}
	
	// 매개변수생성자
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	// 각 필드에 대한 getter/setter메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	// 모든 필드값 하나로 합쳐서 반환 information메소드
	@Override
	public String toString() {
		return name + ", " + brand + ", " + price + ", " + series;
	}
	
	
	

}
