package com.br.chap01_oneVSmany.model.vo;

public class Book {

	// 도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 기본생성자
	public Book() {
		
	}
	// 매개변수생성자 (모든 필드값 대입가능한)
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	// getter/setter메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	// intformation 메소드
	public String information() {
		return title + " " + author + " " + price + " " + publisher;
	}
	
}
