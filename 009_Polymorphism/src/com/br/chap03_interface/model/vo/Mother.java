package com.br.chap03_interface.model.vo;

public class Mother extends Person implements Basic {
// 상속 + 인터페이스 구현(implements) 모두
	private String babyBirth;
	
	
	//alt shift s + c
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}


	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}


	@Override
	public void eat() {
		// 밥먹으면 몸무게 10증가, 건강도 10감소
		setWeight(getWeight() + 10); // 부모클래스까지 super안써도 알아서 찾아봐줌
		setHealth(getHealth() - 10);
		
	}


	@Override
	public void sleep() {
		// 잠자면 건강도 20증가		
		setHealth(getHealth() + 20);
	}
	
	
	
}
