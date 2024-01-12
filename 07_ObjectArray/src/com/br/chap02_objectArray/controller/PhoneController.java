package com.br.chap02_objectArray.controller;

import com.br.chap02_objectArray.model.vo.Phone;

// 사용자의 요청을 받아서 처리해주는 용도의 클래스 == controller패키지
public class PhoneController {

	// 핸드폰들 전체 조회하는 기능
	public void selectAllPhone(Phone[] phones) {
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i]/*.toString()*/);
		}
	}
	
	// 핸드폰들의 평균가를 구해주는 기능
	public double selectPhoneAvgPrice(Phone[] phones) {
		double total = 0;
		for(int i=0; i<phones.length; i++) {
			total += phones[i].getPrice();
		}
		return total / phones.length;
	}
	
	// 구매하고자 하는 핸드폰명 또는 시리즈를 입력해서 해당 가격을 구해주는 기능
	public int[] selectBuyPhonePrice(Phone[] phones, String keyword) {
		int[] prices = new int[phones.length]; // {0, 0, 0, 0}
		
		for(int i=0; i<phones.length; i++) {
			if((phones[i].getName()+phones[i].getSeries()).contains(keyword)) {
				// phones[i].getPrice()
				prices[i] = phones[i].getPrice();
			}
		}
		// 만일 1번, 2번인덱스의 Phone객체가 찾아졌다면 
		// prices == {0, 1000000, 1500000, 0}
		// 만일 단 한개도 일치하는걸 못찾았을 경우 
		// prices == {0, 0, 0, 0}
		
		// 즉, prices배열 안의 모든 값이 0일 경우 => 일치하는 걸 못찾았음
		
		return prices; // 가격 값들이 담겨있는 배열 반환 
				
	}
	
	
}
