package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		System.out.print("배열 크기 : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] arr = { "사과", "귤", "복숭아", "참외" };
		System.out.println(arr[1]);
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];

		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			if (ch == arr[i]) {
				sum += 1;
			}
		}
		System.out.println(ch + "개수 : " + sum);
	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };
		if (num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(arr[num] + "요일");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0보다 큰 정수 : ");
		int num = sc.nextInt();

		int arr[] = new int[num];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println("총합 : " + sum);

	}

	public void practice8() {
		// 1. 사용자에게 3이상의 홀수 입력받기
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			// 2. 조건문을 이용해서 잘 입력했는지 판별
			if (num >= 3 && num % 2 == 1) { // 잘 입력했을 경우

				// 3_1. 배열 생성(크기는 사용자가 입력한 수만큼)
				int[] arr = new int[num];
				// 3_2. 배열의 각 인덱스에 값 담기
				int value = 1;
				for (int i = 0; i < arr.length; i++) {
					arr[i] = value;
					if (i < num / 2) {
						// 3 => 0 1 2

						value++;
					} else {

						value--;
					}

				}

				for (int i = 0; i < num; i++) {
					System.out.print(arr[i]);
					if (i < arr.length - 1) {
						System.out.print(", ");
					}

				}
				// 3_3. 배열의 각 인덱스에 담긴 값 출력

				// 4. 반복문 빠져나가도록
				break;
			} else { // 잘못 입력했을 경우
				System.out.println("다시 입력해주세요.");

			}
		}
	}

	public void practice9() {
		// 1. 치킨 메뉴들이 들어있는 String[] 선언, 할당, 동시에 초기화
		String[] chickens = {"후라이드", "양념", "파닭", "치즈"};
		
		// 2. 사용자에게 치킨명 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름 입력 : ");
		String menu = sc.nextLine();
		
		// 3. 사용자가 입력한 메뉴가 해당 배열에 존재하는지 판별
		//int sum = 0;
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(chickens[i].equals(menu)) {
				//sum += 1;
				flag = true;
			}
		}// 결과 출력이 for문 안에 있으면 안됨(경우의 수마다 다 출력됨)
		
		// 4. 판별결과 출력
		//		- 존재할경우 => "xxxx 치킨 배달 가능" 출력
		// 		- 존재하지 않을 경우 => "xxx 치킨은 없는 메뉴입니다." 출력
		/*if(sum == 1flag) {
			System.out.println(menu + "치킨 배달 가능");	
		}
		else {
			System.out.println(menu + "치킨은 없는 메뉴입니다");
		}*/
		System.out.println(menu + (flag ? "치킨 배달 가능" : "치킨은 없는 메뉴입니다."));
		//삼항연산자 사용하면 간단한 if else 한 줄로 줄일 수 있음
		
	}

	public void practice10() {

	}

	public void practice11() {
		// 1. 사용자에게 주민번호 입력받기 (문자열)
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-포함) : ");
		String str = sc.nextLine(); // "생년월일6자리-7자리"
		
		// 2. char[] 배열에 옮겨 담기
		// 2_1. 배열 생성 (배열 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];
		// 2_2. 배열에 대입 (단, 성별자리(7번인덱스) 이후부터는 '*' 대입)
		// "800812-1234567"
		for(int i=0; i<str.length(); i++) {
			if(i <= 7) {
				arr[i] = str.charAt(i);
			}else {
				arr[i] = '*';
			}
			
		}
		// 
		for(int i=0; i<str.length(); i++) {
			System.out.print(arr[i]);
		}
	}

	public void practice12() {

	}

}
