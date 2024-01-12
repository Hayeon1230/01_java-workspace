package com.br.chap01_poly.controller;

import com.br.chap01_poly.model.vo.Desktop;
import com.br.chap01_poly.model.vo.NoteBook;
import com.br.chap01_poly.model.vo.Tablet;

// 다형성 적용 안했을 경우 
public class ElectronicShop1 {
	// 전자제품판매 가게 
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~~);
		desk = d;
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 조회용 메소드
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	
	
	
}
