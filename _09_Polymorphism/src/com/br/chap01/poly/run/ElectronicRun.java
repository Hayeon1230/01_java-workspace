package com.br.chap01.poly.run;

import com.br.chap01.poly.controller.ElectronicShop1;
import com.br.chap01.poly.controller.ElectronicShop2;
import com.br.chap01.poly.model.vo.Desktop;
import com.br.chap01.poly.model.vo.Electronic;
import com.br.chap01.poly.model.vo.NoteBook;
import com.br.chap01.poly.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		/*
		// 납품업체
		
		//1. 다형성적용 x (ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		
		// 납품하는중
		es.insert(new Desktop("Samsung","데탑",1200000,"Geforce1070"));
		es.insert(new NoteBook("LG","그램",1800000,4));
		es.insert(new Tablet("Apple","iPad",900000,false));
		
		// 조회
		Desktop d = es.selectDektop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 다형성 적용한 케이스(ElectronicShop2)
		ElectronicShop2 es = new ElectronicShop2();
		
		es.insert(new Desktop("Samsung","데탑",1200000,"Geforce1070"));
		es.insert(new NoteBook("LG","그램",1800000,4));
		es.insert(new Tablet("Apple","iPad",900000,false));
		
		// 조회
		/*
		Desktop d = (Desktop)es.select(0);
		NoteBook n = (NoteBook)es.select(1);
		Tablet t = (Tablet)es.select(2);
		*/
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		/*
		 * * 다형성을 사용하는 이유
		 * 1. 부모타입 배열로 다양한 자식객체들을 받을 수 있음
		 * 2. 메소드 정의시 매개변수로 부모타입을 적용시키면 메소드의 갯수가 확 줄어들음
		 * 	  => Object클래스에 equals메소드의 매개변수가 Object로 되어있음
		 * 		 학생객체.equals(학생객체)
		 * 		 도서객체.equals(도서객체)
		 * 		 제품객체.equals(제품객체)
		 * 		  xx  .equals( xx )
		 * 		 어떤자료형의 객체든 다 전달받아야될 경우 모든 클래스의 최고 조상인 Object클래스타입으로
		 */
		
	}

}
