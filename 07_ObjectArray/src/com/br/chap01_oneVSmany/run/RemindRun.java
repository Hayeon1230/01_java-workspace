package com.br.chap01_oneVSmany.run;

import com.br.chap01_oneVSmany.model.vo.Book;

public class RemindRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		bk1.setTitle("자바의정석");
		bk1.setAuthor("강개똥");
		// price, publisher 필드에는 JVM의 초기값(0, null)이 담겨있을 것
		
		Book bk2 = new Book("혼공자", "신용권", 30000, "한빛미디어");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println("=========================");
		
		int[] arr = new int[3];
		// arr    == type : int[]
		// arr[0] == type : int
		// arr[1] == type : int
		// arr[2] == type : int
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		
		Book[] books = new Book[3];
		// books   == type : Book[]
		// books[0]== type : Book
		// books[1]== type : Book
		// books[2]== type : Book
		books[0] = new Book();
		books[0].setTitle("파이썬");
		books[0].setAuthor("홍길동");
		
		books[1] = bk2; // 주소값을 대입 (bk2가 0X123였다면 books[1]도 0X123 동일한 주소)
		
		books[2] = new Book("도커", "이말순", 40000, "길벗");
		
		System.out.println(books); // Book[] 타입
		System.out.println(books[0]); // Book 타입
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());			
		}
		
		System.out.println("=======================");
		
		books[1].setPrice(15000);
		System.out.println(books[1].information());
		
		System.out.println(bk2.information());

	}

}
