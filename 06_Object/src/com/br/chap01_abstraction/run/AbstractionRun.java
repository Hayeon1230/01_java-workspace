package com.br.chap01_abstraction.run;

import com.br.chap01_abstraction.model.vo.Student;

public class AbstractionRun {
	public static void main(String[] args) {
		
		// Student 클래스로 학생 객체(틀) 생성하기
		// new 키워드로 객체 생성
		Student hong = new Student();
		// hong은 홍길동의 정보를 담은 객체이고, 틀로 다른학생도 객체생성하여 찍어낼 수 있음
		// 정보의 각 항목 = 필드
		
		// 각 영역에 "직접 접근"해서 내가 원하는 값 대입
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 161.3;
		
		System.out.println(hong); // 자료형+@+주소값기반16진수
		System.out.println(hong.name + "님의 나이는 " + hong.age + "이고, 키는" + hong.height);
		
		// 김말똥학생 객체
		Student ddong = new Student();// 정보 담기도록 공간 필요하니까 생성 -> 필드 3개니까 3개 공간 생성(각각 자료형 다르니 크기도 다름)
		//자료형 Student 의 ddong이라는 객체의 name 등의 필드
		/*
		 *  Stack에는 Student 의 ddong이라는 객체 상자만들어지고, 
		 *  Heap에 각 필드 이름으로(인덱스x) 공간 생김
		 *  그 주소가 Stack의 상자에 담김
		 */
		
		ddong.name = "김말똥";
		ddong.age = 23;
		ddong.height = 172.1;
		
		//출력
		System.out.println(ddong);
		System.out.println(ddong.name + ", " + ddong.age + ", " + ddong.height);		
	}
}
