package com.br.chap02_objectArray.run;

import java.util.Scanner;

import com.br.chap02_objectArray.controller.PhoneController;
import com.br.chap02_objectArray.model.vo.Phone;

public class ProgramRun { // ObjectArrayRun 내용을 프로그램화 시킴

	public static void main(String[] args) {
		
		// 현재 판매중인 핸드폰들 
		Phone[] phones = new Phone[4];
		
		phones[0] = new Phone("롤리팝", "엘지", 100000, null);
		phones[1] = new Phone("아이폰", "애플", 1700000, "15pro");
		phones[2] = new Phone("아이폰", "애플", 1200000, "12pro");
		phones[3] = new Phone("갤럭시", "삼성", 1400000, "s23");
		
		Scanner sc = new Scanner(System.in);
		PhoneController pc = new PhoneController();
		
		while(true){ // 무한반복
			
			System.out.println("\n====== 보람폰판매점 ======");
			System.out.println("1. 판매점 내의 전체 폰 정보 조회하기");
			System.out.println("2. 판매점 내의 핸드폰 평균가 조회하기");
			System.out.println("3. 구매하고자 하는 핸드폰의 가격 조회하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("\n메뉴입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				pc.selectAllPhone(phones);
			}else if(menu == 2) {
				//double avgPrice = pc.selectPhoneAvgPrice(phones);
				//System.out.println("평균가격 : " + avgPrice + "원");
				System.out.println("평균가격 : " + pc.selectPhoneAvgPrice(phones) + "원");
			}else if(menu == 3) {
				
				System.out.print("구매하고자 하는 핸드폰 : ");
				String str = sc.nextLine();
				
				int[] arr = pc.selectBuyPhonePrice(phones, str);
				// {0, 1000000, 2000000, 0} / {0, 0, 0, 0}
				int count = 0;
				for(int i=0; i<arr.length; i++) {
					if(arr[i] != 0) {
						System.out.println("구매하고자 하는 핸드폰의 가격은 " + arr[i] + "원입니다.");
						count++;
					}
				}
				// 만일 검색된 핸드폰이 없을 경우 => "구매하고자 하는 xxx 핸드폰은 판매하고 있지 않습니다." 출력
				if(count == 0) {
					System.out.println("구매하고자 하는 " + str + " 핸드폰은 판매하고 있지 않습니다.");
				}
				
			}else if(menu == 0) {
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");				
			}
		}
		
		
	}

}
