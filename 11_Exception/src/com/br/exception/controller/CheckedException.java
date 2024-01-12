package com.br.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	/*
	 * * CheckedException 
	 * - 반드시 예외처리 구문을 작성해놔야 되는 예외들 (컴파일에러)
	 * - 조건문 미리 제시해둘 수 없음 (왜? 예측이 불가하기 때문에)
	 *   보통, 외부 매개체(파일, db, 또다른프로그램, 키보드)와 입출력 할때 발생됨 
	 * 
	 */
	public void method() throws IOException {
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체 (단, 문자열로만 읽어들일 수 있음)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력 : ");
		/*
		 * 1. try~catch문 
		 *    try { } : 예외가 발생될 구문을 작성
		 *    catch(발생될수있는예외클래스 매개변수){ } : try구문내에 다음과 같은 예외 발생시 실행시킬 구문 작성 
		 */
		/*
		try {
			String str = br.readLine();
			System.out.println(str + "의 글자수는 : " + str.length() + "입니다.");
			
		}catch(IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		*/
		
		
		// 2. throws : 발생된 예외에 대해서 여기서 처리하지 않고 떠넘기겠다 (위임하겠다)
		//             해당 이 메소드를 호출한 곳으로 떠넘김 => 그곳에서 try-catch문으로 예외처리구문으로 쓰거나 거기서 마저도 throws로 떠넘기기
		String str = br.readLine();
		System.out.println(str + "의 길이 : " + str.length());
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	/*
	 *    			    예외클래스		     에러발생시점		예외처리
	 * UnCheckedEx RuntimeException후손    런타임에러			 세모 (개발자 케바케)
	 *   CheckedEx RuntimeException외	컴파일에러(빨간줄)	 필수 (예외처리구문 반드시 기술)
	 * 
	 */

}
