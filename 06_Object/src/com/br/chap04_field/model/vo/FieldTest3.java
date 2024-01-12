package com.br.chap04_field.model.vo;

public class FieldTest3 {
	// 필드부
	// 접근제한자 [예약어] 자료형 변수명;
	
	// static 공유의 개념 
	// static이 붙은 애들은 프로그램실행과 동시에 메모리 static영역에 올라감
	public static String sta = "static_FieldTest3";
	
	// static : 공유의 개념
	// final : 상수의 개념 (한번 지정된 값 변경 x)
	
	// 상수필드(static final) : 프로그램 시작시 값이 저장되면 더이상 변경되지 않고 공유하면서 사용할 목적
	public static final String STA_FIN = "static final";

}
