package com.br.chap02_abstract.run;

import com.br.chap02_abstract.model.vo.*;
import com.br.chap03_interface.model.vo.Animal;

public class AnimalRun {
	
	public static void main(String[] args) {
		Animal[] arr = new Animal[3];
		arr[0] = new Dolphin("돌핀", "남방큰돌고래");
		arr[1] = new Dog("뽀삐", "말티즈");
		arr[2] = new Eagle("멋쟁이", "대머리독수리");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].bark());
			
			if(arr[i] instanceof Swimable) {
				((Swimable)arr[i]).swim();
				((Swimable)arr[i]).dive();
			}
			if (arr[i] instanceof Moveable) {
				((Moveable)arr[i]).forward();
				((Moveable)arr[i]).back();
				((Moveable)arr[i]).jump();
				
			}
			
			if(arr[i] instanceof Flyable) {
				((Flyable)arr[i]).fly();
			}
			System.out.println();
			
			/*
			 * * 클래스에서 클래스를 상속받을때 : 클래스 extends 클래스 (단일상속만 가능) : 화살표 "실선"
			 * * 클래스에서 인터페이스를 구현할떄 : 클래스 implements 인터페이스, 인터페이스, ...(다중상속 가능) : 화살표 "점선"
			 * * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스, 인터페이스, ..(다중상속 가능) : 화살표 "실선"
			 * 			
			 * 			|		추상 클래스		| 인터페이스
			 *=========================================
					 필드	|일반필드 가질 수 있음 		| only 상수필드만(public static
				----------------------------------------------------
				일반메소드여부| 		O			| 		X
				------------------------------------------------------------------
				추상메소드 	| 추상메소드 0개 이상      | 모든 메소드가 추상메소드
				표현법 /갯수| 명시적으로 sbstract기술|public abstract 생략가능
				---------------------------------------------------
				  키워드   | extends			|  implement
				-------------------------------------------
				상속갯수	| 단일상속				|다중상속
			 * 
			 * extends 일반클래스 --> extends 추상클래스 -->implement 인터페이스
			 * ----------------------------------------------------->
			 * 				강제성이 더 짙어짐(규약이 더 쎄짐)
			 * 
			 * 
			 * 
			 */
			
		}
				
	}
}
