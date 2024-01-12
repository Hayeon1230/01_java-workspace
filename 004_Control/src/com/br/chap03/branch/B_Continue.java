package com.br.chap03.branch;

public class B_Continue {

	/*
	 * continue; : 해당 구문 실행시 곧바로 현재 속해있는 반복문 위로 올라감
	 * 
	 */
	public void method1() {// 1~10 홀수
		/*
		 * for(int i=1; i<=10; i++) { if(i % 2 == 1) { System.out.print(i + " "); } }
		 */

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수일 경우
				continue; // 반복문 내의 뒤의 구문들은 실행되지 않고 반복문 위로 올라감(초기식부터x 증감식으로o)
			}

			System.out.print(i + " ");
		}
	}

	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 빼고 덧셈 연산

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			/*if (i % 6 != 0) {
				sum += i;
			}*/
			if(i % 6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100까지 6의 배수 제외 합계 : " + sum);
	}
	
	public void method3() {
		// 2~9단까지 출력
		// 단, 3의 배수단은 제외하고 출력
		
		for(int dan = 2; dan<=9; dan++) {
			if(dan % 3 == 0) {
				continue;
			}
			System.out.println("==== " + dan +"단 ====");
			for(int i=1; i<=9; i++) {
				
				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
			}
			System.out.println();
		}
		
		
	}
}
