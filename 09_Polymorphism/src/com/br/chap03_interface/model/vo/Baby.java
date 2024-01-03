package com.br.chap03_interface.model.vo;

public class Baby extends Person implements Basic{

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Baby [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getHealth()=" + getHealth()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public void eat() {
		// 밥먹으면 몸무게 3증가, 건강도 2증가
		setWeight(getWeight() + 3);
		setHealth(getHealth() + 2);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 3증가
		setHealth(getHealth() + 3);
	}
	
	

}
