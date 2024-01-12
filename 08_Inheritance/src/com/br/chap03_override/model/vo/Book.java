package com.br.chap03_override.model.vo;

public class Book /*extends Object*/ {
	
	private String title;
	private String author;
	private int price;
	
	// 기본생성자
	public Book() {}	
	
	// 매개변수생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// getter/setter메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/*
	 * * 오버라이딩
	 * - 자식클래스에서 상속받고 있는 부모클래스의 메소드를 재정의 하는 것 
	 *   자식객체가 해당 메소드 호출시 자식메소드가 우선권을 가짐 
	 * 
	 * * 오버라이딩 성립 조건 
	 * - 부모메소드명과 동일하게 이름 짓기
	 * - 매개변수 갯수, 자료형, 순서 동일 (매개변수명은 상관없음)
	 * - 반환형은 부모메소드의 반환형과 동일 (버전업이 되면서 부모메소드 반환형의 자식자료형까지 괜찮음)
	 * - 부모메소드의 접근제한자보다 범위가 같거나 커야됨
	 *   ex) 부모메소드의 접근제한자가 protected일 경우 자식메소드의 접근제한자로 protected, public도 가능
	 *   
	 * * @Override 어노테이션
	 * - 생략가능함 (명시하지 않아도 성립조건에 만족하면 오버라이딩 된 상태)
	 * - 단, 작성하는걸 권장
	 *   >> 다른 개발자에게 오버라이딩한 메소드라는걸 알리고자 할 목적 
	 *   >> 부모메소드명이나 매개변수 같은게 수정됐을 경우 => 자식클래스에서 오류발생 시켜줌 => 개발자에게 수정해야됨을 알려줌
	 *      반대로 자식메소드 기술시 오타가 있을 경우 => 오류발생 시켜줌 => 수정해야됨을 알려줌
	 */
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", price=" + price;
	}
	
	@Override
	public boolean equals(Object a) {   // Object a = bk3;
		// 두 객체간의 각 필드값들을 일일히 비교 
		
		//        bk1.equals(bk3);
		
		//       bk1			bk3
		//    this(현객체)  vs 	 a(전달받은 비교할 대상객체)
		//      Book           Object 
		
		Book other = (Book)a;
		//     this       vs     other
		
		if(title.equals(other.title) && author.equals(other.author) && price == other.price) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		// 실제 필드값이 다 일치할 경우 동일한 숫자 반환
		return (title+author+price).hashCode();
	}
	
	
	
	

}
