package com.br.variable;

public class D_Printf {
	
	public void printfTest() {
		// System.out.print(출력하고자하는값) : 단지 값만 출력 
		// System.out.println(출력하고자하는값) : 값 출력 후 줄바꿈 발생
		
		// System.out.printf("출력하고자하는형식(포맷)", 출력하고자하는값, 값, 값, ...);
		// : 내가 나열한 값들을 내가 제시한 형식대로 출력만 함 (줄바꿈 발생x)
		
		/*
		 * * 포맷안에서 쓸 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 출력하고싶은 형식 : "10 20%"
		System.out.println(iNum1 + " " + iNum2 + "%");
		System.out.printf("%d %d%%  \n", iNum1, iNum2);
		
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 10);
		// 양수 작성시 : 해당 수만큼의 칸수를 확보 한 후 오른쪽정렬
		// 음수 작성시 : 해당 수만큼의 칸수를 확보 한 후 왼쪽정렬
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2);
		// %f 는 기본적으로 소수점아래 6째자리까지 출력
		System.out.printf("%.3f %.1f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s \n", ch, str, ch);
		System.out.printf("%C %S\n", ch, str);
		
		
	}

}
