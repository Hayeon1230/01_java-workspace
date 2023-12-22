package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		// Person 객체 생성한 후
		Person p = new Person();
		Product pr = new Product();
		
		//각 필드에 대입 - 초기화 순서는 상관없음
		//p.id = "user01";
		p.setId("user01"); // public인 것만 접근 가능, 넣을 값과 함께만 접근 가능
		p.setPwd("pass01");
		p.setName("강보람");
		p.setAge(34);
		p.setGender('F');
		// phone 필드에 값 대입 x
		// p.setPhone("010-1111-2222"); // 담고자 하는게 없으면 대입 안해도 됨
		p.setEmail("teacherboram@gmail.com\r\n");
		
		pr.setPName("갤럭시");
		pr.setPrice(1200000);
		pr.setBrand("삼성");
		
		
		//결과 출력
		/*System.out.println(p.getName());
		System.out.println(p.getPwd());
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		System.out.println(p.getGender());*/
		//System.out.println(p.information());
		
		System.out.println(pr.getPName());
		System.out.println(pr.getPrice());
		System.out.println(pr.getBrand());
		System.out.println(pr.information());
	}

}
