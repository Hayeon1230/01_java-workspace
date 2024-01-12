package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPracticeAnswer {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 잘 입력했을 경우 	
			
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			
		} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		// 우선 무한 반복 돌려놓고
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. 잘 입력했을 경우 		=> 정상적인 결과 출력 후 반복문 종료
				
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우) => 다시 반복문 실행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 잘 입력했을 경우
			
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
		} else {// 1_2. 그게 아닐 경우 (잘못 입력햇을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		// 우선 무한 반복 돌려놓고
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. 잘 입력했을 경우 		=> 정상적인 결과 출력 후 반복문 종료
				
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우) => 다시 반복문 실행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		// 1에서부터 num까지 1씩 증가되는 숫자 출력, 총합계구하기
		for(int i=1; i<=num; i++) {
			
			if(i == num) {
				System.out.print(i + " = ");
			}else {
				System.out.print(i + " + ");
			}
			
			sum += i;
		}
		
		// 총합계도 출력
		System.out.println(sum);
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) { // 두 수 모두 잘 입력했을 경우 => 작은숫자에부터 큰 숫자까지 매번 1씩 증가하는 값을 출력
			
			// 1) 두 수를 가지고 최소값, 최대값을 알아내야됨!!
			/*
			int min = 0; // 두 수중에 작은 값을 기록하기 위한 변수
			int max = 0; // 두 수중에 큰 값을 기록하기 위한 변수
			if(num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			*/
			
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			
			// 2) 최소값에서부터 최대값까지 매번 1씩증가하는 값을 출력
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}
			
			
		}else { // 잘못 입력했을 경우 => "1이상의 숫자를 입력해주세요." 출력
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		// 우선 무한 반복 돌려놓고
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) { // 1_1. 두 수 모두 잘 입력했을 경우 	=> 정상적인 결과 출력 후 반복문 빠져나감
				
				int min = Math.min(num1, num2);	// 두 수 중 작은 값 담기
				int max = Math.max(num1, num2); // 두 수 중 큰 값 담기
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				
				break; 
				
			} else {// 1_2. 그게 아닐 경우 (잘못입력했을 경우) => 다시 반복문 수행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
				
			}
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) { // 1_1. 잘 입력했을 경우 => 사용자가 입력한 단에서부터 9단까지 출력
			
			
			for(int dan = num; dan <= 9; dan++) {					// 단을 지정하는 for문	(사용자가 입력한 수부터 9까지 매번 1씩 증가)
				System.out.printf("===== %d단 =====\n", dan);
				
				for(int su = 1; su <= 9; su++) {					// 곱해지는 수를 지정하는 for문	
					System.out.printf("%d * %d = %d\n", dan, su, (dan * su));
				}
				
				System.out.println();
			}		
			
			
		} else { // 1_2. 그게 아닐 경우 (즉, 잘못입력했을 경우)
			System.out.println("2~9사이의 숫자만 입력해주세요.");
			
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		// 우선 무한 반복 돌려놓고
		while(true) {			
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { // 1_1. 잘 입력했을 경우 => 사용자가 입력한 단에서부터 9단까지 출력 한 후 무한 반복 빠져나가기
				
				for(int dan = num; dan <= 9; dan++) {					// 단을 지정하는 for문
					System.out.printf("===== %d단 =====\n", dan);
					
					for(int su = 1; su <= 9; su++) {				// 곱해지는 수를 지정하는 for문
						System.out.printf("%d * %d = %d%n", dan, su, (dan * su));
					}
					
					System.out.println();
				}	
				break;
				
			} else { // 1_2. 그게 아닐 경우 (즉, 잘못입력했을 경우)
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		// start값에서부터 매번 num씩 증가되는 값을 출력 (10번만)
		/*
		for(int i=0; i<10; i++) { // 10회 반복
			System.out.print(start + " ");
			start += num;
		}
		*/
		int count = 0;
		for(; count<10; start+=num) {
			System.out.print(start + " ");
			count++;
			/*
			if(count == 11) {
				break;
			}
			*/
		}
		
	}
	
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 무한반복 {
		 * 		1. 연산자 입력받기
		 * 		2. 정수 두개 입력받기
		 * 		3. 연산기호에 따라 그에 맞는 연산결과 출력
		 * } 
		 */
		while(true) {
			// 1. 연산자 입력받기
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			// >> 사용자가 입력한 연산자가 "exit"일 경우 
			//    => "프로그램 종료" 출력 후 반복문 종료
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 2. 정수 두개 입력받기
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); 
			
			// >> 연산자가 "/" 거나 "%"일때
			//    두번째 정수값이 0일 경우 
			//    => "0으로 나눌수없음, 다시 입력" 출력 후 => 반복문 위로 올라감
			if((op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 다시입력해주세요.\n");
				continue;
			}			
			
			// 3. 연산기호에 따라 해당 연산결과 출력
			//    >> 단, 연산기호를 잘못 입력했을 경우 => "없는 연산자, 다시입력" 출력 => 반복문 위로 올라감
			int result = 0;
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			default: System.out.println("없는 연산자입니다. 다시입력해주세요.\n"); continue;
			}
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);
			
		}
		
		
	}
	
	
	
	
	
	
}
