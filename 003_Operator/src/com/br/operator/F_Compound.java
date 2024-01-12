package com.br.operator;

public class F_Compound {

	/*
	 * * 복합 대입 연산자
	 * 	 산술연산자와 대입연산자가 결합되어있는 형태
	 * 	 
	 *   += -= *= /= %=
	 *   
	 *   a = a + 3;		=> a += 3; (내부적으로 연산처리 속도 업) 
	 *   a = a - 3;		=> a -= 3;
	 *   a = a * 3;		=> a *= 3;
	 *   a = a / 3;		=> a /= 3;
	 *   a = a % 3;		=> a %= 3;
	 */
	
	public void method1() {
		int num = 12;
		num += 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		num %= 4;
		System.out.println("최종 num : " + num);
		
		//특이케이스
		String str = "Hello";
		//str = str + "World"; // "HelloWorld"
		str += "World";
		System.out.println(str);
	}
	
	
	
}
