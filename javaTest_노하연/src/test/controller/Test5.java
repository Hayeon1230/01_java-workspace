package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1자리 첫번째 정수(0~9) 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("1자리 두번째 정수(0~9) 입력 : ");
		int num2 = sc.nextInt();
		if(num1 < 0 || num1 >9 || num2 < 0 || num2 >9) {
			System.out.println("잘못 입력하였습니다.");
		}
		else {
			int mul = num1 * num2;
			if(mul<10) {
				System.out.println("한 자리 수 입니다.");
			}else {
				System.out.println("두 자리 수 입니다.");
			}
		}

	}

}
