package com.br.chap03_class.run;

import java.util.Scanner;

import com.br.chap03_class.model.vo.Snack;

public class RemindRun {
	public static void main(String[] args) {
		/*
		 * * 객체지향프로그래밍 : 현실세계에서의 객체간의 상호작용을 가상세계로 구현하는 과정
		 * * 클래스 : 구현하고자 하는 프로그램상의 필요한 객체들의 속성값들을 담아내기위한 그릇같은 존재
		 * * 추상화 : 필요한 객체들 => 공통적인 속성 및 기능 나열 => 프로그램의 실질적인 목적에 맞춰 "불필요한걸 제거"
		 * * 캡슐화 : 외부로부터의 데이터 접근을 제한(데이터 보호) / 단, 간접적으로 처리할 메소드(getter/setter)로 같이 기술
		 * 
		 */
		
		
		// 객체생성 과정(== 인스턴스화 한다) 자바에서의 객체 == 인스턴스
		/*Snack sumi = new Snack();
		sumi.setsName("수미칩"); // 해당함수 매개변수에 "수미칩"담긴 후 sName 필드에 담기고, 중괄호 끝나고, 호출했던 이 메소드 자리로 돌아오고 다음코드 진행
		//sumi.setBrand("농심");
		sumi.setPrice(1000);
		sumi.setKcal(400);
		// 꼭 모든 필드를 채울 필요는 없음 신제품이라 가격미정? 해당 줄 없어도 됨
		System.out.println(sumi); // 참조변수 출력 -> 자료형+주소값 출력
		System.out.println(sumi.information());
		
		// 사용자에게 입력받은 정보로 Snack객체 생성
		Snack meok = new Snack();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록하고자 하는 과자명 : ");
		//String sName = sc.nextLine();
		//meok.setsName(sName);
		meok.setsName(sc.nextLine());
		//System.out.print("등록하고자 하는 과자의 브랜드명 : ");
		//meok.setBrand(sc.nextLine());
		System.out.println("등록하고자 하는 과자의 가격 : ");
		meok.setPrice(sc.nextInt());
		System.out.println("등록하고자 하는 과자의 칼로리 : ");
		meok.setKcal(sc.nextInt());
		
		System.out.println(meok.information());
		System.out.println("회사명 : " + Snack.BRAND);
		*/
		// 매개변수 생성자를 활용
		Snack sumi = new Snack("수미칩", 1000, 400);
		System.out.println(sumi.information());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과자명 : ");
		String sName = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("칼로리 : ");
		int kcal = sc.nextInt();
		
		Snack meok = new Snack(sName, price, kcal);
		System.out.println(meok.information());
		
		
	}
}
