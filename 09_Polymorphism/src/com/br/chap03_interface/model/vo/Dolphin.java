package com.br.chap03_interface.model.vo;

public class Dolphin extends Animal implements Swimable {

	public Dolphin() {
		super();
	}

	public Dolphin(String name, String kind) {
		super(name, kind);
	}

	@Override
	public void swim() {
		System.out.println(getName() + "가 자유롭게 수영합니다.");
	}

	@Override
	public void dive() {
		System.out.println(getName() + "가 포물선을 그리면서 다이빙합니다.");
	}

	@Override
	public String bark() {
		return "끼이이이";
	}

	
	
	
}
