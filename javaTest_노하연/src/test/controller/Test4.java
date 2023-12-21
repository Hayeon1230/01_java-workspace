package test.controller;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1자리 첫번째 정수(0~9) 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("1자리 두번째 정수(0~9) 입력 : ");
		int num2 = sc.nextInt();
		if(num1 < 0 || num1 >9 || num2 < 0 || num2 >9) {
			System.out.println("잘못 입력하였습니다.");
		}else if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else {
			System.out.printf("합 : %d\n차 : %d\n곱 : %d\n나누기 : %d", num1+num2,num1-num2,num1*num2,num1/num2);
		}

	}

}
