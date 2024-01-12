package com.br.operator;

public class B_InDecrease {
	
	/*
	 * * 증감연산자 (단항연산자)
	 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 * 		++변수  변수++
	 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자 
	 * 		--변수  변수--
	 * 
	 * (증감연산자)변수 : 전위연산   => "선증감" 후처리
	 * 변수(증감연산자) : 후위연산   => 선처리 "후증감"
	 * 
	 */
	
	public void method1() {
		int num = 5;
		//num = num + 1;
		//++num;
		num++;
		
		System.out.println("최종 num : " + num);
		
		// 전위연산 테스트
		int num1 = 10;
		System.out.println("최초 num1 : " + num1);
		System.out.println("1회 수행 후 : " + ++num1); // num1=11 후 출력
		System.out.println("2회 수행 후 : " + ++num1); // num1=12 후 출력
		System.out.println("3회 수행 후 : " + ++num1); // num1=13 후 출력
		System.out.println("최종 num1 : " + num1); // num1=13
		
		// 후위연산 테스트
		int num2 = 10;
		System.out.println("\n최초 num2 : " + num2);
		System.out.println("1회 수행 후 : " + num2++); // 10출력 후 num2=11변경
		System.out.println("2회 수행 후 : " + num2++); // 11출력 후 num2=12변경
		System.out.println("3회 수행 후 : " + num2++); // 12출력 후 num2=13변경
		System.out.println("최종 num2 : " + num2);
		
	}
	
	public void method2() {
		
		int a = 10;
		int b = ++a; // a=11 b=11
		
		// a : xx, b : xx 
		System.out.printf("a : %d, b : %d\n", a, b);
		
		int c = 10;
		int d = c++; // d=10 c=11
		
		System.out.printf("c : %d, d : %d\n", c, d);
		
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = ++num1 * 3; // num1=21 result1=63
		
		System.out.println(num1 + " " + result1);
		
		int num2 = 20;
		int result2 = num2++ * 3; // result2=60 num2=21
		
		System.out.println(num2 + " " + result2);
		
	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // a=10(11) => 10출력
		System.out.println((++a) + (b++)); // a=12 b=20(21) => 32출력
		System.out.println((a++) + (--b) + (--c)); // a=12(13) b=20 c=29  => 61출력 
		
		System.out.println("a : " + a); // a=13
		System.out.println("b : " + b); // b=20
		System.out.println("c : " + c); // c=29
	}
	
	

}
