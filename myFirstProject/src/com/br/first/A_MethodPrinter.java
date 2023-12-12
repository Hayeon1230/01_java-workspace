package com.br.first;

public class A_MethodPrinter {
	
	/*
	 * 클래스마다 무조건 메인메소드 작성할 필요 없음
	 */
	
	public void methodA() {
		System.out.println("메소드A 실행");
		methodB();
		methodC();
	}
	
	public void methodB() {
		System.out.println("메소드B 실행");
	}
	
	public void methodC() {
		System.out.println("메소드C 실행");
	}
	
}
