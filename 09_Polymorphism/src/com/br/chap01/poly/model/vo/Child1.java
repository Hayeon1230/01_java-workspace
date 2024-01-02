package com.br.chap01.poly.model.vo;

public class Child1 extends Parent {

	private int z;
	
	public Child1() {
		// super(); // 기본적으로 작성되어있음 (따라서 자식객체 생성시 부모객체가 먼저 생성됨)
	}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void setZ(int z) {
		this.z = z;
	}
		
	public int getZ() {
		return z;
	}

	public void printChild1() {
		System.out.println("나 자식클래스1이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 자식클래스1이야");
	}
}
