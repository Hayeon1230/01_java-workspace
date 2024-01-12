package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice2() {// ?
		
		while (true) {
			System.out.println("1 이상 정수 : ");
			int num = sc.nextInt();
			if (num < 1) {

				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
			} else {
				for (int i = 1; i <= num; i++) {

					System.out.print(i + " ");
					System.out.println();					
				}

			}

		}
	}

	public void practice3() {
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice4() {

	}

	public void practice5() {

		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i);
				if (i != num) {
					System.out.print("+");
				}
				sum = sum + i;
			}
			System.out.print("=" + sum);
		}

	}

	public void practice5_2() {
		System.out.println("정수 입력 :");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			if (i == num) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
			sum = sum + i;
		}
		System.out.print(sum);
	}

	public void practice6() {// ?

		System.out.println("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 >= 1) {
			if (num1 > num2) {
				for (int i = num2; num1 <= i; i++) {
					System.out.print(i);
				}
			} else {
				for (int i = num1; num2 <= i; i++) {
					System.out.print(i);
				}
			}
		} else {
			System.out.println("1이상의 숫자만 입력해주세요.");
		}
	}

	public void practice8() {

		System.out.println("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("==== " + dan + "단 ====");
		for (int i = 1; i <= 9; i++) {
			int ans = dan * i;
			System.out.printf("%d * %d = %d\n", dan, i, ans);
		}

	}

	public void practice9() {
		System.out.println("숫자 : ");
		int dan = sc.nextInt();
		if (dan >= 2 && dan <= 9) {
			for (int j = dan; j <= 9; j++) {

				System.out.println("==== " + j + "단 ====");
				for (int i = 1; i <= 9; i++) {

					int ans = j * i;
					System.out.printf("%d * %d = %d\n", j, i, ans);
				}
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice11() {
		System.out.println("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.println("공차 : ");
		int dif = sc.nextInt();

		for (int i = start; i <= (start + dif * 9); i += dif) {
			System.out.print(i + " ");
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);
		/*
		 * 무한반복{ 1. 연산자 입력받기 2. 정수 두개 입력받기 3. 연산기호에 따라 그에 맞는 연산결과 출력 }
		 * 
		 */

		while (true) {
			// 1. 연산자 입력받기
			System.out.print("연산자(+,-,*,/,%) : ");
			String op = sc.nextLine();

			// >> 사용자가 입력한 연산자가 "exit"일 경우
			//	  => "프로그램 종료" 출력 후 반복문 종료
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

			// >> 연산자가 "/"거나 "%"일 때
			//	  두번째 정수값이 0일 경우
			//    => "0으로 나눌수없음, 다시 입력" 출력 후 => 반복문 위로 올라감
			if((op.equals("/") || op.equals("%")) && num2 == 0) {
				//&&이 ||보다 먼저 연산됨 => 그래서 괄호 없으면 /만 있어도 아래 문구 출력됨
				System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.\n");
				continue;
			}
			
			
			// 3. 연산기호에 따른 결과 출력
			// 단, 연산기호를 잘못 입력했을 경우 => "없는 연산자, 다시 입력" 출력 =>반복문 위로 올라감
			int result = 0;
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
				continue;
			}

			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);

		}

	}

}
