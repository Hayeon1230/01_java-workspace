package com.br.chap01.poly.run;

import com.br.chap01.poly.model.vo.Child1;
import com.br.chap01.poly.model.vo.Child2;
import com.br.chap01.poly.model.vo.Parent;

public class PolyRun {
	
	public static void main(String[] args) {
	
		// '=' 기준으로 왼쪽과 오른쪽의 자료형(타입)은 같아야됨!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 case");
		Parent p1 = new Parent();
		p1.printParent();
		// p1레퍼런스로 Parent에만 접근 가능
		
		System.out.println("\n2. 자식타입 레퍼런스로 자식객체를 다루는 case");
		Child1 c1 = new Child1();
		// ((Parent)c1).printChild1();
		c1.printChild1(); // 자동형변환 됨거임(c1 => parent타입으로)
		c1.printParent();
		// c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
		
		System.out.println("\n3. 부모타입 레퍼런스로 자식객체를 다루는 case(다형성)");
		Parent p2 = /*(Parent)*/ new Child1(); // 자동형변환 됨(자식->부모타입)(부모타입으로 자식객체 받아주는 걸 다형성이라함)
		p2.printParent(); // Child1은 안나옴
		((Child1)p2).printChild1(); // 강제형변환하면 호출은 가능
		// p2 레퍼런스로는 당장은 Parent에만 접근가능하지만
		// Child1으로 형변환 하면 Child1클래스에도 접근 가능함
		
		/*
		 * * "상속 구조"의 클래스들 간에는 형변환 가능
		 * 
		 * 1. UpCasting
		 * 	  자식 타입 -> 부모 타입으로 형변환
		 * 	  자동형변환
		 *    ex) 부모 = 자식객체();
		 * 		  자식.부모메소드();
		 * 
		 * 2. DownCasting
		 * 	  부모 타입 -> 자식 타입으로 형변환
		 * 	  강제형변환
		 * 	  ex) ((자식)부모).자식메소드();
		 * 
		 * 
		 */
//		Object o = new String();
//		Object o = new Parent();
//		Object o = new Child1(); // Object가 최상위 클래스라 셋 다 가능
//		String s = (String) new Parent(); // 상속구조 아니므로 오류
//		((Child2)p2).printChild2(); => 적절하지 않은 클래스로 형변환시 ClassCastException 오류 발생
		
		/*
		 * * 다형성 정의
		 * - 부모타입레퍼런스로 해당 부모타입으로 파생된 자식타입의 객체들을 받아줄 수 있는 것
		 *   (여러자식객체들을 하나의 부모타입으로 다룰 수 있음)
		 */
		
		// 다형성 적용 전
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 1);
		
		// ----------------------
		
		// 다형성 적용 후
		Parent[] arr = new Parent[4];
		// Parent
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 4);
		arr[2] = new Child2(3, 1, 4);
		arr[3] = new Parent();
		// 하나의 부모타입만으로 여러 자식객체들을 받을 수 있음 => 관리가 용이, 편리, 코드 길이 감소
		
		System.out.println("================");
		
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		//((Child1)arr[3]).printChild1();
		
		System.out.println("====반복문 이용해서 출력====");
		
		for(int i=0; i<arr.length; i++) {
			
			// instanceof 연산자 => 결과값은 true/false
			// 레퍼런스 instanceof 클래스타입
			// => 해당 레퍼런스가 실직적으로 클래스타입을 참조할 경우 true/ 그게 아니면 false
			if(arr[i] instanceof Child1) {
			((Child1)arr[i]).printChild1();
			}else if(arr[i] instanceof Child2){
			((Child2)arr[i]).printChild2();
			}else {
				arr[i].printParent();
			}
		}
		System.out.println("==============");
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		// 오버라이딩의 개념을 접목시키면 자동으로 실질적으로 참조하고 있는 클래스의 메소드를 찾아서 실행함
		// * 동적바인딩 : 프로그램이 실행되기 전(컴파일시)에는 정적바인딩(레퍼런스 타입의 메소드를 가리킴)됨
		//			  단, 오버라이딩이 되어있을 경우 프로그램 실행(런타임시)시 
		//			  실질적으로 참조하고 있는 객체 타입의 메소드(오버라이딩된)가 찾아져서 실행됨 
		
		Child1 cc = new Child1();
		cc.printChild1();
		cc.printParent();
		cc.print(); // 동적바인딩x
		
		Parent pp = new Child1();
		pp.print(); // 동적바인딩o
		
		System.out.println("===============");
		
		for(Parent p : arr) { // 변수 = arr[0]; => 변수 = arr[1]; ...
			/*if(p instanceof Child1) {
				((Child1)p).printChild1();
			}else if(p instanceof Child2) {
				((Child2)p).printChild2();
			}else {
				p.printParent();
			}*/
		p.print();
			
		}
		
		
	}
}
