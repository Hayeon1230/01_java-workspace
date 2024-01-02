package com.br.chap02_abstract.model.vo;

import java.util.Arrays;

public class Warrior extends GameCharacter{

	private String weapon;
	private String[] items;
	
	public Warrior() {}
	public Warrior(String name, int hp, int level, int exp, String weapon, String[] items) {
		super(name, hp, level, exp);
		this.weapon = weapon;
		this.items = items;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return super.toString() + "Warrior [weapon=" + weapon + ", items=" + Arrays.toString(items) + "]";
	}


	
	
	
}
