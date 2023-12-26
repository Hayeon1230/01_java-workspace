package com.br.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * * 변수 : 하나의 공간에 하나의 값만 담을 수 있음 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음 단,
	 * "같은 자료형의 값"으로만 담을 수 있음 정확히 얘기하면 배열의 각 인덱스 자리에 각 값들이 담김
	 * 
	 */

	public void method1() {
		// *변수만을 가지고 프로그래밍
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;

		// 출력하고자 할 경우
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);

		// 총 합계를 구해서 출력 => 일일이 더해줘야함
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);

		System.out.println("=============");
		// * 배열가지고 프로그래밍
		/*
		 * 1. 배열 선언
		 * 
		 * 자료형 배열명[]; 자료형[] 배열명;
		 */
		int a; // 변수 선언

		// int arr[];
		// int[] arr;

		/*
		 * 2. 배열 할당 (몇개의 값들을 보관할껀지 배열의 크기 지정하는 과정) 배열명 = new 자료형[배열크기];
		 * 
		 */
		// arr = new int[5];

		// * 배열 선언과 동시에 할당
		int[] arr = new int[5];

		/*
		 * 3. 값 대입 배열명[인덱스] = 값;
		 */
		/*
		 * arr[0] = 0; arr[1] = 1; arr[2] = 2; arr[3] = 3; arr[4] = 4; arr[5] = 5;
		 */
		for (int i = 0; i <= 4; i++) {// 배열장점 : 반복문 활용 가능
			arr[i] = i;
		}
		int sum1 = 0;
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
			sum1 += arr[i];
		}
		System.out.println(sum1);
		System.out.println(arr); // 실제 arr이라는 박스에 담겨있는 "주소값" 출력

	}

	public void method2() {

		int i = 10;
		int[] iArr = new int[3];
		// 메모리구조 Stack Heap Static 세 영역
		// 대입연산자 기준 왼쪽이 먼저 ->i라는 박스. Stack에 만들어짐
		// 오른쪽 값이 왼쪽 상자에 대입되는게 두번째
		// int[] 인트배열도 마찬가지로 Stack에 생성됨
		// new 만나면, Heap이라는 영역에 공간. [3] => 3칸짜리
		// Heap영역 특성상, 고유주소값 부여. 예: 0X123
		// 오른쪽 꺼 왼쪽에 담길 때, 주소값만 담기는 것
		// 실제값은 Heap에 담겨있음

		System.out.println(iArr);
		/*
		 * 기본자료형(boolean,char, byte, short, int, long, float, double (8개) 으로 선언된 변수 =>
		 * 실제 리터럴값을 바로 담을 수 있음 => 일반변수
		 * 
		 * * 그 외의 자료형(int[], double[], char[], ..., Scanner, String 으로 선언된 변수 => 주소값을 담는
		 * 변수 => 참조변수(레퍼런스변수)
		 */

		double[] dArr = new double[3];
		System.out.println(dArr);

	}

	public void method3() {

		int[] iArr = new int[3]; // 0~2번 인덱스가 내부적으로 만들어진다
		double[] dArr = new double[3]; // 0~2번 인덱스

		/*
		 * 연산 순서는 왼 오 대입(오->왼) Stack Heap Static Stack에 int[] iArr이란 박스 생김 기본자료형이 아닌
		 * 참조자료형변수 -> 주소값이 담기겠구나 new를 만남 -> 무조건 Heap에 생성 -> int 3개 담을 수 있는 공간 (Heap 특징:
		 * 절대 빈공간이 존재할 수 없음-JVM이 기본값으로라도 초기화 진행, 고유주소값 부여됨) 대입연산자 단계 -> 주소가 담김(주소 보고 찾아갈
		 * 수 있음 -> 참조한다고 함)
		 * 
		 * Stack에 double[] dArr이란 박스 생김 기본자료형이 아닌 참조자료형변수 -> 주소값이 담기겠구나 new를 만남 -> 무조건
		 * Heap에 생성(double 실수 3개 담을 수 있는 공간) 고유 주소값 부여됨(위의 int와 다른 주소), 빈공간x
		 */

		// 각 인덱스(방)에 초기화를 진행하지 않음 (값 대입x)
		// iArr배열의 모든값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i]);
		}
		// ㅇArr배열의 모든값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(dArr[i]);
		}

		// 각 인덱스에 접근해서 값을 대입하지 않아도 (즉, 초기화하지않아도)
		// 초기값이 담겨있음!!
		// Heap영역에는 빈공간이 절대 존재할 수 없음
		// => 따라서 공간이 만들어질때 JVM이 기본값으로 초기화(대입)를 진행

	}

	/*
	 * * Heap의 특징 1. 생성된 공간(객체)마다 고유한 주소값이 부여됨 2. 절대 빈 공간이 존재할 수 없음(즉, 초기화를 해줘야됨)
	 * 혹시라도 초기화를 진행하지 않을 경우 => JVM이 알아서 초기화 해줌
	 * 
	 */
	public void method4() {

		int[] arr = new int[5/* arr.length */];// ? 강사님 코드랑 비교하기
		/*
		 * arr[0] = 1; arr[1] = 2; ... arr[4] = 5;
		 */
		for (int i = 0; i < arr.length; i++) {
			// 배열의 크기를 동적으로 알아내는 방법 arr.length
			// 문자열.length() -> 메소드 이용하는 것
			// 배열.length -> 메소드 이용x
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 배열의 크기는 언제 수정될지 모르니까 => arr.length로 알아오게끔 기술!
		System.out.println(arr);// 변수의 자료형 + @ + 주소값의 16진수형태
		System.out.println(arr.hashCode());// 주소값의 10진수 형태
		System.out.println("배열길이 : " + arr.length); // 배열의 길이
	}

	public void method5() {
		int result = 0;
		int[] arr = null;

		System.out.println(arr);
		// System.out.println(arr[0]);
		// System.out.println(arr.length);
		// System.out.println(arr.hashCode());
		// null 가지고 메소드를 호출하거나 특정 어딘가에 접근하고자
		// => NullPointerException

	}

	public void method6() {
		int[] arr = new int[5];

		/*
		 * arr[0] = 2; arr[1] = 4; arr[2] = 6; arr[3] = 8; arr[4] = 10; // 배열길이-1까지
		 */
		/*
		 * for(int i=0; i<arr.length; i++) { arr[i] = (i + 1) * 2;
		 * System.out.println(arr[i]); }
		 */
		int value = 2;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value += 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println("arr의 해쉬코드 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		// *ArrayIndexOutOf BoundsException
		// 부적절한 인덱스로 배열에 접근했을 경우 발생되는 오류
		// arr[6] = 14;

		/*
		 * 배열의 가장 큰 단점 - 한 번 지정된 배열의 크기는 변경이 불가 => 배열의 크기를 변경하고자 한다면 다시 생성
		 */
		arr = new int[7];

		System.out.println(arr[0]);

		System.out.println("변경 후의 arr의 해쉬코드 : " + arr.hashCode());
		// 주소값이 변경됨!! => 새로운 곳을 참조하고 있음
		/*
		 * 연결이 끊긴 기존 배열은 Heap영역이 둥둥떠다님 => 그 어디에도 참조되고 있지 않음 => 일정 시간이 지나면 "가비지컬렉터(GC)"가
		 * 알아서 지워줌 => 자바에서의 "자동메모리관리" 특징 == 개발자가 코드작성에만 신경쓸수있음
		 */

		// 배열을 강제로 삭제시키고자 한다면? => 연결고리를 끊으면 됨
		arr = null;
	}

	public void method7() {
		// 배열 선언, 할당, 값 초기화 동시에 진행 가능
		int[] arr1 = new int[] { 1, 2, 3, 4 }; // 표현법1
		int[] arr2 = { 1, 2, 3, 4 }; // 표현법2

		System.out.println(arr1 == arr2); // false(주소값이 다름)

		int a = 10;
		int b = 10;
		System.out.println(a == b);// 일반변수는 주소가 아닌 리터럴값 가지고 있어서 true

	}

	public void method8() {
		// 1. 크기 10짜리 정수 배열 생성
		int[] arr = new int[10];

		// 2. 0번인덱스부터 마지막인덱스까지 순차적으로 접근하면서 값을 대입
		// 매번 1~100 사이의 랜덤값
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		// 3. 해당 배열의 0~마지막인덱스까지 담겨있는 값 출력
		// 단, 해당인덱스에 담겨있는 값이 홀수인것만 출력
		// 그리고 해당 인덱스에 담겨있는 값이 짝수인것들의 총합계, 갯수 출력
		// arr[x] : xx 형식으로
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.printf("arr[%d] : %d \n", i, arr[i]);

			} else {
				sum += arr[i];
				count++;
			}
		}
		System.out.printf("짝수값 합계 : %d\n짝수갯수 : %d\n", sum, count);
	}

	public void method9() {
		Scanner sc = new Scanner(System.in);
		// String [] xxx = new String[xx];
		// 1. 사용자에게 배열의 길이(크기) 입력받은 후
		System.out.println("배열의 길이 : ");
		int size = sc.nextInt();
		sc.nextLine();

		// 해당 그 크기만큼의 문자열배열 생성
		String[] arr = new String[size];

		// 2. 매번 사용자에게 과일명 입력받아 각 인덱스자리에 대입
		// 단, 사용자가 입력한 문자열이 exit인 경우 해당 반복문을 빠져나가게끔
		for (int i = 0; i < size; i++) {
			System.out.println("좋아하는 과일명 : ");
			String fruit = sc.nextLine();// exit 적용하려, 배열에 바로 안받기로? 근데 아래처럼도 되는데?
			if (fruit.equals("exit")) {
				break;
			} else {
				arr[i] = fruit;
			}
			/*
			 * arr[i] = sc.nextLine();
			 * 
			 * if(arr[i].equals("exit")) { break; }
			 */
		}

		System.out.println();
		// 3. 0~마지막인덱스까지 담긴 값들 출력
		for (int i = 0; i < size; i++) {

			System.out.printf("%s\n", arr[i]);
		}

		// String 기본값은 null
	}

	public void method10() {
		Scanner sc = new Scanner(System.in);
		double[] height = new double[3];
		double sum = 0.0;

		for (int i = 0; i < height.length; i++) {
			System.out.println("키 :");
			height[i] = sc.nextDouble();

		}
		for (int i = 0; i < height.length; i++) {
			System.out.printf("%d번 학생의 키 : %.1fcm\n", i + 1, height[i]);
			sum += height[i];
		}
		System.out.printf("학생수 : %d\n키의 총합 : %f\n평균값 : %.1f", height.length, sum, sum / height.length);
	}

	public void method11() {
		/*
		 * char[] arr = new char[3]; for(int i=0; i<arr.length; i++) {
		 * System.out.println(arr[i]); }
		 */

		// 사용자에게 문자열 하나 입력받은 후
		// 각 인덱스에 있는 문자값들을 char 배열에 옮겨담기
		Scanner sc = new Scanner(System.in);

		// 1. 문자열 입력받기
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		// 2. char배열 생성해두기(배열의 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];

		// 3. 문자열의 각 인덱스별 문자값을 char배열의 각 인덱스 자리에 대입
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);

		}
		// 4. 해당 배열의 모든 인덱스에 담긴 값을 출력
		for (int i = 0; i < str.length(); i++) {
			System.out.println(arr[i]);
		}

	}

	public void homework() {
		String str = "GDKKN";
		// 위와 같은 문자열이 있는데 각 문자마다 +1된 문자열(HELLO)
		// 해당 결과값을 String result에 기록하시오. =>출력

		// 2. char배열 생성해두기(배열의 크기 == 문자열의 길이)
		char[] arr = new char[str.length()];

		// 3. 문자열의 각 인덱스별 문자값을 char배열의 각 인덱스 자리에 대입
		for (int i = 0; i < str.length(); i++) {
			arr[i] = (char) (str.charAt(i) + 1);

		}
		// 4. 해당 배열의 모든 인덱스에 담긴 값을 출력
		for (int i = 0; i < str.length(); i++) {
			System.out.print(arr[i]);
		}

	}

	public void homework2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		// 위와 같은 문자열이 있는데 각 문자마다 +1된 문자열(HELLO)
		// 해당 결과값을 String result에 기록하시오. =>출력

		// 2. char배열 생성해두기(배열의 크기 == 문자열의 길이)

		// 2. 해당 배열에 각 문자들을 담을 때 +1 처리해서 그다음 알파벳

		char[] arr = null;
		for (int i = 0; i < str.length(); i++) {
			arr[i] = (char) (str.charAt(i) + 1);

		}
		// 해당 결과값을 String result에 기록 출력도
		// 3. 문자열의 각 인덱스별 문자값을 char배열의 각 인덱스 자리에 대입

		// 4. 해당 배열의 모든 인덱스에 담긴 값을 출력
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += arr[i];
		}
		System.out.println(result);
	}

	public void remind() {
		// 변수 : 오로지 한개의 값만
		// 배열 : 여러개의 값(단, 같은 자료형끼리만)

		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 40;

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
