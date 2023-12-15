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
		int pw = 1234;
		
		System.out.println("아이디 : ");
		String idin = sc.nextLine();
		System.out.println("비밀번호 : ");
		int pwin = sc.nextInt();
		
		if(id == idin && pw == pwin) {
			System.out.println("로그인 성공");
		}else if(id == idin) {
				System.out.println("비밀번호가 틀렸습니다.");
		}else {
				System.out.println("아이디가 틀렸습니다.");
		}
		
		
	}
	public void practice6() {
		System.out.println("등급 : ");
	}
	public void practice7() {
		System.out.println("");
	}
	public void practice8() {
		System.out.println("");
	}
	public void practice9() {
		System.out.println("");
	}
	
}
