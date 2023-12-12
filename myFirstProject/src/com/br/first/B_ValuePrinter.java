package com.br.first;

public class B_ValuePrinter {

	/*
	 * ** 원칙 **
	 * 1. 클래스명 --> 대문자로 시작
	 * 2. 패키지명 --> 소문자로 시작
	 * 3. 메소드명 --> 소문자로 시작
	 * 4. 변수명 --> 소문자로 시작
	 * 
	 * 단, 여러개의 단어를 조합할 경우, 단어 앞자리마다 대문자 == 낙타표기법
	 * 
	 * ex) 클래스명 MethodPrinter
	 * 	   메소드명 printTest
	 */
	
	// 다양한 종류의 값을 출력시키는 기능을 수행하는 메소드
	public void printValue() {
		
		// 1. 숫자 출력 -->따옴표 없이
		System.out.println(123);
		System.out.println(1.1);
		
		// 2. 문자(한글자) 출력 -->홑따옴표 이용
		System.out.println('a');
		System.out.println('강');
		
		// 3. 문자열(여러글자) 출력 --> 쌍따옴표 이용
		System.out.println("안녕하세요");
		
		// 4. 연산한 결과값 출력
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);
		// 실수는 미세한 오차 발생 가능
		
		// 5. 문자와 숫자는 연산 가능(문자마다 고유의 숫자값을 가지고 있어서, 내부적으로는 숫자로 인식)
		// 아스키코드표 a=97
		System.out.println('a' + 1);
		
		// 6. 문자열과 그외의 값들의 덧셈연산 가능 => 문자열화 됨(연이어짐) (수학적 덧셈x)
		System.out.println("하이" + 'a'); // "하이a"
		System.out.println(123 + "안녕"); // "123안녕"
		System.out.println("반갑" + 111 + 222); // 연산순서 있음(연산자 동일 -> 앞에서부터)
		// "반갑111" + 222 => "반갑111222"
		// 괄호로 묶인게 먼저 수행됨
		
	}
	
}
