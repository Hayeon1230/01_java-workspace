package com.br.chap06_method.run;

import com.br.chap06_method.controller.MethodTest;
import com.br.chap06_method.controller.OverloadingTest;

public class MethodRun {

	public static void main(String[] args) {

		/*
		MethodTest m = new MethodTest();
		m.method1();
		
		//String str = m.method2();
		//System.out.println(str);
		System.out.println(m.method2());
		
		m.method3(10, 5);
		m.method3(10, 0);
		
		char ch = m.method4("pineapple", 3);
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(m.method4(str, num));
		
		System.out.println(m.method5(num));
		*/
		
		// static 메소드 호출 => 객체생성 할 필요없음
		MethodTest.staticMethod1();
		System.out.println(MethodTest.staticMethod2());
		System.out.println(MethodTest.staticMethod3("apple", "apple"));
		
		int result = Math.min(10, 5);
		
		OverloadingTest o = new OverloadingTest();
		o.test();
		o.test(5);
		o.test(10, "aa");
		o.test("aa", 10);
		
		o.test(10, 5);
		
		o.test("zz");
		
		// 오버로딩 성립예시
		System.out.println("안녕");
		System.out.println(10);
		System.out.println(5.6);
		System.out.println(Math.max(10, 20));
		
	}

}
