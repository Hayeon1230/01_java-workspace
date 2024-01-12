package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductArrayTest {
	
	public static void main(String[] args) {
		// ProductTest클래스 안에 작성한 코드를 
		// 객체배열로 바꿔보기 
		// 즉, 3개의 Product객체를 Product[] 안에 담아서 활용
		Product[] arr = new Product[3];
		arr[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		arr[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		arr[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		// for loop문 방식으로 먼저 쫙 해보고
		
		//for(int i=0; i<arr.length; i++) {
		for(Product p : arr) {
			//System.out.println(arr[i].information());
			System.out.println(p.information());
		}
		
		
		
		
		System.out.println("==============================================================");
		
		//for(int i=0; i<arr.length; i++) {
		for(Product p : arr) {
			//arr[i].setPrice(1200000);
			//arr[i].setTax(0.05);
			p.setPrice(1200000);
			p.setTax(0.05);
		}
		
		//for(int i=0; i<arr.length; i++) {
		for(Product p : arr) {
			System.out.println(p.information());
		}
		System.out.println("==============================================================");
		
		//for(int i=0; i<arr.length; i++) {
		for(Product p : arr) {
			//System.out.println("상품명 = " + arr[i].getProductName());
			//System.out.println("부가세 포함 가격 = " + (int)(arr[i].getPrice() + arr[i].getPrice() * arr[i].getTax()) + "원");
			System.out.println("상품명 = " + p.getProductName());
			System.out.println("부가세 포함 가격 = " + (int)(p.getPrice() + p.getPrice() * p.getTax()) + "원");
		}
		
		// 다 했으면 for each문으로도 바꿔보기
		
	}

}
