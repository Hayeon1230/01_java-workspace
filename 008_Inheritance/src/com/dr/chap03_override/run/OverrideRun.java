package com.dr.chap03_override.run;

import com.dr.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 200);
		
		System.out.println(bk1/*.toString()*/);
		System.out.println(bk2.toString());
		
		/*
		 * 레퍼런스(참조변수)를 출력할때
		 * JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출 시켜서 반환된 값을 출력
		 */
		/*
		 * 오버라이딩 전 : Object클래스 toString() 메소드 => "풀클래스명 + @ + 주소값의16진수값"
		 * 오버라이딩 후 : Book클래스 toString() 메소드 => 해당 객체가 가지고 잇는 모든 필드값을 한 문자열로 합쳐 반환
		 * 
		 */
		
		Book bk3 = new Book("수학의 정석", "나수학", 100);// bk1객체와 내용물(필드값) 동일함
		/*
		 * bk1이랑 bk3 각 필드값 모두 일치
		 * 두 객체간에 모든 필드값들이 다 일치하면 동일객체로 판별됐으면 좋겠음
		 */
		System.out.println("bk1,bk3 같은책?"+ (bk1 == bk3));
		
		// 레퍼런스간에 비교할때는 equals메소드로 비교
		System.out.println("bk1,bk3 같은책?" + bk1.equals(bk3));
		
		// 오버라이딩 전 => Object클래스의 equals() : 두 주소값을 비교해서 반환
		// 오버라이딩 후 => Book클래스의 equals() : 필드값들을 다 비교해서 다 일치하면 true반환 / 그게 아니면false반환
		System.out.println("" + bk1.equals(bk3));
		
		// 동일 객체로 판별되려면 : equals()메소드 수행시 true여야만 하고 뿐만아니라 hashCode()값이 일치해야만
		System.out.println("bk1의 해쉬코드값 : " + bk1.hashCode());
		System.out.println("bk3의 해쉬코드값 : " + bk3.hashCode());
		
		// Object클래스의 hashCode() : 주소값 가지고 10진수 값 만들어 변환
		// Book클래스의 hashCode() : 실제 필드값 가지고 숫자 만들어 반환
		System.out.println("bk2의 해쉬코드값 : " + bk2.hashCode());
	}

}
