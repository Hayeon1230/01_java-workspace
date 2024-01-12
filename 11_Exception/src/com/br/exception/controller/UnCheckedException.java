package com.br.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	/*
	 * * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들 (런타임에러)
	 * 
	 * * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스로 접근했을때 발생되는 예외
	 * - NullPointerException : 레퍼런스가 null인 상태에서 뭔가에 접근했을 때 발생되는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될때 발생되는 예외
	 * - NegativeArraySizeException : 배열의 크기를 음수로 지정했을 경우 발생되는 예외
	 * ...
	 * 
	 * => RuntimeException 관련된 예외들은 충분히 예측가능하기 때문에 
	 *    애초에 예외가 발생이 안되게끔 조건문을 적절히 활용하면 해결가능 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		//int result = num1 / num2; // num2가 0일 경우 ArithmeticException 예외발생 => 프로그램이 종료되버림
		//System.out.println("result : " + result);
		
		// 해결방법1. 애초에 예외가 발생이 안되게끔 조건처리
		/*
		if(num2 != 0) {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}
		*/
		
		
		// 해결방법2. 예외처리(예외가 "발생했을때" 실행할 구문을 미리 작성해두는거) 구문 작성 
		/*
		 * * try ~ catch 구문
		 * 
		 * try {
		 * 		예외가 발생될 수 있는 구문;
		 * }catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생했을 경우 실행시킬 구문
		 * }
		 */
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			//e.printStackTrace(); // 강제로 오류난 이력을 볼 수 있음 
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	public void method2() {
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		/*
		int[] arr = new int[size]; // NegativeArraySizeException : 음수로 크기지정시
		
		System.out.print("출력하고자하는 인덱스번호 : ");
		int index = sc.nextInt();
		
		System.out.println(index + "번 인덱스의 값 : " + arr[index]); // ArrayIndexOutOfBoundsException : 부적절한 인덱스 제시시
		*/
		
		// 해결방법1. 조건문 활용해서 애초에 예외가 발생 안되도록
		/*
		if(size >= 0) {
			int[] arr = new int[size];
			
			System.out.print("출력하고자하는 인덱스번호 : ");
			int index = sc.nextInt();
			
			if(index >= 0 && index < arr.length) {
				System.out.println(index + "번 인덱스의 값 : " + arr[index]);
			}else {
				System.out.println("배열은 잘 생성되었으나 부적절한 인덱스를 입력하셨습니다.");
			}
		}else {
			System.out.println("배열의 크기로는 양수로 제시하셔야 합니다.");
		}
		*/
		
		
		// 해결방법2. 예외처리 구문 작성
		try {
			int[] arr = new int[size];
			
			System.out.print("출력하고자하는 인덱스 번호 : ");
			int index = sc.nextInt();
			
			System.out.println(index + "번 인덱스의 값 : " + arr[index]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로는 양수로 제시하셔야 합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 잘 생성되었으나 부적절한 인덱스를 입력하셨습니다.");
		}
		// 다중 catch블럭 기술 가능 
		
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	public void method3() {
		System.out.print("배열 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			System.out.print("인덱스 : ");
			int index = sc.nextInt();
			System.out.println(arr[index]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 반드시 양수여야만 해");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스 제시했습니다.");
		}catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값을 입력하셔야됩니다.");
		}
		*/
		
		try {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			System.out.print("인덱스 : ");
			int index = sc.nextInt();
			System.out.println(arr[index]);
			
		}catch(InputMismatchException e) { 
			System.out.println("잘못된 타입의 값을 입력했어");
		}catch(RuntimeException e) { // 부모 타입의 예외클래스만 써서 다형성적용시킬 수 있음
			System.out.println("예외가발생되긴했는데 배열의 크기가 음수거나, 부적절한 인덱스를 제시했어");
			//e.printStackTrace();
		}
		// 부모예외클래스랑 자식예외클래스 가지고 catch블럭을 쓸때는
		// 자식예외클래스 catch블럭이 앞에 쓰여있어야됨 
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 * * RuntimeException 과 관련된 Exception 클래스들은 (예외처리구문이 필수는 아님)
	 *   if문(조건문) : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링 할 수 있음 
	 *   try-catch문 : 예외가 "발생됐을 경우" 실행할 구문을 미리 작성해두는것
	 *   
	 *   예측가능한 상황 같은경우 => if문으로 하는걸 권장함 
	 */
	
	
	

}
