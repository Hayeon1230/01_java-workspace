package com.br.chap01.poly.controller;

import com.br.chap01.poly.model.vo.*;

public class ElectronicShop1 {
	// 전자제품판매 가게
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 추가용 메소드
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~~);
		desk = d;
	}
	public void insert(NoteBook n) { // Desktop d = new Desktop(~~~~);
		note = n;
	}
	public void insert(Tablet t) { // Desktop d = new Desktop(~~~~);
		tab = t;
	}
	
	// 조회용 메소드
	public Desktop selectDektop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
}
