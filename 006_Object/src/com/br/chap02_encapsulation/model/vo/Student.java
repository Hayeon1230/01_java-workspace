package com.br.chap02_encapsulation.model.vo;

public class Student {
	
	// 필드 작성
	String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * 메소드부
	 * 
	 * <표현법>
	 * 접근제한자(public 등) 반환형(void=반환값없고 실행만,String,int, ...) 메소드명([매개변수, 매개변수, ..]){}
	 * 접근제한자 반환형 메소드명([매개변수, 매개변수, ..]){
	 * 		// 기능구현
	 * }
	 */
	// - setter메소드
	//   해당 필드에 대입시키고자하는 값 전달받아
	//   해당 필드에 대입시켜주는 기능의 메소드
	//   메소드명 : setXXX XXX자리는 필드명따서 / 낙타표기법
	/*public void setName(String newName) { // String newName
		// 매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수선언문
		name = newName;
	}*/
	
	// 관례상 매개변수명을 필드명과 동일하게 작성
	public void setName(String name) {
		// 필드name = 매개변수name;
		name = name; // 매개변수name = 매개변수name;
		// 필드명과 매개변수명(지역변수)이 동일할 경우
		// 해당 영역({})에 해당 변수명 제시시 지역변수를 먼저 가리킴
		this.name = name; // this에는 해당 객체의 주소값이 담겨있음
				
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// - getter메소드
	//   해당 필드에 담긴 값을 반환해주는 역할을 수행
	//   메소드명 : getXXX 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public int getKorScore() {
		return korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	
	
	
	
	
}
