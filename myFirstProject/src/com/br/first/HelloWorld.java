package com.br.first; // 패키지 선언부예요
// 한줄 주석
/* 
 * 여러줄
 * 주석
 */
public class HelloWorld { // 클래스 시작
	
	//main 메소드(실행용 메소드) : 해당 클래스 실행시 제일 먼저 찾아져서 실행되는 메소드
	/*public static void main(String[] args){}에서 
	 * arg 빼고 다 그대로(오타 없이) 써야 메인 메소드로 인식됨(헤드 부분)
	 */
	public static void main(String[] args) { //main 메소드 시작
		
		/* 화면에 출력하고자 할 경우 => 출력문 작성
		 * System.out.print(출력하고자하는값); =>해당 값 출력만 하고 끝
		 * System.out.println(출력하고자하는값); =>해당 값 출력 후 "한 줄 띄어주는" 역할
		 * System.out.printf(출력하고자하는값); =>
		 */
		System.out.println("안녕하세요");
		System.out.print("잘가세요\nㅋㅋㅋ\n");
		System.out.println("여러분");
	} //main 메소드 끝
	//한 클래스 안에 메인 메소드 하나는 꼭 있어야(실행용 메소드)
	public void method() {
		
	}
} // 클래스 끝
