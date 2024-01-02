package com.br.chap01.poly.model.vo;

public class Tablet extends Electronic{

	private boolean penFlag;
	
	public Tablet() {}
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	public void setPenFlag(boolean usbPort) {
		this.penFlag = penFlag;
	}
	
	public boolean isPenFlag() {
		return penFlag;
	}
	@Override
	public String toString() {
		return super.toString()+(penFlag ? "있음" : "없음");
	}
}
