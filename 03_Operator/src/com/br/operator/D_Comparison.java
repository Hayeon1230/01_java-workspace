package com.br.operator;

import java.util.Scanner;

public class D_Comparison {//비교
	
	/*
	 * 비교연산자(=관계연산자) (이항연산자)
	 * 두 값을 비교하는 연산자
	 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)을 반환
	 * 
	 * 대소비교 연산자 : < > <= >=
	 * 동등비교 연산자 : == !=
	 */
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b)); //덧셈연산자가 먼저이므로 괄호로 묶어야
		System.out.println("a <= b : " + (a <= b));
		
		boolean result = a > b;
		result = a * 2 > b / 5;
		System.out.println("result : " + result);
		
		System.out.println("a가 짝수입니까 : " + (a % 2 == 0));
		System.out.println("b가 홀수입니까 : " + (b % 2 == 1));
		System.out.println("b가 홀수입니까 : " + (b % 2 != 0));
		System.out.println("b가 홀수입니까 : " + !(b % 2 == 0));
		
		//2로 나눴을 때의 나머지가 0일 경우 == 2로 나눠떨어짐 == 짝수
		//				  1일 경우 == 2로 나눠떨어지지 않음 ==홀수
		
		System.out.println("a가 7의 배수입니까 : " + (a%7 == 0));
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 정수 값 입력받아 변수에 기록
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		// 두번째 정수 값 입력받아 변수에 기록
		System.out.println("두번째 정수 ㅣ ");
		int num2 = sc.nextInt();
		
		System.out.println("첫번째가 두번째보다 큽니까 : " + (num1 > num2));
		System.out.println("첫번째 정수가 짝수입니까 : " + (num1%2 == 0));
		
		// 특이케이스 (문자와 숫자간의 대소비교 가능)
		System.out.println(num2 < 'A');
		// 'A' ~ 'Z' 65~90
	}
	
}
