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

	public void practice2() {//?
		System.out.println("1 이상 정수 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (num < 1) {
				
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
				continue;
				
			} else {
				System.out.print(i + " ");

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
			System.out.println(i);
		}
	}

}
