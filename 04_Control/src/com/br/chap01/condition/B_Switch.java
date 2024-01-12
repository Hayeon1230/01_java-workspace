package com.br.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * * switch
	 * 
	 * switch(동등비교할대상자) {
	 * case 값1 : 
	 * 		실행코드1;
	 * 		실행코드1;
	 * 		break;
	 * case 값2 : 실행코드2; break;
	 * case 값3 : 실행코드3; break;
	 * ...
	 * [default : 위의 값들과 모두 일치하지 않을경우 실행할 코드;]
	 * }
	 */
	
	public void method1() {
		/*
		 * 정수를 입력받아
		 * 1일 경우 => "빨간색입니다."
		 * 2일 경우 => "파란색입니다."
		 * 3일 경우 => "초록색입니다."
		 * 잘못입력했을 경우 => "잘못입력하셨습니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		/*
		if(num == 1) {
			System.out.println("빨간색입니다.");
		}else if(num == 2) {
			System.out.println("파란색입니다.");
		}else if(num == 3) {
			System.out.println("초록색입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		switch(num) {
		case 1: 
			System.out.println("빨간색입니다.");
			break;
		case 2:
			System.out.println("파란색입니다.");
			break;
		case 3:
			System.out.println("초록색입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
	
	}
	
	public void method2() {
		// 사용자에게 구매하고자하는 과일명 입력받아
		// 해당 과일의 가격을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자하는 과일명(사과,바나나,복숭아) : ");
		String fruit = sc.nextLine();
		
		/*
		if(fruit.equals("사과")) {
			
		}else if(fruit.equals("바나나")) {
			
		}else if(fruit.equals("복숭아")) {
			
		}else {
			
		}
		*/
		
		
		
		int price = 0; // 각 과일의 가격값을 보관할 변수
		
		switch(fruit) {
		case "사과" : price = 1000; break;
		case "바나나" : price = 2000; break;
		case "복숭아" : price = 3000; break;
		}
		
		if(price == 0) { // price가 여전히 0일 경우 => 잘못입력했을경우
			System.out.println(fruit + "은 판매하지 않습니다.");
		}else { // 잘 입력했을 경우
			System.out.println(fruit + "은 " + price + "원 입니다.");
		}
	}
	
	// break없는 switch문
	public void method3() {
		// 등급별 권한
		// 1 : 읽기 권한, 글쓰기 권한, 관리 권한
		// 2 : 읽기 권한, 글쓰기 권한
		// 3 : 읽기 권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1: System.out.println("관리권한 있어");
		case 2: System.out.println("글쓰기권한 있어"); 
		case 3: System.out.println("읽기권한 있어"); break;
		default: System.out.println("잘못입력했습니다. 1~3사이의 숫자만 입력해주세요");
		}
		
	}
	
	public void method4() {
		
		// 사용자에게 이름, 성별(M/F)을 입력받은 후 
		// 'm' 또는 'M' 일 경우 "xxx은 남학생이다." 출력
		// 'f' 또는 'F' 일 경우 "xxx은 여학생이다." 출력
		// 다 아닐 경우 "성별을 잘못입력하셨습니다."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String genderStr = "";
		switch(gender) {
		case 'm': 
		case 'M': genderStr = "남학생"; break;
		case 'f':
		case 'F': genderStr = "여학생"; break;
		default:System.out.println("성별을 잘못 입력하셨습니다.");
		}
		
		// 성별을 잘 입력했을 때만 
		//if(gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
		if(!genderStr.equals("")) { // genderStr에 담긴 값이 ""이 아닐 경우 
			System.out.printf("%s은 %s입니다.", name, genderStr);
		}
		
	}
	
	public void method5() {
		// 월을 입력받아 해당 월의 마지막일 출력
		
		// 1, 3, 5, 7, 8, 10, 12 => 31일
		// 4, 6, 9, 11 => 30일 
		// 2 => 28일 또는 29일
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월 중 하나를 입력(정수) : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12: 
			System.out.println("31일까지 입니다."); 
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 입니다."); 
			break;
		case 2:
			System.out.println("29일 또는 28일까지 입니다.");
			break;
		default:
			System.out.println("반드시 1~12사이의 숫자를 입력해야됩니다.");
		}
	}
	
	public void warning() {
		// * 주의사항 *
		// 비교대상자는 int, String형만 가능하다.
		// byte, short, char는 int로 인식되기 때문에 가능
		
		/*
		double dNum = 10.0;
		switch(dNum) {
		case 10.0:
		}
		*/
		
		char bNum = 'a';
		switch(bNum) {
		
		}
		
		
	}
	
	
	
	
	
	
	

}
