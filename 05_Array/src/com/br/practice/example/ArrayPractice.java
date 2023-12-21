package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		System.out.print("배열 크기 : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = {"사과", "귤", "복숭아", "참외"};
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			
			if(ch == arr[i]) {
				sum += 1;
			}
		}
		System.out.println(ch + "개수 : " + sum);
	}
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] arr = {"월","화","수","목","금","토","일"};
		if(num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(arr[num] + "요일");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0보다 큰 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println("총합 : " + sum);
		
	}
	public void practice8() {
		
	}
	public void practice9() {
		
	}
	public void practice10() {
	
	}
	public void practice11() {
	
	}
	public void practice12() {
		
	}

	
}

