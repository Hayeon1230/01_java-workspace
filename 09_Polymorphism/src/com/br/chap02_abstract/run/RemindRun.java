package com.br.chap02_abstract.run;

import com.br.chap01_poly.model.vo.Child1;
import com.br.chap01_poly.model.vo.Child2;
import com.br.chap01_poly.model.vo.Parent;

public class RemindRun {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		Child1 c1 = new Child1();
		((Parent)c1).printParent(); // 자동형변환됨(upcasting)
		c1.printChild1();
		
		Parent p2 = (Parent)new Child1(); // 자동형변환됨(upcasting)
		p2.printParent();
		((Child1)p2).printChild1(); // 강제형변환됨(downcating)
		
		Parent[] arr = new Parent[5];
		arr[0] = new Child1();
		arr[1] = new Child2();
		arr[2] = new Child1();
		arr[3] = new Child2();
		
		test(new Child1());
		test(new Child2());
		
		new Parent().equals(new Parent());
		new Child1().equals(new Child1());
		
		/*
		 * * 추상클래스
		 * - 일반필드 + 일반메소드 [+ 추상메소드(==미완성된==미구현된메소드)]
		 * - 객체생성 불가 (단, 레퍼런스 타입으로는 사용가능)
		 * - 단지 객체 생성이 불가능하게끔 하고자 할 경우 => 추상메소드가 없어도 abstract class로 선언해도됨
		 * - 자식클래스들에게 동일한 패턴의 메소드를 가지게끔 하고자 할 때 
		 */
		
	}
	
	public static void test(Parent p) {
		
	}
	
	

}
