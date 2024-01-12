package com.br.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 기본적으로 위에서 부터 아래로 순차적으로 진행되는 흐름을 
	 * 직접 제어할 수 있음 => 제어문 활용
	 * 
	 * 선택적으로 실행하는 선택문 => 조건문
	 * 반복적으로 실행하는 실행문 => 반복문
	 * 그 외의 흐름 제어 => 분기문
	 * 
	 * * 조건문 
	 * 조건식을 통해 참이냐 거짓이냐를 판단해서 
	 * 해당 조건에 만족할 경우 그에 해당하는 구문 실행 
	 * 
	 * * 조건문 종류
	 * 1. if문
	 * -  단독 if문
	 * -  if-else문
	 * -  if-else if문
	 * 2. switch문
	 * 
	 */
	
	/*
	 * * 단독 if문
	 * 
	 * if(조건식) {
	 * 		조건식이 true일 경우 실행할 구문
	 * }
	 * 
	 * 조건식이 true일 경우 => 중괄호 블럭 안의 코드 실행 후 빠져나감
	 * 조건식이 false일 경우 => 중괄호 블럭 안의 코드 무시 
	 */
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다");
		}
		
	}
	
	/*
	 * * if-else 문
	 * 
	 * if(조건식){
	 * 		실행코드1
	 * }else{
	 * 		실행코드2
	 * }
	 * 
	 * 조건식이 true일 경우 실행코드1을 실행 후 if-else문 빠져나감
	 * 단, 조건식이 false일 경우 무조건 실행코드2 실행 
	 */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
		
	}
	
	/*
	 * * if-else if문
	 * 같은 비교대상으로 여러개의 조건을 제시해야될 경우 
	 * 
	 * if(조건식1){
	 * 		실행코드1
	 * }else if(조건식2){
	 * 		실행코드2
	 * }else if(조건식3) {
	 * 		실행코드3
	 * }[else{
	 * 		위의 조건들이 다 false일 경우 실행코드
	 * }]
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		}else if(num == 0) {
			System.out.println("0이다.");
		}else /*if(num < 0)*/ {
			System.out.println("음수다.");
		}
		
	}
	
	public void method4() {
		// 13세 이하 : 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이(정수만) : ");
		int age = sc.nextInt();
		
		/*
		if(age <= 13) {
			System.out.println("어린이");
		}else if(age <= 19) { // 이미 age가 13초과라는게 내제되어있음
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		*/
		
		// 조건검사
		String result; // 결과값을 보관할 변수 세팅
		if(age <= 13) {
			result = "어린이";
		}else if(age <= 19) {
			result = "청소년";
		}else {
			result = "성인";
		}
		
		// 결과를 출력문 한문장으로
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		// xxx님은 남학생이다.
		// 또는
		// xxx님은 여학생이다.
		
		/*
		if(gender == 'm' || gender == 'M') {
			System.out.println(name + "님은 남학생이다.");
		}else if(gender == 'f' || gender == 'F'){
			System.out.println(name + "님은 여학생이다.");
		}else {
			System.out.println("성별을 잘못 입력하셨습니다.");
		}
		*/
		
		String result = ""; // 변수를 미리 세팅해둘때는 반드시 초기화 해놓는 습관을 들이자!!
		
		if(gender == 'm' || gender == 'M') {
			result = "남학생";
		}else if(gender == 'f' || gender == 'F') {
			result = "여학생";
		}else {
			System.out.println("성별을 잘못 입력하셨습니다.");
			return; // 현재 속해있는 메소드를 빠져나가는 구문
		}
		
		// xxx님은 xxx이다.
		System.out.println(name + "님은 " + result + "이다.");
		// 초기화가 안된 변수는 출력문을 통해서 출력이 불가!
		
		// return;
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		/*
		if(name == "홍길동") {
			System.out.println("홍길동님 반갑습니다.");
		}else {
			System.out.println("홍길동님이 아니신가보네요. 안녕히가세요");
		}
		*/
		
		/*
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char (8개)
		 * 참조자료형 : String
		 * 
		 * 기본자료형들끼리는 ==, != 과 같은 동등비교연산자 사용가능 (정상적으로 비교)
		 * 단, 참조자료형은 ==, !=으로 비교하면 정상적으로 비교 안됨 
		 *    => equals() 메소드를 이용해서 비교해야됨
		 *    문자열.equals(문자열) : 일치할경우
		 *    !문자열.equals(문자열) : 일치하지 않는 경우
		 * 
		 */
		//if(name.equals("홍길동")) {
		if("홍길동".equals(name)) {
			System.out.println("홍길동님 반갑습니다.");
		}else {
			System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
		}
		
	}
	
	// 조건문 중첩사용
	public void method7() {
		// 사용자에게 정수를 입력 받아
		// 양수가 아닐 경우 => "양수가 아닙니다" 출력
		// 양수일 경우 => 이때 3의 배수일 경우 => "3의 배수입니다." 출력
		//			  그게 아닐 경우 => "3의 배수가 아닙니다." 출력
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(양수) 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수일 경우
			
			if(num % 3 == 0) { // 3의 배수일 경우
				System.out.println("3의 배수이다.");
			}else { // 3의 배수가 아닐 경우
				System.out.println("3의 배수가 아니다.");
			}
			
		}else { // 양수가 아닐 경우
			System.out.println("양수가 아닙니다.");
		}
	
	}
	
	public void method8() {
		// 사용자에게 -포함한 주민번호를 입력받고
		// -포함하여 잘 입력했을 경우 => 성별을 판별해서 여자/남자 출력
		//      잘못 입력했을 경우 => "-포함해서 입력해주세요" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-포함) : ");
		String str = sc.nextLine();
		
		// 문자열.length() => 해당 문자열의 길이(글자수)
		if(str.length() == 14) {
			
			char genderNum = str.charAt(7); // '1' '2' '3' '4'
			
			if(genderNum == '1' || genderNum == '3') {
				System.out.println("남자");
			}else if(genderNum == '2' || genderNum == '4') {
				System.out.println("여자");
			}else {
				System.out.println("-포함해서 잘 입력했으나 성별자리부분을 잘못입력하셨습니다.");
			}
			
		}else {
			System.out.println("- 누락되었습니다.");
		}
		
		
	}
	
	
	
	
	

	
	
	
	
	
}
