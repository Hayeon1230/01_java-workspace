package com.dr.chap01_beforVSafter.before.run;

import com.dr.chap01_beforVSafter.before.model.vo.Desktop;
import com.dr.chap01_beforVSafter.before.model.vo.SmartPhone;
import com.dr.chap01_beforVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		// Desktop객체생성
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱좋은데스크탑", 2000000, true);
		
		//Tv객체생성
		// brand~price, inch
		Tv t = new Tv("엘지", "t-03", "겁나얇은티비", 3500000, 65);
	
		// SmartPhone객체생성
		SmartPhone s = new SmartPhone("애플", "s-02","아이폰15pro", 1700000, "KT");
		
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * * 상속
		 * - 부모(상위)클래스/자식(하위)클래스로 표현가능
		 * - 부모클래스로 매 자식클래스마다 작성해야되는 공통적인 코드를 한번만 정의해두면
		 * 	 매번 자식클래스를 작성할때 간결해짐
		 * 
		 * * 세 클래스의 공통적인 코드 => 부모클래스(Product)로 단 한번만 기술
		 * - brand, pCode, pName, price 필드
		 * - 네가지 필드의 get/setter메소드, information메소드
		 */
		
		
		
	}

}
