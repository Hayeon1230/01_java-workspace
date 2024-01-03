package com.br.chap03_interface.run;

import com.br.chap03_interface.model.vo.Baby;
import com.br.chap03_interface.model.vo.Basic;
import com.br.chap03_interface.model.vo.Mother;
import com.br.chap03_interface.model.vo.Person;

public class InterRun {

	public static void main(String[] args) {
		
		//Person p = new Person();
		//Basic b = new Basic(); // 객체생성 불가
		//Basic b; // 레퍼런스로는 사용가능
		
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
