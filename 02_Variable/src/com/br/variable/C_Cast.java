package com.br.variable;

public class C_Cast {
	
	/*
	 * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * * 컴퓨터에서의 값 처리 규칙
	 * 1. 대입연산자를 기준으로 왼쪽과 오른쪽 자료형은 같아야됨
	 *    --> 같은 자료형의 값만 대입이 가능하다. 
	 *    --> 다른 자료형의 값을 대입하고자 한다면 형변환을 진행해야됨!!
	 *    
	 *    자료형 변수명 = (자료형)값;
	 *    
	 * 2. 같은 자료형끼리만 연산이 가능 => 계산결과도 같은 자료형으로 나옴
	 *    값 + 값 => 두 값이 같은 자료형이여야됨
	 * 
	 * * 형변환의 종류
	 * 1. 자동형변환 --> 자동으로 형변환이 이뤄지기 때문에 직접 형변환할 필요 없음
	 * 2. 강제(명시적)형변환 --> 직접 형변환 해야됨
	 *    [표현법]   (자료형)값
	 *    
	 * * 주의사항
	 * boolean은 형변환 불가능 
	 *    
	 */
	
	public void autoCasting() {
		/*
		 * * 자동형변환
		 * 자료형이 다른 두 값 간의 연산(대입, 산술 등등) 시
		 * 자동으로 값의 범위가 작은 자료형이 큰 자료형으로 변환
		 */
		// short(2byte) --> int(4byte)
		short s = 10;
		int i = /*(int)*/s;
		
		// 1. int(4byte) --> double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1; // 12 => 12.0
		
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // 12 + 3.3 => 12.0 + 3.3 => 15.3
		
		System.out.println("result : " + result);
		
		// 2. int(4byte) --> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		long l4 = 1000/*L*/; 
		
		// 3. float(4byte) --> double(8byte)
		float f4 = 1.0f; // f : float자료형으로 변환시키는 구문
		double d4 = /*(double)*/f4;
		
		// === 특이케이스 ===
		// 4. long(8byte) --> float(4byte)
		//  float은 실수형이기 때문에 long형 보다 표현가능한 수의 범위가 더 크기 때문
		long l5 = 1000;
		float f5 = /*(float)*/l5;
		
		// 5. char(2byte) <-> int(4byte)
		int num = '핳';
		System.out.println("num : " + num); 
		// 아스키코드표 (0~127)
		
		char ch = 65;
		System.out.println("ch : " + ch);
		
		// char(2byte) 저장가능범위 : 0~65xxx
		
		// 6. byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		//byte b3 = b1 + b2; // byte나 short는 연산시 무조건 int형으로 처리
		
		//byte b3 = (byte)b1 + b2;
		byte b3 = (byte)(b1 + b2); // "강제형변환" 해야됨
		
		
	}
	
	public void forceCasting() {
		// 강제형변환 : 큰 범위의 자료형을 작은 범위의 자료형으로 바꾸는 것
		
		// double(8byte) --> float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		
		// double(8byte) --> int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = /*(double)*/iNum + dNum;	// 결과값이 double형
		
		// 해결방법1. 연산결과를 int형으로 강제형변환 하면됨
		int iSum1 = (int)(iNum + dNum); // 10.0 + 5.89 => (int)15.89 => 15
		System.out.println("iSum1 : " + iSum1);
		
		// 해결방법2. double형 값만을 int형으로 강제형변환 
		int iSum2 = iNum + (int)dNum; // 10 + 5 => 15
		System.out.println("iSum2 : " + iSum2);
		
		// 실수값을 정수형으로 강제형변환하는 순간 "데이터손실이 발생할 수 있음!!!"
		
		// 해결방법3. 연산 결과를 double형 변수에 대입
		double dSum3 = iNum + dNum; // 10.0 + 5.89 => 15.89
		System.out.println("dSum3 : " + dSum3);
		
		
	}
	
	
	

}
