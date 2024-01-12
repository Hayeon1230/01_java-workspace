package com.br.chap04_field.model.vo;

public class FieldTest2 {

	/*
	 * * 접근제한자 4가지(class선언부, 필드부, 생성자부, 메소드부)
	 * 
	 * public	 => 어디서든(같은패키지, 다른패키지 모두) 접근 가능
	 * protected => 같은패키지안에서는 접근가능, 다른패키지일 경우 상속구조(부모자식간의 관계)라면 접근 가능
	 * default	 => 같은패키지안에서만 접근가능 (다른패키지일 경우 불가)
	 * private	 => only 해당 클래스에서만 접근 가능
	 * 
	 */
	public String pub = "public";
	protected String pro = "protected";
	String def = "default"; //생략 == default
	private String pri = "private";
	
	public static String sta = "static_FieldTest2";
	
	
}
