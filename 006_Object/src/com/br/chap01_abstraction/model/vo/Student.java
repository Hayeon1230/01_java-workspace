package com.br.chap01_abstraction.model.vo;

/*
 * * class의 구조
 * 
 * public class 클래스명{
 * 
 * 		// [필드부]
 * 
 * 		// [생성자부]
 * 
 * 		// [메소드부]
 * 		public void 메소드명(){
 * 		}
 * }
 */

public class Student { // 학생들을 추상화해서 만든 클래스
	
	// 필드부
	// 접근제한자 자료형 변수명;
	
	// * 접근제한자 : 여기에 접근할 수 있는 범위를 제한하는 것
	// 			  public > protected > default(생략하는 것) > private
	public String name;
	public int age;
	public double height;
	
	
}
