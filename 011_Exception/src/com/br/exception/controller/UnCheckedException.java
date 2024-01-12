package com.br.exception.controller;

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
	 * 	  애초에 예외가 발생이 안되게끔 조건문을 적절히 활용하면 해결가능
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();		
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		//int result = num1 / num2; // num2가 0일 경우 ArithmeticException 예외발생 => 프로그램이 종료
		//System.out.println("result : " + result);
		
		// 해결방법1. 애초에 예외가 발생이 안되게끔 조건처리
		/*
		if(num2 !=0) {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}
		*/
		
		// 해결방법2. 예외처리(예외가 "발생했을때" 실행할 구문을 미리 작성해두는거) 구문 작성
		/*
		 * * try ~ catch 구문
		 * try {
		 * 		예외가 발생될 수 있는 구문;
		 * }catch(발생될예외클래스 매개변수){
		 * 		해당 예외가 발생했을 경우 실행시킬 구문
		 * }
		 * 
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 강제로 오류난 이력을 볼 수 있음
			
		}
		
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
	
	public void method2() {
		
		/*
		int[] arr = new int[size]; // NegativeArraySizeException : 음수로 크기지정
		
		System.out.println("출력하고자하는 인덱스번호 : ");
		int index = sc.nextInt();
		
		System.out.println(index + "번 인덱스의 값 : " + arr[index]); // ArrayIndexOutOfBoundsException : 범위 벗어난 값 입력
		*/
		
		// 해결방법1. 조건문 활용해서 애초에 예외가 발생 안되도록
		/*
		 if(size >= 0) {
			int[] arr = new int[size];
			
			System.out.println("출력하고자하는 인덱스번호 : ");
			int index = sc.nextInt();
			
			if(index >= 0 && index < arr.length) {
				System.out.println(index + "번 인덱스의 값 : " + arr[index]);
			}else {
				System.out.println("배열은 잘 생성됐으나 부적절한 인덱스 입력함");
			}
		}else {
			System.out.println("배열의 크기로는 양수를 제시해야합니다.");
		}
		*/
		System.out.println("출력하고자하는 인덱스 번호 : ");
		int index = sc.nextInt();
		// 해결방법2. 예외처리 구문 작성
		try {
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			System.out.println("인덱스 : ");
			int index = sc.nextInt();
			System.out.println(arr[index]);

			배열으
			System.out.println(index + "번 인덱스 값 : " + arr[index]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열 크기는 양수로 제시해라");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 잘 생성됐으나, 부적절한 인덱스");
		}catch(InputMismatchException)
		// 다중 catch블럭 기술 가능
		
		
	}
	
	
	
	
	
}
