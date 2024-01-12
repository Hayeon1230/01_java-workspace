package com.br.chap02_abstract.model.vo;

public class Wizard extends GameCharacter {
	
	private int mp;
	
	public Wizard() {}

	public Wizard(String name, int hp, int level, int exp, int mp) {
		super(name, hp, level, exp);
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return super.toString() + ", mp=" + mp;
	}

	@Override
	public void attack() {
		System.out.println("마법을 쓰면서 공격한다.");
		this.mp = this.mp - 10; // 마력소모
	}

	@Override
	public void defence() {
		System.out.println("방어막을 쳐서 방어한다.");
		super.setHp(super.getHp() - 5); // 체력소모
	}
	
	
	
	
	
	
}
