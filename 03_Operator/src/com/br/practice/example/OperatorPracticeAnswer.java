package com.br.practice.example;

import java.util.Scanner;

public class OperatorPracticeAnswer {
	
	// 실습문제 1
	// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : " );
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다." : "양수가 아니다";
		System.out.println(result);
		
	}
	
	// 실습문제 2
	// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 
	// 양수가 아닌 경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력하세요.
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수  : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num < 0 ? "음수다" : "0이다");
		System.out.println(result);
	}
	
	
	// 실습문제 3
	// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요.
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}
	
	// 실습문제 4
	// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
	// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
		
	}
	
	// 실습문제 5
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	// 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력 처리 하세요.	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		// x학년 xx반 x번 xxx xxx의 성적은 xx.xx이다
		// 성별로 출력할 값 
		String genderStr = (gender == 'M' || gender == 'm' ? "남학생" : "여학생");
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, classNum, num, name, genderStr, score);
	}
	
	// 실습문제 6
	// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
	// 성인(19세 초과)인지 출력하세요.	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result =  (age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인");
		System.out.println(result);
		
	}
	
	// 실습문제 7
	/*
	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
	*/	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; // 합계
		//double avg = sum / 3; // 100 / 3 => 33 => 33.0   => 데이터손실발생
		double avg = sum / 3.0; // 100.0 / 3.0 => 33.3333
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		System.out.println( (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격" );
		
	}

	// 실습문제 8
	// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		
		/*
		String str = sc.nextLine(); // "850918-1333333"
		char genderNum = str.charAt(7); // '1'
		
		String genderStr = (genderNum == '1' || genderNum == '3') ? "남자" : "여자";
		System.out.println(genderStr);
		*/
		
		char genderNum = sc.nextLine().charAt(7);
		System.out.println( genderNum == '2' || genderNum == '4' ? "여자" : "남자" );
		
		
	}
	
	

}
