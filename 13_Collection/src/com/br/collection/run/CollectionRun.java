package com.br.collection.run;

import com.br.collection.controller.A_ListController;
import com.br.collection.controller.B_SetController;
import com.br.collection.controller.C_MapController;

public class CollectionRun {
	
	/*
	 * 1. 컬렉션이란
	 *    "자료구조"를 담당하는 "프레임워크"로 자료구조가 내장되어있는 자바클래스
	 *    
	 *    > 자료구조
	 *      방대한 데이터들을 효율적(구조적)으로 관리(조회, 정렬, 추가, 수정, 삭제) 할 수 있는 개념
	 *    > 프레임워크
	 *      데이터나 기능들을 보다 쉽게 사용할 수있도록 제공하는 틀 
	 *      
	 * 2. 배열과 컬렉션의 차이점 (배열의 단점 vs 컬렉션의 장점)
	 *    > 배열
	 *    - 크기에 제약이 많음 (크기 지정 필수, 한번 지정된 크기 변경 불가) 
	 *    - 중간 위치에 추가하거나 삭제하는 경우 값을 땡겨주는 알고리즘을 직접 구현해야됨
	 *    - 한 타입의 데이터만 저장 가능 
	 *    
	 *    > 컬렉션 
	 *    - 크기에 제약이 없음 (크기 지정 안해도됨, 알아서 크기 변경)
	 *    - 중간 위치에 추가하거나 삭제하는 경우 복잡한 알고리즘을 직접 구현할 필요 없음 => 이미 메소드로 제공하고 있기때문에 단지 호출만하면됨
	 *    - 여러 타입의 데이터들을 저장 가능 
	 * 
	 * 3. 컬렉션의 종류 
	 *    > List계열
	 *    - 데이터(value)만 저장
	 *    - 순서 유지 (index의 개념 있음)
	 *    - 중복된 데이터 허용
	 *    
	 *    > Set계열
	 *    - 데이터(value)만 저장
	 *    - 순서 유지 x (index의 개념 없음)
	 *    - 중복된 데이터 허용x
	 *    
	 *    > Map계열
	 *    - 키값(key)과 데이터(value)를 함께 저장
	 *    - 순서 유지 x (index의 개념은 없지만 key값이 대신함)
	 *    - 키값이 중복될 수 없음 (단, value는 중복될 수 있음)
	 * 
	 */

	public static void main(String[] args) {
		A_ListController a = new A_ListController();
		//a.arrayListTest();
		//a.genericTest();
		//a.linkedListTest();
		
		B_SetController b = new B_SetController();
		//b.hashSetTest();
		//b.hashSetTest2();
		
		C_MapController c = new C_MapController();
		//c.hashMapTest(); // ctrl shift o -> import단축키
		//c.propertiesTest1();
		c.propertiesTest2();
		
	}

}
