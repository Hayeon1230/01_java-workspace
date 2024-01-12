package com.br.chap03_interface.model.vo;

public interface Basic {

	/*
	 * 추상클래스(abstract class) : 일반필드 + 일반메소드 [+ 추상메소드]
	 * 인터페이스(interface)      : 상수필드 + 추상메소드
	 * 
	 */
	
	//private String name;
	/*public static final*/ int NUM = 10; // 상수필드만 가능
	/*public void test() {
		
	}*/
	// 추상메소드만 가능
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
}
