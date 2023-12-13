package com.br.practice.example;
import java.util.Scanner;
public class VariablePractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print("\n키 " + height + "인 "
						  + age + "살 " + gender + "자 " 
						  + name + "님 반갑습니다^^");
	}
	
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
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String st = sc.nextLine();
		char one = st.charAt(0);
		char two = st.charAt(1);
		char three = st.charAt(2);
		System.out.print("첫 번째 문자 : " + one);
		System.out.print("\n두 번째 문자 : " + two);
		System.out.print("\n세 번째 문자 : " + three);
	}
}
