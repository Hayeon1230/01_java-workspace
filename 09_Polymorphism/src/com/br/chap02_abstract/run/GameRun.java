package com.br.chap02_abstract.run;

import java.util.Scanner;

import com.br.chap02_abstract.model.vo.Archor;
import com.br.chap02_abstract.model.vo.Assassin;
import com.br.chap02_abstract.model.vo.GameCharacter;
import com.br.chap02_abstract.model.vo.Warrior;
import com.br.chap02_abstract.model.vo.Wizard;

public class GameRun {

	public static void main(String[] args) {
		
		/*
		GameCharacter[] arr = new GameCharacter[2];
		arr[0] = new Warrior("전사", 100, 1, 0, "나무칼", new String[]{"빨간약", "부활돌"});
		arr[1] = new Wizard("마법사", 80, 70, 60, 40);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].attack();
			arr[i].defence();
		}
		
		for(GameCharacter g : arr) {
			System.out.println(g);
		}
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 캐릭터 선택 ===");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁수");
		System.out.println("4. 어쌔신");
		System.out.print("번호 > ");
		int chNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		String gcName = sc.nextLine();
		System.out.print("체력 : ");
		int gcHp = sc.nextInt();
		System.out.print("레벨 : ");
		int gcLevel = sc.nextInt();
		System.out.print("경험치 : ");
		int gcExp = sc.nextInt();
		sc.nextLine();
		
		GameCharacter gc = null;
		
		if(chNum == 1) {
			System.out.print("무기명 : ");
			String weapon = sc.nextLine();
			System.out.print("아이템1 : ");
			String item1 = sc.nextLine();
			System.out.print("아이템2 : ");
			String item2 = sc.nextLine();
			
			gc = new Warrior(gcName, gcHp, gcLevel, gcExp, weapon, new String[] {item1, item2});
		}else if(chNum == 2) {
			System.out.print("마력 : ");
			gc = new Wizard(gcName, gcHp, gcLevel, gcExp, sc.nextInt());
		}else if(chNum == 3) {
			System.out.print("사격거리(m) : ");
			int distance = sc.nextInt();
			System.out.print("활 갯수 : ");
			int count = sc.nextInt();
			
			gc = new Archor(gcName, gcHp, gcLevel, gcExp, distance, count);
		}else if(chNum == 4) {
			gc = new Assassin(gcName, gcHp, gcLevel, gcExp);
		}else {
			System.out.println("잘못입력하였으므로 프로그램을 종료합니다."); 
			return;
		}
		
		while(true) {
			System.out.println("\n== 게임진행 ==");
			System.out.println("1. 정보보기");
			System.out.println("2. 공격하기");
			System.out.println("3. 방어하기");
			System.out.println("0. 게임종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: System.out.println(gc); break;
			case 2: gc.attack(); break;
			case 3: gc.defence(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("메뉴를 잘못 입력하셨습니다. 다시입력해주세요.");
			}
			
		}
		
		
		
	}

}
