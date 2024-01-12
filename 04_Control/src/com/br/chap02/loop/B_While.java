package com.br.chap02.loop;

import java.util.Scanner;

// import java.lang.*;     => 이 구문은 보이지 않지만 존재함
//import java.lang.Math; 안해도됨

public class B_While {
	/*
	 * * while문
	 * 
	 * [초기식;]
	 * while(조건식) {
	 * 		반복적으로 실행할 코드
	 * 		[증감식;]
	 * }
	 * 조건식이 true일 경우 해당 코드 실행                          
	 * 
	 */
	public void method1() {
		// 안녕하세요 5번 출력
		
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println(i);
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		while(i <= 5) {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");// 한줄로 기술 가능
		}
	}
	
	public void method3() {
		// 1에서부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		/*
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		*/
		
		// i는 1에서부터 10까지 1씩증가하지만
		// 홀수만 출력되도록
		int i = 1;
		while(i <= 10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
	
	public void method4() {
		// 1부터 랜덤값(1~100사이) 까지의 총합계
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i++;
			//i++;
		}
		
		System.out.println("1에서부터 " + random + "까지의 총합계 : " + sum);
		
	}
	
	public void method5() {
		// A_For 클래스의 method9를 바꿔보기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while(i<str.length()) {
			System.out.println(str.charAt(i++));
		}
		
	}
	
	public void method6() {
		// 무한반복 활용하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n====== 메뉴 ======");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 5까지 출력");
			System.out.println("3. 1부터 10까지 홀수 출력");
			System.out.println("4. 1부터 랜덤값까지 총합계 출력");
			System.out.println("5. 문자열의 각 문자 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("\n메뉴 입력 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 4: method4(); break;
			case 5: method5(); break;
			case 0: System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다."); return;
			default: System.out.println("메뉴 번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}
	
	/*
	 * * do-while문
	 * 
	 * do {
	 * 		반복적으로 실행할 코드
	 * }while(조건식);
	 * 
	 * * 조건검사없이 무조건 처음에 한번은 실행
	 * 
	 */
	public void method7() {
		int num = 1;
		do {
			System.out.println(num);
		}while(false);
	}
	
	public void method8() {
		// 1부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i++;
		}while(i<=num);
		
		System.out.println("1부터 " + num + "까지의 총 합계 : " + sum);
	}
	
	public void method9() {
		// 사용자에게 문자열 입력받고 해당 문자열의 길이 출력해주는걸 매번 반복
		// 단, 사용자가 입력한 문자열이 "exit"과 일치할 경우 반복을 멈춤
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		do {
			System.out.print("문자열 입력(종료하고자 한다면 exit입력) : ");
			str = sc.nextLine();
			
			System.out.println(str + "의 글자수는 " + str.length() + "글자 입니다.\n");
		}while(!str.equals("exit"));// 반복이 수행될 조건 => 입력한 문자열이 "exit" 아닐경우
		
	}
	
	

}
