package com.br.chap03_class.model.vo;

public class Person {
	
	// 필드(==멤버변수)
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// setter메소드 (각 필드에 값을 대입(초기화,수정)시키기위한 용도)
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email; 
	}
	
	//getter메소드 7개
	//전달되는게 없을것이기 때문에 매개변수 비워놔도 된다는 특징
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	// 모든 필드에 담겨있는 값들을 하나로 합쳐서 반환시켜주는 역할
	public String information() {
		//java에서는 getter에서 return 한개씩 밖에 못씀 return여기서 여러번 x
		return id + ", " + pwd + ", " + name + ", " + 
				age + ", " + gender + ", " 
				+ phone + ", " + email;  
	}
	
	
}
