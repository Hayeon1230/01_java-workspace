package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		// 1. 기본생성자로 객체 생성 후에 바로 정보 출력
		User u1 = new User(); // 생성자 호출하는 부분
		System.out.println(u1.information());
		
		// 2_1. 기본생성자로 객체 생성 후에 setter메소드를 이용해서 값 초기화 후 정보 출력
		/*
		User u2 = new User();
		u2.setUserId("user01");
		u2.setUserPwd("pass01");
		u2.setUsername("홍길동");
		System.out.println(u2.information());
		*/
		
		// 2_2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user01", "pass01", "홍길동");
		System.out.println(u2.information());
		
		//3. 매개변수 5개짜리 생성자로 객체 생성 후 정보 출력
		User u3 = new User("user02", "pass02", "김말똥", 23, 'M');
		System.out.println(u3.information());
	}

}
