package com.br.run;

import com.br.first.A_MethodPrinter;

public class RunA {

	public static void main(String[] args) {
		// 메소드 호출 == 메소드 실행 ==> 메소드명();
		// methodA(); ==> 에러
		
		/* 다른 클래스에 있는 메소드 실행
		 * 1) 실행할 메소드가 있는 클래스를 "생성(new)"하기
		 * [표현법] 클래스명 사용할이름 = new 클래스명();
		 */
		// A_MethodPrinter a = new A_MethodPrinter(); =>에러발생
		// 기본적으로 같은 패키지안에서 해당 클래스를 찾음
		
		//해결방법1. 어떤 패키지에 속해있는지 정확히 제시하는 방법(번거로움)
		//com.br.first.A_MethodPrinter a = new com.br.first.A_MethodPrinter();
		//패키지 소문자, 클래스 대문자, 메소드 소문자로 시작 권장
		
		//해결방법2. 해당 패키지의 클래스를 가져다 쓰겠다 라는 선언문(import) 기입
		// 제일 위 패키지랑 클래스 사이에 선언
		A_MethodPrinter a = new A_MethodPrinter();
		
		//2) 해당 클래스 내의 메소드 실행(호출)
		// [표현법] 사용할이름.실행할메소드명();
		a.methodA();
		//a.methodB();
		//a.methodC();
		
	}
	
}
