package com.br.variable;
//ctrl n -> 새로 만들기

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void inputScanner1() {
		
		/*
		 * java.util.Scanner 클래스를 이용해서 
		 * 사용자가 키보드로 입력한 값 읽어들일 수 있음
		 * 
		 * Scanner 클래스 내의 특정 메소드 호출하기
		 */
		Scanner sc = new Scanner(System.in); // System.in => 입력된 값을 바이트 단위로 읽어들이겠다.
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// * 사용자가 입력한 값을 문자열로 읽어들이는 메소드 ( next(), nextLine() )
		//String name = sc.next(); // next() : 공백 이전까지의 값을 읽어들임
		String name = sc.nextLine(); // nextLine : 공백 포함 모두 읽어들임
		
		//System.out.println("사용자가 입력한 이름 값 : " + name);
		
		System.out.print("당신의 나이는 몇살입니까(숫자만) : ");
		// * 사용자가 입력한 값을 "정수값"으로 읽어들이는 메소드
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까 : ");
		
		// *사용자가 입력한 값을 "실수값"으로 읽어들이는 메소드 => nextDouble()
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 키는 xxx.xcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm입니다.");
		
		
		
		
	}

}
