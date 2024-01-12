package com.br.hard;

import java.util.Scanner;

public class CompExample {
	
	public void method1() {
		
		/*
		 * 추가문제1.
		 * 사용자에게 한 개의 정수를 입력받고
		 * 1부터 입력 받은 수까지 매번 1씩 증가되는 숫자가 홀수인지, 짝수인지 판별하여
		 * 홀수면 "박", 짝수면 "수" 출력
		 * 단, 입력받은 수가 양수가 아니면 "양수가 아닙니다" 출력
		 * 
		 * 예시 ) 4 입력시  -->  박수박수 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) { // 입력받은 수가 양수일 경우 (잘 입력하였을 경우)
			
			for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 수까지 반복실행
				
				if(i % 2 == 1) {	// 홀수일 경우
					System.out.print("박");
					
				} else {			// 짝수일 경우
					System.out.print("수");
					
				}
			}
			
		} else {	// 입력 받은 수가 양수가 아닐 경우 (잘 못 입력하였을 경우)
			
			System.out.println("양수가 아닙니다.");
		}
	}
	
	
	public void method2() {
		
		// 위의 method1에서 양수가 아닐 경우 다시 입력받도록 반복 수행
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 우선 무한 반복으로 수행하고
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) { // 입력받은 수가 양수일 경우 (잘 입력하였을 경우)
				
				for(int i = 1; i <= num; i++) { // 1부터 사용자가 입력한 수까지 반복실행
					
					if(i % 2 == 1) {	// 홀수일 경우
						System.out.print("박");
						
					} else {			// 짝수일 경우
						System.out.print("수");
						
					}
				}
				
				// 양수일 경우 제대로 출력되고 무한반복문을 빠져나가자
				break;
				
			} else {	// 입력 받은 수가 양수가 아닐 경우 (잘못 입력하였을 경우)
				
				System.out.println("양수가 아닙니다.");
				
				// 양수가 아닐 경우 다시 반복문의 처음으로 돌아가 정수를 입력받게 될거다.
			}
			
		}
	}
	
	
	public void method3() {
		
		/*
		 * 추가문제2. 
		 * 문자열을 입력 받고 						(str)
		 * 입력받은 문자열에서 검색하고 싶은 문자도 입력받기	(ch)
		 * 문자열에 그 문자가 몇 개 있는지 개수 출력
		 * 
		 * 예시 ) "banana", 'a' 를 입력 받게 되면 3출력
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;		// 검색된 문자의 갯수를 담을 변수
		
		for(int i=0; i<str.length(); i++) { // 0부터 문자열의 길이-1 만큼 1씩 증가하는 동안 반복
			
			if(ch == str.charAt(i)) { // 입력받은 문자와 문자열의 각 인덱스 값이 같을 경우
				count++; // 동일한 문자라고 판단하여 count 1 증가
			}
			
		}
		
		System.out.println("포함된 갯수 : " + count);
		
	}
	
	public void method4() {
		/*
		  추가문제3. 아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성하시오.
		  
		     1
		    123
		   12345
		  1234567
		 123456789
		  1234567
		   12345
		    123
		     1
		     
	     */
		
		for(int i=-4; i<=4; i++) {	// i는 -4~4까지 1씩 증가 (-4,-3,-2,-1,0,1,2,3,4)
			
			int k = i < 0 ? -i : i;	// i의 절대값을 k변수에 담는 구문 (4,3,2,1,0,1,2,3,4)
			
			// 앞에 공백을 먼저 출력시키는 for문 
			for(int j=0; j<k; j++) { // k횟수만큼 공백이 먼저 출력됨
				System.out.print(" ");
			}
			
			// 그 후에 숫자를 출력시키는 for문 
			for(int j=1; j<=9-2*k; j++) { // 1에서부터 9-2*k까지 1씩 증가되는 구문이 출력
				System.out.print(j);
			}
			/*
			 * * 추가설명 
			 * k=4일 경우 j=1까지 출력 (1)
			 * k=3일 경우 j=3까지 출력 (123)
			 * k=2일 경우 j=5까지 출력 (12345)
			 * k=1일 경우 j=7까지 출력 (1234567)
			 * k=0일 경우 j=9까지 출력 (123456789)
			 * 
			 * 따라서 j는 9-2*k 까지로 제시되어야함
			 */
			
			System.out.println(); // 한줄 다 출력되면 그 다음줄로 넘기는 개행출력
			
		}
		
	}
	
	public void method5() {
		
		/*
		 추가문제4. 아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성하시오.
		 
		   *
		  * *
		 *   *
		  * *
		   *
		   
		 */
		
		for(int i=-2; i<=2; i++) {		// i는 -2에서부터 2까지 1씩 증가 (-2,-1,0,1,2)
			
			int k = i < 0 ? -i : i;	 	// i의 절댓값을 k변수에 대입해둠 (2,1,0,1,2)
			
			for(int j=0; j<k; j++) {	// k횟수만큼 공백을 먼저 출력
				System.out.print(" ");
			}
			
			for(int j=1; j<=5-2*k; j++) { // 5-2*k만큼 "*" 또는 "공백"이 출력되어야됨
				
				if(j==1 || j==5-2*k) {		// 이때 첫번째열 또는 마지막열에만 * 출력하고
					System.out.print("*");
				}else {						// 그게 아닐경우 공백을 출력하도록
					System.out.print(" ");
				}
				
			}
			
			/*
			 * k=2일때 j=1~1   => *
			 * k=1일때 j=1~3   => * *
			 * k=0일때 j=1~5   => *   * 
			 */
			
			System.out.println();
			
		}
		
	}
	
	
	

}
