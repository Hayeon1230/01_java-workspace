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
		return super.toString() + "Wizard [mp=" + mp + "]";
	}
	
}
