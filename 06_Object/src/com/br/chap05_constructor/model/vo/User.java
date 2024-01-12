package com.br.chap05_constructor.model.vo;

public class User {
	
	// 필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;

	// 생성자부
	/*
	 * 접근제한자 클래스명([매개변수, 매개변수, ...]) {
	 * 
	 * }
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체 생성이 가능하기 위함
	 * 2. 객체 생성과 동시에 각 필드에 대입시킬 값을 전달받아서 초기화할 목적
	 * 
	 * * 생성자 작성시 주의사항 
	 * 1. 생성자명은 반드시 클래스명과 동일해야됨 (대소문자 구분)
	 * 2. 반환형은 존재하지 않음 (만일 반환형을 쓰게 되면 메소드로 인식되버림)
	 * 3. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않음 
	 *    => 항상 기본생성자를 작성하는 습관 들이자!!
	 * 
	 */
	public User() {
		// 기본생성자(매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 기술
		// 기본생성자를 생략했을 경우 => JVM이 자동으로 만들어줬기 때문에 객체 생성가능했음
		//System.out.println("이거 실행되나?");
	}
	
	// 매개변수 3개짜리 생성자
	// 객체 생성과 동시에 전달값들을 받아서 해당 각 필드에 초기화 시켜주는 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// 나머지 필드부분은 JVM의 초기값으로 세팅되어있음
	}
	
	public User(int age, String userId, String userPwd, String userName, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		// 초기화하는 내용이 중복되는 생성자가 존재할 경우 => this() 이용해서 호출가능
		this(userId, userPwd, userName); // 반드시 첫줄에 기술해야됨
		
		this.age = age;
		this.gender = gender;
		
	}
	
	
	
	// 메소드부 (getter, setter메소드 작성, information메소드)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "아이디 : " + userId + ", 비번 : " + userPwd 
			 + ", 이름 : " + userName + ", 나이 : " + age + ", 성별 : " + gender; 
	}
	
	

}
