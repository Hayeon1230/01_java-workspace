package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		// Person 객체 생성 한 후 
		Person p = new Person();
		
		// 각 필드에 값 대입
		//p.setAge(20);
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("강보람");
		p.setGender('F');
		// phone필드에 값 대입 x
		p.setEmail("teacherboram@gmail.com");
		
		/*
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getAge());
		//System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		*/
		
		System.out.println(p.information());
		
		System.out.println("==============");
		
		// 첫번째 방법 : 기본생성자로 생성한 후 setter이용해서 값 초기화
		Product p1 = new Product();
		p1.setpName("갤럭시");
		p1.setPrice(1200000);
		p1.setBrand("삼성");
		
		System.out.println(p1);
		
		// pName : xxx, price : xxx, brand : xxx 형식
		//System.out.println("pName : " + p1.getpName() + ", price : " + p1.getPrice() + ", brand : " + p1.getBrand());
		System.out.println(p1.information());
		
		// 두번째 방법 : 매개변수 생성자를 이용해서 생성과 동시에 각 필드에 초기화
		Product p2 = new Product("아이폰", 1500000, "애플");
		System.out.println(p2.information());
		
		// 가격이 낮아졌을 경우
		p2.setPrice(1300000);
		System.out.println(p2.information());
		
		
		
		
		
		
		// 결과 출력
		

	}

}
