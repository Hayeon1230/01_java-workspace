package com.br.variable;

public class A_Variable {
	
	public void printValue() {
		System.out.println("변수 사용 전");
		
		System.out.println(9000 * 8);
		System.out.println(9000 * 8 * 5);
		System.out.println(9000 * 8 * 5 * 4);
		System.out.println(9000 * 8 * 5 * 4 * 0.1);
		
		// 1. 변수란? --> 어떠한 값을 메모리상에 기록하기 위한 공간 (박스개념)
		int pay = 9000; 	// 시급
		int hour = 8;		// 하루 중 근무시간
		int day = 5;		// 일주일 중 근무일수
		int week = 4;		// 한달 중 근무주수
		double tax = 0.1;	// 세금 10%
		
		System.out.println("변수 사용 후");
		
		System.out.println(pay * hour); // 하루치 급여
		System.out.println(pay * hour * day); // 일주일치 급여
		System.out.println(pay * hour * day * week); // 한달치 급여
		System.out.println(pay * hour * day * week * tax); // 내야될 세금
		
		System.out.println("시급 : " + pay + "원");
		/*
		 * 2. 변수를 사용하는 이유
		 * -  값에 의미를 부여하기 위해서 => 가독성이 좋음
		 * -  한번 값을 저장해 두고 계속 사용할 목적
		 * -  유지보수에 용이하다 ** 
		 */
		
	}
	
	public void declareVariable() {
		/*
		 * 3. 변수의 선언 (== 변수 만들기)
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담을건지, 어떤 크기의 값을 담을건지에 대한 변수의 크기 및 모양을 정하는 키워드
		 * 변수명 : 박스의 이름을 정하는 부분 (의미 부여)
		 * 
		 * * 주의할점
		 * - 변수명은 반드시 첫문자를 소문자로
		 * - 단, 여러단어 조합되어있을 경우 낙타표기법
		 * - 특정영역({})에 동일한 변수명으로 선언 불가
		 *   해당영역에 선언된 변수는 그 영역에서만 사용 가능 (다른 메소드에서 사용불가) == 지역변수 개념
		 * 
		 * * 변수 선언 후 값 대입
		 * [표현법] 변수명 = 값;
		 * 
		 * * 변수 선언과 동시에 값 대입
		 * [표현법] 자료형 변수명 = 값;
		 *   
		 */
		
		// ---- 자료형 종류 -----
		// 1) 논리형 (논리값 == true/false) 1byte
		//boolean bool; // 선언 후
		//bool = true; // 대입
		
		boolean bool = true; // 변수 선언과 동시에 대입
		
		System.out.println("bool의 값 : " + bool);
		
		bool = false; // 새로운 값 대입 가능 == 값 변경
		bool = 1 + 3 < 2; // 거짓 (false)
		
		System.out.println("bool의 값 : " + bool);
		
		// 2) 숫자형 
		// 2_1) 정수형 
		byte bNum; // 1byte (-128~127)
		bNum = -128;
		
		short sNum = 30000; // 2byte 
		int iNum = 100000; // 4byte (정수형 중의 대표) -21억xxx ~ 21억xxx
		long lNum = 10000000000L; // 8byte
		
		// 2_2) 실수형
		float fNum = 4.1234564545657878f; // 4byte
		double dNum = 8.12345678899777777777; // 8byte (실수형 중의 대표)
		
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		
		// 3) 문자형 
		char ch = 'A'; // 2byte
		ch = '강';
		
		System.out.println("ch의 값 : " + ch);
		
		// ------ 여기까지 기본자료형 (8개) ------
		
		// 4) 문자열 (참조자료형) --> 특이 
		String str = "ABC";
		
		// 번외 (큰 값을 작성할때 _ 를 이용해서 가독성 높일 수 있음)
		int etc = 999_999_999;
		System.out.println(etc);
		
		// 4. 변수 명명규칙 
		int number;
		
		// 1) 변수명 중복시 에러 발생
		//byte number;
		
		// 2) 대소문자 구분
		int numBer;
		
		// 3) 예약어(자바에서 이미 사용되고 있는 키워드들) 사용 불가
		//char int;
		//int true;
		//int class;
		//int void;
		//int abstract;
		//int public;
		
		// 4) 숫자 가능 (단, 숫자로 시작하는 건 안됨)
		int age1;
		//int 1age;
		
		// 5) 특수문자 가능 (단, _ $만 가능)
		int number_1;
		int number$1;
		int _number;
		int $number;
		//int number#1;
		
		// 여러 단어일 경우 붙여쓰고 두번째 단어부터 첫글자 대문자 (낙타표기법)
		String username;
		String userName; // 관례상 맞는 표현
		
		String 이름; // 한글 가능하지만 권장 x 
		
	}
	
	public void constant() {
		/*
		 * 5. 상수란 
		 *    메모리상에 값을 기록하는 공간인데 
		 *    변수와의 차이점으로는 한번 기록된 값을 변경하는게 불가능 
		 *    
		 *    [표현법] final 자료형 상수명;
		 *    
		 *    상수명은 다 대문자로 지어주는걸 권장
		 */
		int age = 20;
		age = 21;
		
		final int AGE = 20;
		//AGE = 21;
		
		System.out.println(Math.PI);
		//Math.PI = 2.11111;
		
	}
	
	/*
	 * ** 정리 **
	 * - 값(data, 리터럴) : 프로그램상에 필요한 명시적인 data / 또는 사용자가 키보드 또는 마우스로 입력한 data
	 * - 변수 : 값(리터럴)을 메모리상에 기록하기 위한 박스같은 존재 
	 * 		   => 한 개의 값만 담을 수 있음 (단, 새로운 값 다시 대입 가능)
	 * - 상수 : 변수 선언 구문 앞에 final 붙여서 선언 
	 * 		   한번 대입된 값 변경 불가함 
	 * 		   상수명은 다 대문자로 쓰는걸 권장
	 */
	
	

}
