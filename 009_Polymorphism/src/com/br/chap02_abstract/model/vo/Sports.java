package com.br.chap02_abstract.model.vo;

public abstract class Sports {
	
	private int peopleCount; // 참여인원수
	
	public Sports() {}
	
	public Sports(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	public int getPeopleCount() {
		return peopleCount;
	}
	
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	@Override
	public String toString() {
		return "참여인원수 : " + peopleCount;
	}
	
	// 어떤 스포츠든 지켜야될 룰에 대한 구문을 출력하는 용도의 메소드
	public abstract void rule();
	// 미완성된 메소드 == 추상메소드 == abstract 예약어 기술해야됨
	// 단, 추상메소드가 존재하는 클래스라면 반드시 추상클래스로 선언해야됨

}
