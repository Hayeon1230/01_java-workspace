package com.br.chap05_constructor.model.vo;

public class Cosmetic {
	
	/*
	 * < 필드 >
	 * 
	 * * 표현법
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * * 전역변수 (클래스영역에 바로 선언한 변수 == 클래스 전역에서 사용가능)
	 * - 멤버변수(== 인스턴스변수) => 객체생성(new ~~)(인스턴스화)시 메모리 할당 / 객체 소멸시 같이 소멸 
	 * - 클래스변수(static) => 프로그램 실행시 메모리 할당 / 프로그램 종료시 소멸
	 * 
	 * * 예약어
	 * - static : 공유의 개념
	 * - final : 상수의 개념
	 * - static final : 상수필드
	 * 
	 * * 접근제한자
	 * public > protected > default > private
	 * 
	 */
	private String cName;		// 화장품명
	private int price;			// 화장품가격
	private String brand;		// 화장품브랜드
	private String category;	// 화장품분류
	private String[] ingredient;// 화장품재료들
	private User maker;			// 화장품을개발한사람
	
	/*
	 * < 생성자 >
	 * 
	 * * 표현법
	 * 접근제한자 생성자명([매개변수, ...]){
	 * 
	 * }
	 * 
	 * * 생성자의 목적
	 * - 단지 객체생성만이 목적
	 * - 객체 생성과 동시에 각 필드에 값을 대입(초기화)하기 위함 => 매개변수생성자
	 * 
	 * * 생성자 작성시 주의사항
	 * - 생성자명은 클래스명과 동일하게 작성해야됨
	 * - 반환형 기술하면 안됨 (메소드로 인식됨, 오류로 안뜸)
	 * - 매개변수 생성자 명시했을 시에는 기본생성자를 JVM이 자동생성해주지 않음 => 기본생성자는 항상 작성하는 습관
	 * 
	 */
	public Cosmetic() {
		
	}
	
	public Cosmetic(String cName, int price, String brand, String category, String[] ingredient, User maker) {
		this.cName = cName;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.ingredient = ingredient;
		this.maker = maker;
	}
	
	/*
	 * < 메소드 >
	 * 
	 * * 표현법
	 * 접근제한자 반환형 메소드명([매개변수, ...]){
	 * 		실행내용
	 * 		[return 반환값;]
	 * }
	 * 
	 * * getXXX 메소드 : 필드에 담긴 값을 반환시켜주기 위한 목적
	 * * setXXX 메소드 : 필드값을 수정하기 위한 목적
	 * 
	 * * 메소드는 항상 필드와 밀접한 연관이 있게 작성해야됨(의미없는 x)
	 * 
	 */
	// getter/setter메소드
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcName() {
		return cName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setIngredient(String[] strings) {
		this.ingredient = strings;
	}
	public String[] getIngredient() {
		return ingredient;
	}
	public void setMaker(User maker) {
		this.maker = maker;
	}
	public User getMaker() { // 사용자정의 자료형(내가만든 클래스)를 반환형에 씀
		return maker;
	}
	
	
	// information메소드
	public String information() {
		String str = "화장품명 : " + cName 
				   + "\n가격 : " + price 
				   + "\n브랜드명 : " + brand
				   + "\n분류 : " + category
				   + "\n성분 : ";
				   
		for(int i=0; i<ingredient.length; i++) {
			str += ingredient[i];
			if(i < ingredient.length-1) {
				str += ", ";
			}
		}
		if(maker != null) {
			str += "\n화장품개발자 : " + maker.information();
		}
		return str;
	}
	
}
