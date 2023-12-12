package com.br.practice.example;
import java.util.Scanner;
public class VariablePractice {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.println("\n더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
		
	}
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double row = sc.nextDouble();
		System.out.print("세로 : ");
		double col = sc.nextDouble();
		System.out.print("\n" + "면적 : " + (row * col) + "\n둘레 : " + ((row+col)*2));
	}
}
