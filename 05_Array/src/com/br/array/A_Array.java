package com.br.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	 * * 변수 : 하나의 공간에 하나의 값만 담을 수 있음
	 * * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 * 		   단, "같은 자료형의 값"으로만 담을 수 있음 
	 * 		   정확히 얘기하면 배열의 각 인덱스 자리에 각 값들이 담김
	 * 
	 */
	public void method1() {
		// * 변수만을 가지고 프로그래밍
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력하고자 할 경우 => 일일히 출력해됨
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(numi);
		}
		*/
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 총 합계를 구해서 출력 => 일일히 더해줘야됨
		int sum = num1 + num2 + num3 + num4 + num5;
		/*
		for(int i=1; i<=5; i++) {
			sum += numi;
		}
		*/
		System.out.println(sum);
		
		System.out.println("==================");
		
		// * 배열가지고 프로그래밍
		/*
		 * 1. 배열 선언 
		 *   
		 *    자료형 배열명[];
		 *    자료형[] 배열명;
		 */
		//int a; // 변수 선언
		
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. 배열 할당 (몇개의 값들을 보관할껀지 배열의 크기지정하는 과정)
		 *    배열명 = new 자료형[배열크기];
		 */
		//arr = new int[5];
		
		// * 배열 선언과 동시에 할당
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입
		 *    배열명[인덱스] = 값;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		for(int i=0; i<5; i++) { // 배열 장점 : 반복문 활용 가능
			arr[i] = i;
		}
		
		int sum1 = 0;
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
			sum1 += arr[i];
		}
		System.out.println(sum1);
		
		System.out.println(arr); // 실제 arr이라는 박스에 담겨있는 "주소값"값 출력
		
		
		
	}
	
	public void method2() {
		
		int i = 10;
		int[] iArr = new int[3];
		
		System.out.println(iArr);	
		
		/*
		 * * 기본자료형(boolean, char, byte, short, int, long, float, double)
		 *   으로 선언된 변수 => 실제 리터럴값을 바로 담을 수 있음 => 일반변수
		 *   
		 * * 그 외의 자료형(int[], double[], char[], ..., Scanner, String, ...)
		 *   으로 선언된 변수 => 주소값을 담는 변수 => 참조변수(레퍼런스변수)
		 */
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0 ~ 2번 인덱스
		double[] dArr = new double[3]; // 0~2번 인덱스
		
		// 각 인덱스(방)에 초기화를 진행하지 않음 (값 대입x)
		// iArr배열의 모든값 출력
		for(int i=0; i<3; i++) {
			System.out.println(iArr[i]);
		}
		// dArr배열의 모든값 출력
		for(int i=0; i<3; i++) {
			System.out.println(dArr[i]);
		}
		
		// 각 인덱스에 접근해서 값을 대입하지 않아도 (즉, 초기화하지 않아도)
		// 초기값이 담겨있음!! 
		// Heap 영역에는 빈 공간이 절대 존재할 수 없음
		// => 따라서 공간이 만들어질때 JVM이 기본값으로 초기화(대입)를 진행
		
		
	}
	
	/*
	 * * Heap의 특징
	 * 1. 생성된 공간(객체)마다 고유한 주소값이 부여됨
	 * 2. 절대 빈 공간이 존재할 수 없음 (즉, 초기화를 해줘야됨)
	 *    혹시라도 초기화를 진행하지 않을 경우 => JVM이 알아서 초기화 해줌 
	 */
	
	public void method4() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 배열의 크기는 언제 수정될지 모르니깐 => arr.length로 알아오게끔 기술!
		
		System.out.println(arr); // 변수의자료형 + @ + 주소값의16진수형태
		System.out.println(arr.hashCode()); // 주소값의 10진수형태
		System.out.println("배열의 길이(크기) : " + arr.length); // 배열의 길이
		
	}
	
	public void method5() {
		int result = 0;
		int[] arr = null; // 아무것도 참조하고 있지 않음
		// 참조변수의 기본값은 null
		
		System.out.println(arr);
		
		//System.out.println(arr[0]);
		//System.out.println(arr.length);
		System.out.println(arr.hashCode());
		// null가지고 메소드를 호출하거나 특정 어딘가에 접근하고자 할경우 
		// => NullPointerException
		
	}
	
	public void method6() {
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;    2 * 1
		 * arr[1] = 4;    2 * 2
		 * arr[2] = 6;    2 * 3
		 * arr[3] = 8;    2 * 4
		 * arr[4] = 10;   2 * 5
		 */
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2 * (i+1);
		}
		*/
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		//* ArrayIndexOutOfBoundsException
		//  부적절한 인덱스로 배열에 접근했을 경우 발생되는 오류 
		//arr[5] = 12;
		//arr[6] = 14;
		
		/*
		 * * 배열의 가장 큰 단점
		 * - 한번 지정된 배열의 크기는 변경이 불가
		 *   => 배열의 크기를 변경하고자 한다면 다시 생성
		 */
		arr = new int[7];
		
		System.out.println(arr[0]);
		
		System.out.println("변경 후의 arr의 해쉬코드 : " + arr.hashCode());
		// 주소값이 변경됨!! => 새로운 곳을 참조하고 있음
		
		/*
		 * 연결이 끊긴 기존 배열은 Heap영역에 둥둥떠다님
		 * => 그 어디에도 참조되고 있지 않음 (== 쓸모없는 존재 == 지워주는게 좋음)
		 * => 일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌
		 * => 자바에서의 "자동메모리관리" 특징 == 개발자가 코드작성에만 신경쓸수있음
		 */
		
		// 배열을 강제로 삭제시키고자 한다면? => 연결고리를 끊으면 됨
		arr = null;
		
		
	}
	
	public void method7() {
		// 배열 선언, 할당, 값 초기화 동시에 진행 가능
		int[] arr1 = new int[] {1, 2, 3, 4}; // 표현법1
		int[] arr2 = {1, 2, 3, 4}; // 표현법
		
		System.out.println(arr1 == arr2); // false
		// 주소값 비교하기 때문에 false
		
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		// 리터럴값 비교하기 때문에 true
		
	}
	
	public void method8() {
		// 1. 크기 10짜리 정수 배열 생성 
		int[] arr = new int[10];
		
		// 2. 0번인덱스부터 마지막인덱스까지 순차적으로 접근하면서 값을 대입
		//    매번 1~100사이의 랜덤값 
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 해당 배열의 0~마지막인덱스까지 담겨있는 값 출력
		//    단, 해당인덱스에 담겨있는 값이 홀수인것만 출력
		//    그리고 해당 인덱스에 담겨있는 값이 짝수인것들의 총합계, 갯수 출력
		//    arr[x] : xx   형식으로 
		int sum = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) { // 홀수일 경우
				System.out.println("arr[" + i + "] : " + arr[i]);
			}else { // 짝수일 경우
				sum += arr[i];
				count++;
			}
		}
		
		System.out.println("짝수들의 총 합 : " + sum);
		System.out.println("짝수의 갯수 : " + count);
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 배열의 길이(크기) 입력받은 후 
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		//    해당 그 크기만큼의 문자열배열 생성 
		String[] arr = new String[size];
		
		// 2. 매번 사용자에게 과일명 입력받아 각 인덱스자리에 대입
		//    단, 사용자가 입력한 문자열이 exit일 경우 해당 반복문을 빠져나가게끔
		for(int i=0; i<size; i++) {
			System.out.print("좋아하는 과일명 입력 : ");
			String fruit = sc.nextLine();
			
			if(fruit.equals("exit")) {
				break;
			}else {
				arr[i] = fruit;
			}
		}
		
		// 3. 0~마지막인덱스까지 담긴 값들 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// String 기본값은 null
		
	}
	
	public void method10() {
		
		/*
		 * 현재 학생이 세명있다는 가정하에
		 * 세명의 키 정보를 보관할 크기 3짜리 double배열을 생성 한 후 
		 * 반복적으로 사용자에게 키를 입력받아 각 인덱스에 대입하기
		 * 
		 * 각 인덱스에 담겨있는 값 출력을 하되 
		 * "x번 학생의 키 : xxx.xcm" 형식으로 출력되도록 
		 * ex) 1번 학생의 키 : 162.1cm
		 *     2번 학생의 키 : 159.1cm
		 *     3번 학생의 키 : 178.2cm
		 *     
		 * 그리고 현재 학생들의 수, 학생들의 키의 총합, 평균값도 출력하시오. 
		 */
		Scanner sc = new Scanner(System.in);
		
		double[] arr = new double[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("키 입력 : ");
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번 학생의 키 : %.1fcm\n", i+1, arr[i]);
			sum += arr[i];
		}
		
		System.out.println("학생의 수 : " + arr.length + "명");
		System.out.printf("학생들의 키 총합 : %.1fcm\n", sum);
		System.out.printf("학생들의 평균키 : %.1fcm\n", sum/arr.length);
		
		
	}
	
	public void method11() {
		
		/*
		char[] arr = new char[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		// 사용자에게 문자열 하나 입력받은 후 
		// 각 인덱스에 있는 문자값들을 char 배열에 옮겨담기
		Scanner sc = new Scanner(System.in);
		
		// 1. 문자열 입력받기
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 2. char배열 생성해두기 (배열의 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];
		
		// 3. 문자열의 각 인덱스별 문자값을 char배열의 각 인덱스 자리에 대입
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ...
		 * arr[마지막인덱스] = str.charAt(마지막인덱스);
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 4. 해당 배열의 모든 인덱스에 담긴 값을 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void homework() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 문자열을 입력하시오 : ");
		String str = sc.nextLine();
		
		// 위와 같은 문자열이 있는데 이때 각 문자마다 +1이 진행된 문자열을 얻고 싶다. 
		// ex) "GDKKN" => "HELLO"
		//     "AAP"   => "BBQ"
		
		// 1. 각 문자들을 보관할 수 있는 char[] 배열 만들기 
		char[] arr = new char[str.length()];
		
		// 2. 해당 배열에 각 문자들을 담을때 +1 처리해서 그다음 알파벳이 바로 담기도록
		/*
		 * arr[0] = str.charAt(0) + 1;
		 * arr[1] = str.charAt(1) + 1;
		 * arr[2] = str.charAt(2) + 1;
		 * ...
		 * arr[4] = str.charAt(4) + 1;
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = (char)(str.charAt(i) + 1);
		}
		
		// 해당 결과값을 String result에 기록하시오. => 출력도 해보시오. 
		// 3. String result변수 세팅해 char[]안의 각 문자들을 
		//    연이어서 result에 담기도록
		String result = "";
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		
		// 4. 결과 출력
		System.out.println(result);
	}
	
	public void remind() {
		// 변수 : 오로지 한개의 값만 
		// 배열 : 여러개의 값 (단, 같은 자료형끼리만)
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 40;
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) { 
			System.out.println(arr[i]);
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
