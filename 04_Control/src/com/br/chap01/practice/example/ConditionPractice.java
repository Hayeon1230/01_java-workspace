package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제"
				+ "\n9. 종료\n 메뉴번호를 입력하세요 : ");
		int num = sc.nextInt();
		String menu = "";
		switch(num) {
		case 1: menu = "입력";
		case 2: menu = "수정";
		case 3: menu = "조회";
		case 4: menu = "삭제";
		case 9: menu = "종료";
		
		}
		if(num == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}else{System.out.println(menu + "메뉴입니다.");
		}
	}
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void practice3() {
		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/3);
		if(kor >= 40 && math >= 40 && eng >= 40
				&& sum/3 >= 60) {
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		System.out.println("월(정수) : ");
		int num = sc.nextInt();
		String season = "";
		switch(num) {
		case 1: case 2: case 12: 
			season = "겨울"; break;
		case 3: case 4: case 5: 
			season = "봄"; break;
		case 6: case 7: case 8: 
			season = "여름"; break;
		case 9: case 10: case 11: 
			season = "가을"; break;
			
		}
		if(season.equals("")) {
			System.out.println("해당하는 계절이 없습니다.");
		}else {System.out.println("해당 월의 계절은 " + season);
		}
	}
		
	public void practice5() {
		String id = "aaa";//?
		String pwd = "1234";//전화번호 비밀번호 제일 앞자리 0도 들어가게 String으로
		
		System.out.print("아이디 : ");
		String idin = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwdin = sc.nextLine();
		
		if(id.equals(idin) && pwd.equals(pwdin)) {
			System.out.println("로그인 성공");
		}else if(id.equals(idin)) {
				System.out.println("비밀번호가 틀렸습니다.");
		}else if(pwd.equals(pwdin)){
				System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("둘 다 틀렸습니다.");
		}// result에 담아놓고 출력은 마지막에만 쓸 수도!
		// 초기값에 "둘 다 틀렸습니다"로 설정하면, 더 간결
		
		
	}
	public void practice6() {
		System.out.println("등급 : ");
	}
	public void practice7() {
		System.out.println("");
	}
	public void practice8() {
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); //기억하자!
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			int result = 0;
			switch(op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : System.out.println("연산자 확인"); return; //return 안하면 틀려도 밑에꺼 나옴
			}
			System.out.printf("%d %c %d = %d", num1,op,num2,result);
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		
	}
	public void practice9() {
		System.out.println("");
	}
	public void practice10() {
		System.out.print("중간고사 점수 : ");
		double mid = sc.nextInt() * 0.3; // 30%반영한 점수
		System.out.print("기말고사 점수 : ");
		double fin = sc.nextInt() * 0.3;
		System.out.print("과제 점수 : ");
		double task = sc.nextInt() * 0.2;
		System.out.print("출석 횟수 : ");
		double att = sc.nextInt();

		System.out.println("중간고사 점수(30) : " + mid);
		System.out.println("기말고사 점수(30) : "+ fin);
		System.out.println("과제 점수(20) : " + task);
		System.out.println("출석 횟수(20) : " + att);
		
		double score = mid + fin + task + att;
		System.out.printf("총점 : %.1f\n\n", score);
		
		
		
		if(score >= 80 && att >= (20*0.8)) {
			System.out.println("Pass");}
		/*	else if(score >= 80 && att < (20*0.8)) {
				System.out.printf("Fail [출석 횟수 부족] (%d/20)", (int)att);
				
			}else if(score < 80 && att >= (20*0.8)) {
				System.out.printf("Fail [점수 미달] )총점 %.1f점", score);
			}else {
				System.out.printf("Fail [출석 횟수 부족] (%d/20)", att);
				System.out.printf("Fail [점수 미달] )총점 %.1f점", score);
			}
		*/
		if(score < 80) {//총점이 미달일 경우
			System.out.printf("Fail [점수 미달] )총점 %.1f\n점", score);
		}
		if(att < 20 *0.8) {//출석률이 부족할 경우
			System.out.printf("Fail [출석 횟수 부족] (%d/20)", att);
		}
	}// 둘 다 부족하면, 위의 두 이프문 둘 다 출력될 것
	// 그래서 세트로 안묶고 단독이프 쓰면, else문 쓸 필요 없음
	
	
	
}
