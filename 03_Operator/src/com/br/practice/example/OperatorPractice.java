package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);
	}
	
	public void practice2() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다";
		System.out.println(result);
		
	}
	
	public void practice3() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	
	public void practice4() {
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		int num1 = candy / people;
		int num2 = candy % people;
		
		System.out.println("\n1인당 사탕 개수 : " + num1);
		System.out.println("남는 사탕 개수 : " + num2);
		
	}
	
	public void practice5() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int class1 = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		char gender2 = gender == 'M' || gender == 'm' ? '남' : '여';
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.\n",
				grade, class1, num, name, gender2, score);
		
	}
	
	public void practice6() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String st = age <= 13 ? "어린이" : age > 13 && age <= 19 ? "청소년" : "성인";
		System.out.println(st);
	}
	
	public void practice7() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int sum = kor + eng + math;
		int average = sum / 3;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (average));
		String result = average >= 60 ? "합격" : "불합격";
		System.out.println(result);
		
	}
	public void practice8() {
		System.out.print("주민번호를 입력하세요(-포함) : ");
		char num = sc.nextLine().charAt(8);
		String result = num == '1' ? "남자" : "여자";
		System.out.println(result);
		
	}
}
