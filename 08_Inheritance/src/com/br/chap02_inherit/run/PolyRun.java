package com.br.chap02_inherit.run;

import com.br.chap02_inherit.model.vo.Airplane;
import com.br.chap02_inherit.model.vo.Car;
import com.br.chap02_inherit.model.vo.Ship;
import com.br.chap02_inherit.model.vo.Vehicle;

public class PolyRun {

	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[3];
		arr[0] = new Car("벤틀리", 9.3, "세단", 4);
		arr[1] = new Ship("낚시배", 3, "어선", 1);
		arr[2] = new Airplane("비행기", 0.1, "제트기", 8, 4);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		arr[1].setName("화물선");
		arr[1].setKind("선박");
		((Ship)arr[1]).setPropeller(4);
		
		System.out.println(arr[1].information());
		
	}

}
