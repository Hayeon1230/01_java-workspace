package com.br.practice.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeAnswer {
	
	public void practice1() {
		
		// 1. 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		// 2. 1부터 10까지의 값을 반복문을 통해 순서대로 넣자
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;
		*/
		// 아!! i번째 인덱스에는 i+1 값을 넣어주면 되겠구나!
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1; 
		}
		
		// 3. 잘 들어갔는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		// 1. 길이가 10인 배열을 만들자
		int[] arr = new int[10];
		
		// 2. 10부터 1까지의 값을 반복문을 통해 순서대로 넣자
		/*
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 7;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 4;
		arr[7] = 3;
		arr[8] = 2;
		arr[9] = 1;
		*/
		// 아!! i번째 인덱스에는 arr.length-i 값을 넣어주면 되겠구나!
		
		// 0부터 배열의길이-1 까지 반복 --> 0번 인덱스부터 마지막 인덱스까지 반복
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		// 3. 잘 들어갔는지 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		// 1. 사용자에게 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		// 2. 배열을 할당할 껀데 사용자가 입력한 정수(size)만큼의 크기로 할당
		int[] arr = new int[size];
		
		// 3. 1부터 입력받은 값까지 배열에 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 4. 잘 들어갔는지 출력을 통해 확인
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		
		// 1. 길이가 5인 String 배열 선언
		String[] arr = new String[5];
		
		// 2. 각 인덱스별 값 초기화
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		// 위의 1번 2번 과정을 동시에 진행 할 수도 있다. 아래와 같이
		//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// 3. 배열 인덱스를 활용해서 귤 출력
		System.out.println(arr[1]);
		
	}
	
	public void practice5() {
		
		// 1. 사용자에게 문자열과 문자 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기
		// 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당 
		char[] arr = new char[str.length()];
		
		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 3. 검색할 문자가 문자열에 몇개가 들어있는지 파악
		int count = 0; 	// 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
						// 문자열에서 동일한 문자가 발생할 때마다 1씩 증가 시켜줄꺼임
		
		// 인덱스마다 접근하기 위해 반복문 사용
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우 
				count++;	// 그리고 count 1증가
			}
		}
		
		// 4. 검색된 문자 개수 출력
		System.out.println(ch + "개수 : " + count);// 개수 출력
		
	}
	
	public void practice6() {
		
		// 1. "월" ~ "일"까지 초기화된 문자열 배열 만들기
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 2. 사용자에게 0부터 6까지의 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 3. num값이 0 ~ 6 사이의 숫자인지 확인 --> 아닐 경우 "잘못 입력하셨습니다." 출력
		if(num >= 0 && num <= 6) {
			
			// 해당 요일 출력
			System.out.println(arr[num] + "요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	public void practice7() {
		
		// 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		// 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		// 3. 전체 값 나열 및 총 합 출력
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println("\n총 합 : " + sum);
		
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 1. 사용자에게 3이상의 홀수 입력받기
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			// 2. 조건문을 이용해서 잘 입력했는지 안했는지 판별 
			if(num >= 3 && num % 2 == 1) { // 잘 입력했을 경우
				
				// 3_1. 배열생성 (크기는 사용자가 입력한 수만큼)
				int[] arr = new int[num];
				
				// 3_2. 배열의 각 인덱스에 값 담기
				/*
				 * 5 입력시 => {1, 2, 3, 2, 1}				=> "2번" 인덱스까지 증가된값 그 이후부터 감소
				 * 7 입력시 => {1, 2, 3, 4, 3, 2, 1}		=> "3번" 인덱스까지 
				 * 9 입력시 => {1, 2, 3, 4, 5, 4, 3, 2, 1}=> "4번" 인덱스까지
				 * 
				 * 		0번 ~ 중간인덱스(배열의길이/2)까지 1씩 증가된 값담고 그 이후에는 감소
				 */
				int value = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = value;
					
					if(i < arr.length / 2) {
						value++;
					}else {
						value--;
					}
				}
				
				// 3_3. 배열의 각 인덱스에 담긴 값 출력
				for(int i=0; i<arr.length; i++) {
					/*
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.print(arr[i]);
					}
					*/
					System.out.print(arr[i]);
					if(i < arr.length-1) {
						System.out.print(", ");
					}
					
				}
				
				// 4. 반복문 빠져나가도록
				break;
				
			}else { // 잘못 입력했을 경우 
				System.out.println("다시 입력해주세요.");
			}
			
		}
		
	}
	
	public void practice9() {
		
		// 1. 치킨 메뉴들이 들어있는 String[] 선언, 할당, 동시에 초기화
		String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
		
		// 2. 사용자에게 치킨명 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		// 3. 사용자가 입력한 메뉴가 해당 배열에 존재하는지 판별
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
			}
		}
		
		// 4. 판별결과 출력 
		//    - 존재할경우 => "xxxx 치킨 배달 가능" 출력
		//    - 존재하지 않을 경우 => "xxx 치킨은 없는 메뉴입니다." 출력
		/*
		if(flag) {
			System.out.println(menu + " 치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
		*/
		System.out.println(menu + (flag ? "치킨 배달 가능" : "치킨은 없는 메뉴입니다."));
		
	}
	
	public void practice10() {
		
		// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		// 3. 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		
		// 1. 사용자에게 주민번호 입력받기 (문자열)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-포함) : ");
		String str = sc.nextLine(); // "생년월일6자리-7자리"
		
		// 2. char[] 배열에 옮겨 담기 
		//  2_1. 배열 생성 (배열 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];
		
		//  2_2. 배열에 대입 (단, 성별자리(7번인덱스) 이후부터는 '*' 대입)
		// "800812-1234567"
		for(int i=0; i<arr.length; i++) {
			if(i <= 7) {
				arr[i] = str.charAt(i);
			}else {
				arr[i] = '*';
			}
		}
		
		// 3. char[] 배열안의 값들을 이어서 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int initSize = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[initSize];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		// 위의 구문들은 초기 배열을 세팅하는 구문
		
		while(true) { // 반복적으로 더 입력할건지 물어 입력받는 반복문
			
			System.out.print("\n더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' || ch == 'N') {
				System.out.println(Arrays.toString(arr)); // 배열안의 모든값들을 출력시키는 구문
				break;
			}else if(ch == 'y' || ch == 'Y') {
				
				System.out.print("더 입력하고 싶은 갯수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				/* 1. for문 활용 --------------------------------------
				String[] newArr = new String[arr.length + addSize];
				for(int i=0; i<newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i+1 + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
				--------------------------------------------------- */
				
				
				/* 2. System.arraycopy() 활용 -------------------------
				String[] newArr = new String[arr.length + addSize];
				System.arraycopy(arr, 0, newArr, 0, arr.length);
				for(int i=arr.length; i<newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				arr = newArr;
				-----------------------------------------------------*/
				
				
				
				// 3. Arrays.copyOf() 활용 -----------------------------
				arr = Arrays.copyOf(arr, arr.length + addSize);
				for(int i=arr.length-addSize; i<arr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					arr[i] = sc.nextLine();
				}
				//-----------------------------------------------------
				
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
			
			
			
		}
	}
	
	

}
