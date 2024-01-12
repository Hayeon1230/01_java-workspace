package com.br.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	
	public void method1() {
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		int[] copy = origin; // 복사 진행 (단순 대입방법)
		// 얕은복사 (주소값만을 복사 => 결국 같은곳을 참조)
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\n");
		
		
		copy[2] = 99;
		System.out.println("--복사본 배열값 수정 후--");
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("origin주소값 : " + origin.hashCode());
		System.out.println("copy주소값 : " + copy.hashCode());
		
		
	}
	
	// * 깊은복사
	public void method2() {
		// 1. for문을 활용한 방법 
		//    새로운 배열을 "생성"한 후
		//    반복문을 돌려가면서 원본배열의 각 인덱스의 값들을 새로이 만든 배열의 각 인덱스에 대입
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[7]; // {0,0,0,0,0,0,0}
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}// {1,2,3,4,5,0,0}
		
		copy[2] = 99; // {1,2,99,4,5,0,0}
		System.out.println("==원본배열==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println("\n==복사본배열==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}
	
	public void method3() {
		// 2. 새로운 배열 생성한 후 java.lang.System클래스의 arraycopy메소드를 이용한 복사
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10]; // {0이 10개}
		
		// System.arraycopy(원본배열명, 복사시작할인덱스, 복사본배열명, 복사본배열의 복사될 시작인덱스, 복사할갯수);
		System.arraycopy(origin, 2, copy, 4, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		// 주소값이 다름 == 서로 다른 배열을 참조하고 있음
		// == 배열 수정시 서로에게 영향을 주지 않음 
		
	}
	
	public void method4() {
		// 3. java.util.Arrays클래스의 copyOf() 메소드 사용
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할길이);
		int[] copy = Arrays.copyOf(origin, 10);
		/*
		 * * Arrays.copyOf 메소드 호출시 
		 * 1. 내가 전달한 길이만큼의 새로운 배열 생성됨 
		 * 2. System.arraycopy() 메소드가 실행되면서 복사가 진행
		 *    이때 내가 전달한 길이가 원본배열의 크기보다 클 경우 => 원본배열의 전체값이 다 복사
		 *    내가 전달한 길이가 원본배열의 크기보다 작을 경우 => 내가 전달한 길이만큼(즉, 갯수만큼)만 복사
		 * 
		 */
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n\norigin주소값 : " + origin.hashCode());
		System.out.println("copy주소값 : " + copy.hashCode());
	}
	
	public void method5() {
		// 4. clone() 메소드 활용
		//    인덱스 지정 x, 크기 지정 또는 복사할 갯수 지정 x
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
	}
	
	public void method6() {
		
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("추가하고자 하는 값의 갯수 : ");
		int addSize = sc.nextInt();
		
		// 복사 진행 전 기존의 배열의 길이 => 특정 변수에 기록
		int length = arr.length; // 3
		
		
		
		// 기존의 배열의 크기 + addSize 만큼의 새로운 배열 생성
		// 후 기존에 담겨있던 3개의 값이 복사
		arr = Arrays.copyOf(arr, arr.length + addSize);
		// 추가값갯수로 2 입력 가정하에 => {1,2,3,0,0}
		// arr.length ==>  기존의배열의길이+추가값갯수
		
		for(int i=length; i<arr.length; i++) {
			System.out.print("추가하고자 하는 값 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	

}
