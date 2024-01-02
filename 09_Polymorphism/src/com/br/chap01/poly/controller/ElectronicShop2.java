package com.br.chap01.poly.controller;

import com.br.chap01.poly.model.vo.Electronic;

// 다형성 적용했을 때의 코드
public class ElectronicShop2 { // 가게
	
	// 부모타입 배열로 모든 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	
}
