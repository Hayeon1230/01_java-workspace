package com.br.chap01.poly.model.vo;

public class Parent {
	private int x;
	private int y;

	public Parent() {
	} // 기본생성자 없으면 자식객체에서 오류날 수 있음
		// 언제 부모객체 될 지 모르니 작성할 것!

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;

	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void printParent() {
		System.out.println("나 부모클래스야");
	}
	public void print() {
		System.out.println("나 부모클래스야");
	}
}