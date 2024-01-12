package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] phones = new Phone[3]; 
		
		System.out.println(phones); // Phone[] 타입
		System.out.println(phones[0]); // Phone 타입
		
		//phones[0].setName("아이폰"); // NullPointerException == 객체생성을 하지 않고 접근했을때 
		
		// 각 인덱스 자리에 Phone객체를 생성 해야됨
		phones[0] = new Phone();
		phones[1] = new Phone("아이폰", "애플", 1700000, "15pro");
		phones[2] = new Phone("아이폰", "애플", 1200000, "12pro");
		
		phones[0].setName("롤리팝");
		phones[0].setBrand("엘지");
		phones[0].setPrice(100000);
		
		// 모든 핸드폰에 대한 정보를 조회할 수 기능 구현
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i]);
		}
		
		// 평균가를 알려주는 기능 구현
		double total = 0;
		for(int i=0; i<phones.length; i++) {
			total += phones[i].getPrice();
		}
		System.out.println("평균 핸드폰 가격은 : " + total / phones.length + "원 입니다.");
		
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		// 해당 핸드폰을 검색한 후에 그 가격을 알려주도록
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하고자 하는 핸드폰명 : ");
		String buy = sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if((phones[i].getName()+phones[i].getSeries()).contains(buy)) {
				// 해당 그 객체의 가격을 출력
				System.out.println("당신이 구매하고자 하는 핸드폰의 가격은 " + phones[i].getPrice() + "원 입니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
