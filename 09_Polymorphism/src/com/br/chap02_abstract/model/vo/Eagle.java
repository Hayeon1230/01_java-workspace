package com.br.chap02_abstract.model.vo;

import com.br.chap03_interface.model.vo.Animal;

public class Eagle extends Animal implements Flyable, Moveable {

	public Eagle() {
		super();
	}
	
	public Eagle(String name, String kind) {
		super(name, kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void forward() {
		System.out.println(getName() + "가 뾰족한 발톱으로 걸어간다");		
	}

	@Override
	public void back() {
		System.out.println("뒤로 못걷는다");		
		
	}

	@Override
	public void jump() {
		System.out.println("점프할 순 없다");		
		
	}

	@Override
	public void fly() {
		System.out.println(getName() + "가 큰 날개를 펼치며 납니다");		
		
	}

	@Override
	public String bark() {
		return "꺼룩꺼룩";
	}

	
	
}
