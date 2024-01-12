package com.br.chap03_interface.run;

import com.br.chap03_interface.model.vo.Baby;
import com.br.chap03_interface.model.vo.Basic;
import com.br.chap03_interface.model.vo.Mother;

public class InterRun {

	public static void main(String[] args) {
		
		/*
		 * Person(부모) - name:String, weight:double, health:int
		 * Mother(자식) - babyBirth:String  
		 * Baby(자식) - 필드x
		 * 
		 */
		
		//Person p = new Person();
		//Basic b = new Basic(); // 객체생성 불가
		//Basic b; // 레퍼런스로는 사용가능
		
		// 다형성 적용해서 사용
		Basic mom = new Mother("김엄마", 50, 70, "출산");
		Basic baby = new Baby("강아기", 4.5, 80);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		mom.sleep();
		
		baby.eat();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		
	}

}
