package com.br.api.controller;

public class B_StringApiController {

	/*
	 * 자바에서 문자열을 관리하는 클래스로 총 세가지 있음
	 * 
	 * * String - 클래스지만 기본자료형 처럼 쓸 수 있는 것 -> ""로 바로 리터럴값 제시 가능 - 불변클래스(수정이 불가능)
	 * 
	 * String Builder, StringBuffer - 클래스 사용방식으로 쓸 수 있는 것 -> new로 객체 생선한 후 사용 -
	 * 가변클래스(수정이 가능함)
	 * 
	 * 
	 */

	public void stringPoolTest( // 상수풀(Sting pool)의 개념

			// 1.String 사용시 생성자를 통해서 문자열 사용
			
			String newStr1 = new String("hello");
			String newStr2 = new String("hello");
			
			System.out.println(mesStr1);
			System.out.println(mesStr2);
			System.out.println(newStr1 == new newStr2);//false 주소값비교
			// String클래스클래스에 toString메소드 이미 오버라이딩 되어있음(실제 담긴
			System.out.println(newStr1 == new newStr2);//false 주소값비교
			System.out.println(newStr1.equals(new newStr2));//false 주소값비교
		
			System.out.println(newStr1.hashcode());	
			System.out.println(newStr2.hashcode());	
			// String 클래스에 hashCode메소드 이미 오버라이딩 되어있음(주소값이 아닌 실제 담긴 문자열가지고 숫자만듦)

			// System.identityHashCode(레퍼런스)
			System.out.println(Sytem.identityHashCode(newStr1));
			System.out.println(Sytem.identityHashCode(newStr2));
}

}