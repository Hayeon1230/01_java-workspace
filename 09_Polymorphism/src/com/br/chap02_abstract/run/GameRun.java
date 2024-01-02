package com.br.chap02_abstract.run;

import com.br.chap02_abstract.model.vo.GameCharacter;
import com.br.chap02_abstract.model.vo.Warrior;
import com.br.chap02_abstract.model.vo.Wizard;

public class GameRun {

	public static void main(String[] args) {
		
		GameCharacter[] arr =  new GameCharacter[2];
		arr[0] = new Warrior("전사", 100, 1, 0, "나무칼", new String[]{"빨간약", "부활돌"});
		arr[1] = new Wizard("마법사", 80, 70, 60, 40);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//arr[i].attack();
			//arr[i].defence();
		}
		for(GameCharacter g : arr) {
			System.out.println(g);
		}
	}

}
