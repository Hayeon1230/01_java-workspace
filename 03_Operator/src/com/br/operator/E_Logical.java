package com.br.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * * 논리연산자 (이항연산자)
	 *   두개의 논리값을 연산해주는 연산자
	 *   논리연산한 결과값마저도 논리값임!!
	 *   
	 *   논리값 && 논리값 : 왼쪽, 오른쪽 둘다 true여야만 최종 결과가 true임
	 *   논리값 || 논리값 : 왼쪽, 오른쪽 둘중 하나만 true여도 최종 결과는 true임
	 *   
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		//System.out.println(1 <= num <= 100);
		
		System.out.println( (num >= 1) && (num <= 100) );
		// num이 1이상 "이고" "그리고" num이 100이하 일 경우
		// && : ~이고, 그리고, ~하면서
		//      두 개의 조건이 모두 true여야만 &&연산의 결과값도 true
		//  	=> 둘 중 하나라도 false가 있을 경우 결과값은 false
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' ~ 'Z'   컴퓨터에서는 65 ~ 90까지의 숫자로 연달아 나열되어있음
		
		//boolean result = (ch >= 65) && (ch <= 90);
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("사용자가 입력한 값이 대문자입니까 : " + result);
		
	}
	
	public void method3() {
		// 사용자에게 종료의사를 물어서 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		// || : ~이거나, 또는
		//      두 개의 조건 중 하나라도 true라면 최종 결과값은 true
		//      두 조건 모두 false일 경우 최종 결과값은 false
		System.out.println("사용자가 입력한 값이 y또는 Y입니까 : " + result);
	}
	
	public void method4() {
		// 사용자에게 성별 입력받은 후 남자인지 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'm') || (gender == 'M');
		
		System.out.println("사용자는 남자입니까 : " + result);
		System.out.println("사용자는 여자입니까 : " + (gender == 'f' || gender == 'F'));
		
	}
	
	/*
	 *  && : 두 개의 조건이 모두 true여야 결과값이 true (AND == ~이고, 그리고, ~이면서, 뿐만아니라)
	 *  
	 *  true && true	=> true
	 *  true && false	=> false
	 *  false && true	=> false
	 *  false && false  => false
	 *  
	 *  ** && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 수행되지 않음!! **
	 * 
	 * || : 두 개의 조건 중 하나라도 true면 결과값이 true (OR : 또는, ~이거나)
	 * 
	 * true || true		=> true
	 * true || false	=> true
	 * false || true 	=> true
	 * false || false	=> false
	 * 
	 * ** || 연산자를 기준으로 앞의 결과가 true일 경우 뒤의 조건은 굳이 실행되지 않음!! **
	 * 
	 */
	public void method5() {
		int num = 10;
		
		boolean result1 = (num < 5) && (++num > 0);
		System.out.println("result1 : " + result1);
		System.out.println("&&연산 후의 num : " + num);
		
		boolean result2 = (10 < 20) || (++num > 0);
		System.out.println("result2 : " + result2);
		System.out.println("||연산 후의 num : " + num);
		
	}
	
	public void method6() {
		
		int a = 2;
		int b = 3;
		
		boolean c = a > b;		// c=false
		boolean d = ++a <= b++; // a=3, b=3(4), c=false, d=true
		
		System.out.println("a : " + a); // 3
		System.out.println("b : " + b); // 4
		System.out.println("c : " + c); // false
		System.out.println("d : " + d); // true
		
		System.out.println("c != d : " + (c != d)); // true
		
		// a=3, b=4, c=false, d=true
		System.out.println("b % a == 1 : " + (b % a == 1)); // true
		System.out.println("a == 3 && b == 4 : " + (a == 3 && b == 4)); // true
		System.out.println("!d || a - b > 0 : " + (!d || a - b > 0)); // false || false => false 
		
		
		System.out.println( !(c == d) && ( (a * b == 10) || (b % 2 == 0) ) );
		//					 !false   && (      false    ||     true )
		//					   true	  &&     true    => true
		
		
		
		
	}

}
