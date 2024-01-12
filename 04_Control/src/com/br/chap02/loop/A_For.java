package com.br.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * <반복문>
	 * 특정 코드를 반복적으로 수행시켜주는 제어문
	 * 
	 * 크게 두종류로 나뉨 (for문 / while문(do-while문))
	 * 
	 * * for문
	 * for([초기식]; [조건식]; [증감식]) { // 반복 횟수를 지정하기 위해 제시
	 * 		반복시키고자하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성
	 * 			조건식이 true일 경우 해당 구문 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++,--)를 사용)
	 * 
	 * * 알아둘 것
	 * for문 안에 초기식, 조건식, 증감식 각각 생략가능함 (단, ;은 반드시 기술)
	 * for(;;){ => 무한반복
	 * 
	 * }
	 */
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력하기
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for(int i=1; i<=5; i++) { // i값이 1에서부터 5까지 매번 1씩 증가되는동안 반복 수행(1,2,3,4,5 => 5회)
			System.out.println("안녕하세요.");
		}
		
		for(int i=0; i<5; i++) { // i값이 0에서부터 4까지 매번 1씩 증가되는동안 반복 수행 (0,1,2,3,4 => 5회)
			System.out.println("반갑습니다.");
		}
		
		/*
		 * Tip. 내가 원하는 횟수만큼 반복문 돌리고자 할때
		 * for(int i=0; i<횟수; i++) {
		 * 
		 * }
		 */
		
		for(int i=11; i<16; i++) { // 11에서부터 15까지 1씩증가 (11,12,13,14,15 => 5회)
			System.out.println("잘가세요");
		}

		for (int i = 1; i < 10; i += 2) { // 1에서 9까지 2씩 증가되는동안 (1,3,5,7,9 => 5회)
			System.out.println("hello");
		}

		for (int i = 0; i < 7; i++) { // 0에서부터 6까지 (0,1,2,3,4,5,6 => 7회)
			System.out.println("ㅋㅋㅋ");
		}

	}

	public void method2() {
		// 1부터 5까지 출력
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		for(int i=1; i<6; i++) { // 1에서부터 5까지 매번1씩증가 (1,2,3,4,5)
			System.out.println(i);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(i+1);
		}
		
	}
	
	public void method3() {
		// 5 4 3 2 1
		for(int i=5; i>=1; i--) { // 5에서부터 1까지 매번1씩 감소하는동안 
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1부터 10사이의 홀수만을 출력
		// 1 3 5 7 9
		/*
		for(int i=1; i<=10; i+=2) { // 5회 반복
			System.out.print(i + " ");
		}
		*/
		
		for(int i=1; i<=10; i++) { // 10회 반복
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void method5() {
		// 1에서부터 10까지의 총 합계
		// 방법1. int sum = 1+2+3+4+5+6+7+8+9+10;
		/*
		 * 방법2. 
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * ...
		 * sum += 9;
		 * sum += 10;
		 * 
		 * sum변수에 특정값 누적해서 합산되는 구문이 반복적으로 실행
		 * 즉, sum += xx; => 반복실행
		 * 단, 누적해서 더하고자하는 값이 1에서부터 10까지 1씩 증가
		 */
		
		int sum = 0;
		
		for(int i=51; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("51에서부터 100까지의 총 합계 : " + sum);
		
	}
	
	public void method6() {
		// 1에서부터 사용자가 입력한 수까지의 총 합계
		// 1. 사용자에게 값 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 양수로 잘 입력했을 경우 => 총합계구해서 출력
			// 2. 총 합계 구하기
			int sum = 0;
			for(int i=1; i<=num; i++) { // 1에서부터 사용자가입력한수(num)까지 1씩 증가되는동안 반복 
				sum += i;
			}
			
			// 3. 결과 출력
			// 1에서부터 xx까지의 총 합계 : xxx
			System.out.println("1에서부터 " + num + "까지의 총 합계 : " + sum);
			
		}else { // 양수로 입력하지 않았을 경우 => 잘못입력했음 알리기
			System.out.println("양수로 입력해야됩니다.");
		}
		
	}
	
	public void method7() {
		// 1에서부터 랜덤값(1~10사이의 정수랜덤값)까지의 총 합계
		
		/*
		 * java.lang.Math클래스에서 제공하는 random()메소드 호출
		 * => 0.0 ~ 0.999999999 사이의 실수랜덤값 발생
		 *    (0.0 <=   < 1.0)
		 *    
		 * * 특이사항
		 * Math 클래스 안의 메소드를 호출하고자 한다면 
		 * Math.xxx(); 하면됨 (즉, 클래스 가지고 생성구문 없음)
		 */
		
		//int random = Math.random(); // double형이라서 안됨
		//			  0.0 <=  < 1.0  => 0.0 ~ 0.99999999
		
		//int random = Math.random() * 10;
		//			  0.0 <=  < 10.0
		
		//int random = Math.random() * 10 + 1;
		//			  1.0 <=  < 11.0  => 1.0 ~ 10.9999999
		
		int random = (int)(Math.random() * 10 + 1);
		//			    1 <=  < 11    => 1 ~ 10
		
		/*
		 * Tip. 랜덤값 발생 범위 지정
		 * (int)(Math.random() * 발생시킬랜덤값갯수 + 시작수)
		 */
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("1에서부터 " + random + "까지의 총합계 : " + sum);
		
	}
	
	public void method8() {
		
		String str = "Hello";
		
		// 각 인덱스의 문자 뽑아서 출력
		/*
		 * H => 출력(str.charAt(0));
		 * e => 출력(str.charAt(1));
		 * l => 출력(str.charAt(2));
		 * l => 출력(str.charAt(3));
		 * o => 출력(str.charAt(4));
		 * 
		 * 0번인덱스에서부터 4번인덱스(마지막인덱스)까지 매번1씩 증가하면서 반복 수행
		 * 
		 */
		for(int i=0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method9() {
		// 사용자에게 문자열 입력받아서 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 각 인덱스의 문자를 모두 추출해서 출력
		
		// apple : 5글자 
		// 01234
		
		// strawberry : 10글자
		// 0123456789
		
		// kiwi : 4글자
		// 0123  
		
		// 마지막인덱스수 == 문자열의길이-1 
		// 0번인덱스에서부터 (문자열의길이-1)인덱스까지 매번 1씩증가
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		// 2단 출력
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 */
		
		for(int i=1; i<10; i++) {
			System.out.printf("2 x %d = %d\n", i, 2*i);
		}
		
	}
	
	public void method11() {
		// 사용자에게 출력하고자 하는 단을 입력받고 (정수)
		// 2~9사이의 정수일 경우 => 해당 단을 출력
		// 그게 아닐 경우 => "2~9사이의 숫자를 입력해야됩니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단(2~9)을 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			// 해당 단 출력
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
		}else {
			System.out.println("2~9사이의 숫자를 입력해야됩니다.");
		}
		
	}
	
	public void method12() {
		// 2부터 9사이의 랜덤 단을 출력하기
		int dan = (int)(Math.random() * 8 + 2);
		
		System.out.println("====" + dan + "단====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", dan, su, dan*su);
		}
	}
	
	// 중첩 for문
	public void method13() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i=1; i<=3; i++) { // 반복횟수 3회
			
			for(int j=1; j<=5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
	}
	
	public void method14() {
		
		// ****
		// ****
		// ****
		// ****
		
		// 행은 1~4까지 반복  => 바깥쪽 for문
		// 매 행 고정일때 열은 1~4까지 반복  => 안쪽 for문
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method15() {
		
		// 1***   => 1행 1열일때 숫자1 출력
		// *2**	  => 2행 2열일때 숫자2 출력
		// **3*   => 3행 3열일때 숫자3 출력
		// ***4   => 4행 4열일때 숫자4 출력
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i == j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public void method16() {
		// 2단부터 9단까지 출력
		
		// 2단 ~ 9단 까지 매번 1씩 증가 => 바깥쪽 for문
		// 한 단이 고정일때 곱해지는 수는 매번 1~9까지 1씩 증가 => 안쪽 for문
		
		// 2~9단 사이에 3의 배수단만 출력
		
		for(int dan=2; dan<=9; dan++) {
			
			if(dan % 3 == 0) {
				System.out.println("====" + dan + "단====");
				for(int su=1; su<=9; su++) {
					System.out.printf("%d x %d = %d\n", dan, su, dan*su);
				}
				System.out.println();
			}
		}
		
	}
	
	public void method17() {
		/*
		 * 0시 0분
		 * 0시 1분
		 * 0시 2분
		 * ....
		 * 0시 59분
		 * 
		 * 1시 0분
		 * 1시 1분
		 * ....
		 * 1시 59분
		 * 
		 * ...
		 * 
		 * 23시 0분
		 * 23시 1분
		 * ....
		 * 23시 59분
		 */
		// 0시 ~ 23시  => 바깥쪽 for문
		// 매 시 마다 0분~59분까지 1씩 증가 => 안쪽 for문
		for(int hour=0; hour<24; hour++) {
			for(int min=0; min<60; min++) {
				System.out.printf("%d시 %d분\n", hour, min);
			}
			System.out.println();
		}
		
	}
	
	
	public void homework() { // A_For 클래스에 작성할것!
		/*
		아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성해오시오.
		(5행 10열짜리 *을 먼저 출력해놓고 거기서 응용한다고 생각해보시오)
		
		**********
		*        *
		*        *
		*        *
		**********

		*/
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i == 1 || i == 5) { // 첫번째 또는 마지막 행일 경우
					System.out.print("*");
				}else { // 2번째, 3번째, 4번째 행일 경우
					if(j == 1 || j == 10) { // 첫번째 열 또는 마지막 열일 경우
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	

}
