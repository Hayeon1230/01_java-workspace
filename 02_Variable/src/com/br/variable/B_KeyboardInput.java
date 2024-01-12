package com.br.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	public void inputScanner1() {
		
		/*
		 * java.util.Scanner 클래스를 이용해서 
		 * 사용자가 키보드로 입력한 값 읽어들일 수 있음 
		 * 
		 * Scanner 클래스 내의 특정 메소드 호출하기 
		 */
		Scanner sc = new Scanner(System.in); // System.in => 입력된 값을 바이트 단위로 읽어들이겠다.
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// * 사용자가 입력한 값을 "문자열"로 읽어들이는 메소드 ( next(), nextLine() )
		//String name = sc.next(); 		// next() : 공백 이전까지의 값을 읽어들임
		String name = sc.nextLine();	// nextLine() : 공백 포함 모두 읽어들임
		
		System.out.print("당신의 나이는 몇살입니까(숫자만) : ");
		
		// * 사용자가 입력한 값을 "정수값"으로 읽어들이는 메소드 => nextInt()
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까 : ");
		
		// * 사용자가 입력한 값을 "실수값"으로 읽어들이는 메소드 => nextDouble()
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 키는 xxx.x cm입니다.
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm입니다.");
		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); // 사용자가 입력한 숫자값 뽑아지고 엔터는 비워주지 않음
		
		/*
		 * sc.nextLine() : 버퍼에서 '엔터' 이전까지의 모든 값을 가져온 후 '엔터' 비워주는 역할
		 * 그 외의 메소드들 : 버퍼에서 '엔터' 이전까지의 값을 가져온 후 '엔터'를 비워주지 않음
		 */
		
		// 해결방법 : 버퍼에 남아있는 엔터 비워주기
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxxxxx이고 키는 xxx.xcm입니다.
		System.out.println(name + "님은 " 
							+ age + "살이며, 사는 곳은 " 
							+ address + "이고 키는 " 
							+ height + "cm입니다.");
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고 키는 %.1fcm입니다.", name, age, address, height);
		
		/*
		 * * 결론 
		 * sc.nextXXX()메소드 뒤에 sc.nextLine()메소드가 수행되어야될 경우 
		 * 버퍼에 남아있는 '엔터'를 비워주기 위해 
		 * sc.nextXXX() 뒤에 sc.nextLine(); 구문작성 => 버퍼비워짐
		 */
	}
	
	public void inputScanner3() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받을 때 : sc.nextLine()
		// 정수값 입력받을 때 : sc.nextInt()
		// 실수값 입력받을 때 : sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar(); // nextChar()메소드는 없음! 
		char gender = sc.nextLine().charAt(0); 
		/*
		 * 특정문자열.charAt(뽑고자하는인덱스번호) => 문자열로부터 해당 인덱스의 문자값
		 * ** 인덱스 : 0부터 시작
		 */
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
	}
	
	public void charAtTest() {
		
		String fruit = "apple";
		// 단지 출력만 할 목적이라면 변수에 굳이 안담아도됨
		System.out.println( fruit.charAt(4) );
		
		// 여기저기 재사용할 목적이라면 변수에 기록하는걸 권장
		char ch = fruit.charAt(4);
		System.out.println(ch);
		
	}
	
	public void inputProduct() {
		/*
		 * 사용자에게 상품의 
		 * 상품명(String), 브랜드명(String), 가격(int), 
		 * 제조국가(String), 할인율(double),등급(A~D)(char) 
		 * 순으로 입력 받은 후 출력해보자. 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 상품등록화면 ====");
		System.out.println("등록하고자 하는 상품의 정보를 입력하시오");
		
		System.out.print("상품명 : ");
		String productName = sc.nextLine();
		
		System.out.print("브랜드명 : ");
		String brand = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine(); // 버퍼에 남아있는 엔터 제거
		
		System.out.print("제조국가 : ");
		String national = sc.nextLine();
		
		System.out.print("할인율 : ");
		double discountRate = sc.nextDouble();
		
		sc.nextLine(); // 버퍼에 남아있는 엔터 비우기
		
		System.out.print("등급(A~D) : ");
		char grade = sc.nextLine().charAt(0);
		
		System.out.println("\n상품명 : " + productName);
		System.out.println("브랜드명 : " + brand);
		System.out.println("가격 : " + price + "원");
		System.out.println("제조국 : made in " + national);
		System.out.println("할인율 : " + (int)(discountRate * 100) + "%"); 
		System.out.println("등급 : " + grade + "등급");
		
	}
	
	/*
	 * ** 정리 **
	 * 1. 콘솔창에 출력하기위해 : System.out.printxx() 메소드 
	 * 2. 콘솔창에 입력받기위해 : Scanner sc = new Scanner(System.in);
	 * 					  sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble() ...
	 * 
	 * * 주의사항
	 * sc.nextXXX() 메소드 뒤에 sc.nextLine()으로 문자열을 읽어들여야될 경우
	 * 그 전에 sc.nextLine(); 더 써서 버퍼를 비워줘야됨
	 * 
	 * '문자' 값을 입력받기 위해서 sc.nextLine()으로 문자열로 읽어들인 후 
	 * .charAt(0) 이용해서 문자를 추출하는 과정 필요
	 */
	
	
	
	
	
	

}
