package com.br.chap02_abstract.run;

import com.br.chap02_abstract.model.vo.BasketBall;
import com.br.chap02_abstract.model.vo.FootBall;
import com.br.chap02_abstract.model.vo.Sports;

public class AbstractRun {

	public static void main(String[] args) {
		
		//Sports s = new Sports();
		//Sports s; // 객체 생성만 안되고 레퍼런스로는 사용 가능 
		
		Sports s = new BasketBall(); // 다형성 적용시켜서 부모타입으로 자식객체 활용
	
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		for(Sports a : arr) {
			a.rule();
		}
		
		/*
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부({})가 구현되어 있지 않은 메소드 
		 * - 자식클래스에서 해당 메소드를 오버라이딩 하여 완성시켜야됨 
		 * 
		 * * 추상클래스
		 * - 미완성된 클래스
		 * - 객체 생성 불가 (단, 레퍼런스 변수로는 선언 가능)
		 * - 일반필드 + 일반메소드 [+ 추상메소드]
		 *   => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		 *   
		 * * 추상메소드 굳이 없어도 추상클래스로 만들 순 있음! 
		 * - 개념적 : 단지 이 클래스가 미완성된 클래스다 라는 의미를 부여할 목적
		 * - 프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때 
		 * 
		 * * 추상메소드를 포함한채로 추상클래스를 작성하는 이유 
		 * - 부모클래스에 추상메소드가 존재할 경우 
		 *   자식클래스에서는 강제로 오버라이딩 할 수 밖에 없음 
		 *   => 각 자식 클래스마다 동일한 패턴의 메소드를 가지게 됨
		 *   => 메소드 통일성 확보 (표준화된 틀을 제공)
		 * 
		 */
	
	}

}
