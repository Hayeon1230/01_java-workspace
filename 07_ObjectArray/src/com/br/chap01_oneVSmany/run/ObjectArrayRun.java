package com.br.chap01_oneVSmany.run;

import java.util.Scanner;

import com.br.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		Scanner sc = new Scanner(System.in);

		Book[] books = new Book[3];
		/*
		 * books[0] = new Book(); books[1] = new Book(); books[2] = new Book();
		 */

		for (int i = 0; i < books.length; i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			System.out.println("도서명 : ");
			String title = sc.nextLine();
			System.out.println("작가 : ");
			String author = sc.nextLine();
			System.out.println("가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			System.out.println("출판사 : ");
			String publisher = sc.nextLine();

			books[i] = new Book(title, author, price, publisher);
		}

		// 전체 도서 정보들 조회
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		for (int i = 0; i < books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
	}

}
