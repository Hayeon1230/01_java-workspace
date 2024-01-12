package com.hw1.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.hw1.model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ 	// 초기화블럭
		list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4-1, 15), 20000);
		list[1] = new Book("여러분들 성공할꺼에요", "보람쌤", "BR", new GregorianCalendar(2019, 6-1, 15), 30000);
		list[2] = new Book("API의 모든것", "강보람", "BR", new GregorianCalendar(2017, 2-1, 13), 15000);
		list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8-1, 30), 10000);
	}
	
	
	public BookController() {}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		
		// list        			 	   == Book[]
		// list[인덱스] 			       == Book
		// list[인덱스].getTitle()		   == String
		// list[인덱스].getPublishDate() == Calendar
		
		// [도서객체, 도서객체, 도서객체, 도서객체, null]
		
		// 1. for loop문 
		/*
		for(int i=0; i<list.length; i++) {
			if(list[i] != null) {
				System.out.println(list[i]);				
			}
		}
		*/
		
		// 2. for each문 (향상된 for문)
		for(Book bk : list) { // 변수 = list[0] => list[1] ... => list[마지막인덱스]
			if(bk != null) {
				System.out.println(bk);
			}
		}
		
	}
	
	
	
	// 2. 도서 추가 기능 메소드																"2023-12-01"      "10000"
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업  (int price라는 변수에 담으시오)
		
		// 코드 작성
		int price = Integer.parseInt(newPrice); // "10000" -> 10000	
		
		// --------------------------------------------------------
		// 2. 매개변수로 전달받은 newDate값   ==>        String --> Calendar로 변환 작업    (Calendar publishDate에 담으시오)
		//	  '-'를 구분자로 StringTokenizer 또는 split메소드를 이용하여 문자열 분리 후 각각 년,월,일 을 Calendar에 적용
	
		// newDate == "2023-12-01" 
		//  분리 => "2023", "12", "01"
		//  파싱 =>  2023 ,  12 ,   1
		// Calendar 생성 
		String[] arr = newDate.split("-"); // ["2023", "12", "01"]
		int year = Integer.parseInt(arr[0]); // "2023" -> 2023
		int month = Integer.parseInt(arr[1]);// "12"   -> 12
		int date = Integer.parseInt(arr[2]); // "01"   -> 1
		
		Calendar publishDate = new GregorianCalendar(year, month-1, date);
				
		// ------------------------------------------------------
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
		//	  Book클래스의 매개변수 생성자를 통해 생성
		Book bk = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		list[4] = bk;
	
	}
	
	
	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		// SimpleDateFormat 이용해서
		
		// 코드 작성
		// list[4]       			=> Book객체
		// list[4].getPublishDate() => 출간일 필드 (Calendar객체)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		System.out.println(sdf.format(list[4].getPublishDate().getTimeInMillis()));
	}
	
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력  
		
		// 코드 작성
		for(int i=0; i<list.length; i++) {
			if(list[i] != null && list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
			}
		}
		
		
	}
	
	
	

}
