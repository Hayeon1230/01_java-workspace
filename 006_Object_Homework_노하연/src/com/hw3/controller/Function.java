package com.hw3.controller;

import java.util.Scanner;

public class Function {

	public void printLottoNumbers() {
		// 1~45 임의의 정수 6개 출력
		for (int i = 1; i <= 6; i++) {
			System.out.print((int) (Math.random() * 45 + 1) + " ");
		}System.out.println();
	}

	public void outputChar(int num, char c) {
		// 전달받은 문자를 전달받은 숫자만큼 출력
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
	}

	public char alphabette() {
		// 임의의 알파벳을 하나 리턴
		return(char)(Math.random() * 26 + 65);

	}

	public String mySubstring(String str, int index1, int index2) {
		// 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열 리턴
		/*Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		str = sc.nextLine();
		System.out.print("인덱스 시작: ");
		index1 = sc.nextInt();
		System.out.print("인덱스 끝 : ");
		index2 = sc.nextInt();*/
		
		String result = "";
		for(int i=index1; i<index2; i++) {
			result += str.charAt(i) + " ";
		}
		
		return str + "의 2번 4번 인덱스 사이 값 : " + result;
		
		
	}
}
