package com.br.chap02_abstract.model.vo;

import com.br.chap03_interface.model.vo.Animal;

public class Dog extends Animal implements Moveable, Swimable{

	public Dog() {
		super();
	}
	
	public Dog(String name, String kind) {
		super(name, kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		System.out.println(getName() + "가 개헤엄 첨벙첨벙");		
	}

	@Override
	public void dive() {
		System.out.println(getName() + "가 꼬로록 물속 다이빙");		
	}

	@Override
	public void forward() {
		System.out.println(getName() + "가 네발로 앞으로 걸어간다.");		
	}

	@Override
	public void back() {
		System.out.println(getName() + "가 백스텝 합니다.");		
		
	}

	@Override
	public void jump() {
		System.out.println(getName() + "가 두 발을 들며 껑충 뜁니다.");		
		
	}

	@Override
	public String bark() {
		
		return "멍멍";
	}

	
}
