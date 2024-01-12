package com.br.chap02_inherit.run;

import com.br.chap02_inherit.model.vo.Airplane;
import com.br.chap02_inherit.model.vo.Car;
import com.br.chap02_inherit.model.vo.Ship;

public class InheritRun {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 9.3, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("비행기", 0.1, "제트기", 8, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		s.setName("화물선");
		s.setKind("선박");
		s.setPropeller(4);
		
		System.out.println(s.information());
		
		System.out.println(c.hashCode()); // Object클래스의 hashCode() 실행됨 (주소값의 10진수값을 반환시켜주는)
		System.out.println(a.equals(c)); // Object클래스의 equals()
		
		System.out.println(s/*.toString()*/);
		System.out.println(s.toString()); // Object클래스의 toString()
		
		
		
	}

}
