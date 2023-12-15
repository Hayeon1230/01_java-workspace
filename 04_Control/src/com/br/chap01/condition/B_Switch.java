package com.br.chap01.condition;

import java.util.Scanner;

public class B_Switch {

	/*
	 * * switch
	 * 
	 * switch(동등비교할대상자) {
	 * case 값1 : 
	 * 		실행코드1;
	 * 		실행코드1;
	 * 		break;
	 * case 값2 : 실행코드2; break;
	 * case 값3 : 실행코드3; break;
	 * ...
	 * [default : 위의 값들과 모두 일치하지 않을경우 실행할 코드;]
	 * }
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		/*
		 * 정수를 입력받아
		 * 1일 경우 => "빨간색입니다."
		 * 2일 경우 => "파란색입니다."
		 * 3일 경우 => "초록색입니다."
		 * 잘못입력했을 경우 =>"잘못입력하셨습니다."
		 */
		
		
		System.out.println("정수(1~3) : ");//syso ctrl space ->단축키
		int num = sc.nextInt();
		/*if(num == 1) {
			System.out.println("빨간색입니다.");
		}else if(num == 2) {
			System.out.println("파란색입니다.");
		}else if(num == 3) {
			System.out.println("초록색입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
			
		}*/
		//ctrl alt 누르고 드래그 -> 복사
		// alt 누르고 드래그 -> 이동
		
		switch(num) {//각 케이스에 break 안써주면, 끝날 때까지 못나옴
		// -> 1을 입력해도 밑에꺼 다나옴
		//동등비교만 가능(동일한지 아닌지만 가능, 범위 내에 드는지 등 불가능)
		case 1:
			System.out.println("빨간색입니다."); 
			break;
		case 2:
			System.out.println("파란색입니다.");
			break;
		case 3:
			System.out.println("초록색입니다.");
			break;
		default: 
			System.out.println("잘못입력하셨습니다.");
		}	
	}
	
	public void method2() {
		// 사용자에게 구매하고자하는 과일명 입력받아
		//해당 과일의 가격을 출력
		
		System.out.print("구매하고자하는 과일명(사과,바나나,복숭아) : ");
		String fruit = sc.nextLine();
		
		// xx의 가격은 xxx원입니다.
		int price = 0; // 각 과일의 가격값을 보관할 변수
		//초기화 습관 들이기(밑의 조건 다 안맞을 수도 있으니까)
		switch(fruit) {//문자열이지만 switch에서는 알아서 equals 적용됨
		case "사과": price = 1000; break;
		case "바나나": price = 2000; break;
		case "복숭아": price = 3000; break;
		/*default :
			System.out.printf("%s은 판매하지 않습니다.",fruit);
			return; // 현재 속해있는 메소드를 빠져나간다
			//안나가면, 없는 과일 치면 아래 구문으로 가서, 초기값인 0원 나옴
		 */
		}
		if(price == 0) {// price가 여전히 0일 경우 => 잘못입력했을경우
			System.out.println(fruit +"은 판매하지 않습니다.");
		}else {//잘 입력했을 경우
				System.out.println(fruit + "은 " + price + "원 입니다.");
		}
			//이렇게 쓰면 return 필요없음
	}
		
	//System.out.printf("%s의 가격은 %d원입니다.", fruit,price);

	// break 없는 switch문
	public void method3() {
		//등급별 권한
		//1 : 읽기 권한, 글쓰기 권한, 관리 권한
		//2 : 읽기 권한, 글쓰기 권한
		//3 : 읽기 권한
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1: System.out.print("관리 권한, ");
		case 2: System.out.print("글쓰기 권한, ");
		case 3: System.out.println("읽기권한 있어"); break;
		default: System.out.println("잘못입력. 1~3 사이 숫자 입력하세요.");
		}
		
	}
	
	public void method4() {
		// 사용자에게 이름, 성별(M/F)을 입력받은 후
		// 'm' 또는 'M' 일 경우 "xxx은 남학생이다." 출력
		// 'f' 또는 'F' 일 경우 "xxx은 여학생이다."
		// 다 아닐 경우 "성별을 잘못입력하셨습니다."
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String genderStr = "";
		switch(gender) {
		case 'M': 
		case 'm': genderStr = "남"; break;
		case 'F': 
		case 'f': genderStr = "여"; break;
		default: System.out.println("성별 잘못입력"); //return;
		}
		// 성별을 잘 입력했을 때만 -> 조건문 안에 넣을 수 있음
		// genderStr에 담긴 값이 ""이 아닐 경우
		if(!genderStr.equals("")) {
		System.out.printf("%s은 %s학생이다.", name,genderStr);
		}
	}
	public void method5() {
		// 월을 입력받아 해당 월의 마지막일 출력
		// 1 3 5 7 8 10 12 => 31일
		// 4 6 9 11 => 30일
		// 2 => 28일 또는 29일
		 
		System.out.println("1~12월 중 하나 입력(정수) : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12: 
			System.out.println("31일까지 입니다."); break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 입니다.");
			break;
		case 2:
			System.out.println("29일 또는 28일까지 입니다.");
			break;
		default:
			System.out.println("반드시 1~12 사이의 숫자를 입력해야합니다.");
		}
	}
	
	public void warning() {
		// * 주의사항 *
		// 비교대상자는 int, String형만 가능하다.(double 등 불가능)
		// byte, short, char는 int로 인식되기 때문에 가능)
		
		/*double dNum = 10.0;
		switch(dNum){
		case 10.0:
		}*/
		
		byte bNum = 1; //'a'도 됨(int랑 쌍방향 변환)
		switch(bNum) {
		
		}
	}

}