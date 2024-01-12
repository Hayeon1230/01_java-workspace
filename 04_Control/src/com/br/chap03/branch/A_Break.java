package com.br.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break;	: 반복문 안에 사용되는 분기문
	 * 			  해당 구문이 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * * 유의사항 : switch문 안에서의 break는 단지 switch문만 빠져나감 
	 *   ex)
	 *   	반복문(){
	 *   		switch(){
	 *   			break; => 해당 switch문만을 빠져나감
	 *   		}
	 *   	}
	 */
	
	public void method1() {
		// 사용자에게 문자열 입력받아 해당 문자열의 길이 출력(매번 반복)
		// 단, exit문자열일 경우 반복문을 빠져나가게끔
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문자열 입력(종료할거면 exit입력) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println(str + "의 글자수는 " + str.length() + "글자 입니다.\n");
			
		}
	}
	
	public void method2() {
		// 매번 랜덤값 발생시켜서 그 랜덤값 출력 (매번 반복)
		// 단, 발생된 랜덤값이 4의 배수일 경우 반복이 종료 
		while(true) {
			int random = (int)(Math.random() * 100 + 1);
			
			System.out.println("랜덤값 : " + random);
			
			if(random % 4 == 0) {
				break;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method3() {
		// 사용자에게 단(2~9)을 입력받아 해당 단을 출력
		// 단을 잘 입력했을 경우 해당 단을 출력하고 프로그램종료
		// 단을 잘못 입력했을 경우 다시 단을 입력받게끔
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("단(2~9)을 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if(dan >= 2 && dan <= 9) {// 잘입력했을경우 => 해당단을 출력 후 반복문 빠져나가기
				
				for(int su=1; su<=9; su++) {
					System.out.printf("%d x %d = %d\n", dan, su, dan*su);
				}
				break;
				
			}else { // 잘못입력했을경우 => "잘못입력"출력 후 반복다시수행
				System.out.println("잘못입력했습니다.");
			}
		}
		
	}
	

}
