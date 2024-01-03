package com.br.chap01.poly.model.vo;

public class Desktop extends Electronic{
	public static final String CPU = "intel";
	private String graphic;
	
	public Desktop() {}
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	public String getGraphicd() {
		return graphic;
	}
	@Override
	public String toString() {
		return super.toString()+CPU+graphic;
	}
}
