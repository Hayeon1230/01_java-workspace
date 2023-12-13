package com.br.practice.example;

import java.util.Scanner;

public class VariablePracticeAnswer {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // nextInt() 메소드 뒤에 nextLine() 메소드가 올 것이기 때문에 그 사이에 엔터를 버퍼에서 빼주는 작업을 해줘야된다. 
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 산술 연산 순서 (*,/,%    >    +,-)
		System.out.println("더하기 결과 : " + (num1 + num2));	// 괄호를 안하게 되면 문자열로 인식하여 숫자 두개가 붙어서 나온다.
		System.out.println("빼기 결과 : " + (num1 - num2));	// 마찬가지로 괄호를 안하게되면  '문자열-정수'로 인식하여 오류 발생
		System.out.println("곱하기 결과 : " + num1 * num2);	// 덧셈보다 뺄셈이 우선순위가 높아서 곱셈연산먼저 진행됨	
		System.out.println("나누기 몫 결과 : " + num1 / num2); // 나눗셈도 마찬가지로
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		/* 방법1. 면적과 둘레를 각각 구해 각 변수에 담아둔 후 출력하는 방법 -----------
		double area = width * height;			// 면적 구해서 기록하기
		double perimeter = (width + height) * 2;// 둘레 구해서 기록하기
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + perimeter);
		--------------------------------------------------------------*/
		
		
		// 방법2. 아싸리 바로 면적과 둘레를 구한 결과를 바로 출력하는 방법
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		/* 방법1. 문자열로 부터 각 문자값을 뽑아서 각 char 변수에 담아둔 후 출력하는 방법 ------
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + ch1);
		System.out.println("두 번째 문자 : " + ch2);
		System.out.println("세 번째 문자 : " + ch3);
		----------------------------------------------------------------------*/
		
		
		
		// 방법2. 아싸리 char변수에 안담아주고 바로 뽑아서 출력하는 방법
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
