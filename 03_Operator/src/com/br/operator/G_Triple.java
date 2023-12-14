package com.br.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * * 삼항연산자
	 * 
	 * [표현법] 조건식 ? 조건식이 true일 경우 돌려줄 결과값 : 조건식이 false일 경우 돌려줄 결과값
	 * 
	 */
	public void method1() {
		//입력받은 정수값이 양수인지 아닌지 판ㅂ별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		// 입력값이 양수일 경우 : xx은 양수이다.
		//	"	양수가 아닐 경우 : xx은 양수가 아니다.
		System.out.println(num + "은 " + (num>0 ? "양수이다" : "양수가 아니다"));
		
		
		String st = (num > 0) ? (num + "은 양수이다.") : (num + "은 양수가 아니다.");
		System.out.println(st);
	}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 팔별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		//String result = num % 2 == 0 ? "짝수" : "홀수";
		String result = num % 2 == 1 ? "홀수" : "짝수";
		System.out.println(num + "은 " + result);
		
	}
	
	public void method3() {
		
		// 사용자에게 종료의사 여부 입력받은 후 판별해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 사용자가 입력한 문자가 y 또는 Y일 경우 "프로그램을 종료합니다." 출력
		// 그게 아닐 경우 "계속 진행하겠습니다"
		String result = ch == 'y' || ch == 'Y' ? "프로그램을 종료합니다." : "계속 진행합니다.";
		System.out.println(result);
		
		
	}
	
	public void method4() {
		// 입력받은 문자값이 영문자인지 아닌지 판별 후 출력
		Scanner sc =new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 문자값이 영문소문자이거나 또는 영문대문자일 경우
		String result = ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ? "영문자" : "영문자가 아니다.";
		System.out.println(result);
	}
	
	//삼항연산자 중첩 사용
	public void method5() {
		
		//사용자가 입력한 정수값이
		//양수, 음수, 0 중 뭔지 정확히 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = num>0 ? "양수이다" : num == 0 ? "0이다" : "음수이다";
		System.out.println(result);
	}
	
	public void method6() {
		// 사용자에게 두개의 정수값 입력받고
		// + 또는 - 입력받아 그 에 맞는 연산 결과 출력
		
		// 사용자가 입력한 연산자가 +일 경우 => 덧셈연산결과 출력
		// 사용자가 입력한 연산자가 -일 경우 => 뺄셈연산결과 출력
		// 단, +또는- 외의 다른 문자 입력했을 경우 => "잘못입력했습니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+/-) : ");
		sc.nextLine();
		char op = sc.nextLine().charAt(0);
		String result = op != '+' && op != '-' ? "연산자를 잘못입력했습니다." : op == '+' ? "덧셈 결과는" + (num1 + num2) : "뺄셈 결과는" + (num1 - num2);
		System.out.print(result);
		
		 
		
	}
}
