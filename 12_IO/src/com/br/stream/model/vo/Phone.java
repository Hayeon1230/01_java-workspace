package com.br.stream.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ // 직렬화
	
	private String name;
	private int price;
	
	// 기본생성자, 매개변수생성자, getter/setter, toString메소드
	public Phone() {}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	

}
