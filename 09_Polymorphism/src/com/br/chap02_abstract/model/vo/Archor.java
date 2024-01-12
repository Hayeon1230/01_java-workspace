package com.br.chap02_abstract.model.vo;

public class Archor extends GameCharacter {
	
	private int distance; // 쏠수있는 거리
	private int count; // 잔여 화살량
	
	public Archor() {}
	
	public Archor(String name, int hp, int level, int exp, int distance, int count) {
		super(name, hp, level, exp);
		this.distance = distance;
		this.count = count;
	}
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	@Override
	public String toString() {
		return super.toString() + ", distance=" + distance + ", count=" + count;
	}

	@Override
	public void attack() {
		
		if(count > 0) {
			System.out.println(distance + "m 거리까지의 적을 화살로 쏴서 공격한다.");
			System.out.println("잔여 활수 : " + --count);
			
			setExp(getExp() + 15);
		}else {
			System.out.println("잔여 활이 없어 공격할 수 없습니다.");
		}
		
	}

	@Override
	public void defence() {
		System.out.println("막을 수 없습니다...");
		
		setHp(getHp() - 20);
	}

}
