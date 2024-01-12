package com.br.api.controller;

import java.util.StringTokenizer;

public class B_StringApiController {
	
	/*
	 * 자바에서의 문자열을 관리하는 클래스로 총 세가지 있음
	 * 
	 * * String
	 * - 클래스지만 기본자료형 처럼 쓸수 있는 것 -> ""로 바로 리터럴값 제시 가능
	 * - 불변클래스 (수정이 불가능함)
	 * 
	 * * StringBuilder, StringBuffer
	 * - 클래스 사용방식으로 쓸 수 있는 것 -> new로 객체 생성한 후 사용
	 * - 가변클래스 (수정이 가능함)
	 */
	
	public void stringPoolTest() { // 상수풀(String Pool)의 개념
		
		// 1. String 사용시 생성자를 통해서 문자열사용
		String newStr1 = new String("hello");
		String newStr2 = new String("hello");
		
		System.out.println(newStr1);
		System.out.println(newStr2);
		// String클래스에 toString메소드 이미 오버라이딩 되어있음 (실제 담긴 문자열값 반환)
		
		System.out.println(newStr1 == newStr2); // false (주소값 비교라서)
		System.out.println(newStr1.equals(newStr2));
		// String클래스에 equals메소드 이미 오버라이딩 되어있음 (주소값 비교가 아닌 실제 담긴 문자열가지고 비교)
		
		System.out.println(newStr1.hashCode());
		System.out.println(newStr2.hashCode());
		// String클래스에 hashCode메소드 이미 오버라이딩 되어있음 (주소값이 아닌 실제 담긴 문자열가지고 숫자 만듬)
		
		// System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(newStr1));
		System.out.println(System.identityHashCode(newStr2));
		
		System.out.println("==================");
		
		// 2. 문자열을 리터럴값으로 사용
		String str1 = "hello";
		String str2 = "hello";
		
		// 리터럴 제시시 상수풀(String pool) 영역에 올라감
		// String pool 특징 : 동일한 문자열이 기록될 수 없음
		System.out.println(str1 == str2); // true (주소값 일치)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	public void immutableTest() { // 불변 가변 테스트 
		
		// String 클래스가 불변인 이유 
		String str = "반가워!";
		System.out.println(System.identityHashCode(str));
		
		// 수정시도
		str += "난 String이야"; // str = str + "난 String이야";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// 주소값 달라짐 
		// 기존의 자리에서 수정되는게 아니라 매번 새로운곳이 참조되게끔 변경 
		// => 불변 클래스
		
		System.out.println("=============");
		
		// StringBuilder/StringBuffer 가변인 이유 
		// 객체 생성시 16개의 문자들을 저장할 수 있는 버퍼 내부적으로 생성 
		StringBuilder sb = new StringBuilder("반가워!"); // 값을 바로 담으면서 생성 16 + 글자
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("sb : " + sb/*.toString()*/);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("------------------");
		
		// 1. append(String str) : StringBuilder 
		//    기존의 문자열에 새로운 문자열 추가시키고자 할 때 
		sb.append("안녕!");
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		// 주소값 변동 없음 == 그 자리에서 문자열 변경 == 가변
		
		System.out.println("----------------");
		// 2. delete(int start, int end) : StringBuilder 
		//    문자열 일부 삭제시켜주는 메소드 (start <=  < end)
		sb.delete(3, 5); // !  녕
		
		System.out.println("변경 후 sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		
		System.out.println("-------------------");
		
		// 3. insert(int offset, String str) : StringBuilder 
		//    기존의 문자열 사이의 또다른 문자열을 추가시켜주는 메소드
		sb.insert(1, "ㅎㅎㅎ");
		
		System.out.println("변경 후 sb : " + sb);
		
		System.out.println("-------------------");
		
		// 4. reverse() : StringBuilder
		//    기존의 문자열을 역으로 바꿔주는 메소드
		sb.reverse();
		
		System.out.println("변경 후 sb : " + sb);
		
		System.out.println("------------------");
		
		// 메소드 체이닝 == 연이어서 메소드 호출
		sb.append("ㅋㅋㅋ")
		  .delete(0, 4)
		  .reverse()
		  .insert(2, "ㄱㄱㄱ");
		
		System.out.println("변경 후 sb : " + sb);
		
		/*
		 *  * String 클래스 == 불변클래스 (그 자리에서 변경이 불가)
		 *    => 빈번하게 값을 변경할 경우 GC(가비지컬렉터)가 기존의 값들을 지워줘야되는 단점
		 *    => 변경이 적고 한번 담아두고 단지 조회만 할 경우 String 클래스가 용이
		 *  
		 *  * StringBuilder, StringBuffer == 가변클래스 (그 자리에서 값이 변경됨)
		 *    => 변경이 잦을 경우 이 클래스들을 이용하는게 좋음 (주소값이 변경x)
		 *    => 단, 객체생성 후에 메소드 호출하면서 값을 변경해야됨 
		 *    
		 *    => 두 클래스의 유일한 차이점은 동기화가 되냐 안되냐 (속도 차이)
		 *       > StringBuilder = 동기화 제공 x => 속도가 빠름
		 *       > StringBuffer = 동기화 제공 o => 속도가 느림 
		 *    
		 *    	- 멀티스레드 환경 (여러개의 일처리를 병행해서 동시다발적으로 수행하는 환경) => 동기화 처리가 되는걸 사용하는 안전 => StringBuffer권장
		 *      - 단일스레드 환경 (한번에 하나의 일만 처리하는 환경) => 동기화 작업을 하게 되면 속도 저하가 발생 될 수 있음 => StringBuilder권장
		 */
	}
	
	public void stringMethodTest() { // String 클래스의 유용한 메소드
		
		String str1 = "Hello World";
		
		// 1. 문자열.charAt(int index) : char
		//    문자열에서 전달된 index위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//    문자열과 전달된 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!"); // += 과 동일
		System.out.println("str2 : " + str2);
		
		String str3 = str1.concat("^^").concat("!!");
		System.out.println("str3 : " + str3);
		
		// 3. 문자열.contains(CharSequence s) : boolean
		//    문자열에 전달된 문자열이 포함되어있으면 true 아니면 false반환
		//    CharSequence 는 String의 부모인터페이스
		System.out.println("str1에 Hello가 포함되어있습니까 : " + str1.contains("Hello"));
		System.out.println("str1에 Bye가 포함되어있습니까 : " + str1.contains("Bye"));
		
		// 4. 문자열.equalsIgnoreCase(String str) : boolean
		//	  문자열에 전달된 문자열이 일치하는지 대소문자 가리지 않고 비교
		System.out.println("str1이 hello world 입니까 : " + str1.equalsIgnoreCase("hello world"));
		/*
		System.out.println("게임을 종료하시겠습니까(y/n): ");
		String str = sc.nextLine();
		
		if(str.equalsIgnoreCase("y")) {
			
		}*/
		
		// 5. 문자열.substring(int beginIndex) : String => 문자열의 beginIndex위치에서부터 끝까지의 문자열을 추출해서 반환
		//    문자열.substring(int beginIndex, int endIndex) : String => 문자열의 beginIndex위치에서부터 endIndex "전"까지의 문자열을 추출해서 반환
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 4)); // 0 <=  < 4
		
		// 6. 문자열.replace(char oldChar, char newChar) : String
		//	  문자열에서의 oldChar문자들을 newChar로 변환한 새 문자열 리턴
		// 공공데이터 같은거 갖다쓸 때 생각보다 많이 쓰임 ,를 공백으로 바꾼다거나
		System.out.println(str1.replace("l",  "c")); // 변경내용 영구적으로 쓰려면 다른 변수에 담아야
		System.out.println(str1);
		
		// 7. 문자열.toUpperCase() : String => 다 대문자로 변경한 새 문자열 리턴
		//	  문자열.toLowerCase() : String => 다 소문자로 변경한 새 문자열 리턴
		String str4 = str1.toUpperCase();
		System.out.println("str4 : " + str4);
		System.out.println("str4를 다 소문자로 : " + str4.toLowerCase());
		
		// 8. 문자열.trim() : String
		//	  문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
		String str5 = "     JA  VA     ";
		System.out.println("trim 결과 : " + str5.trim()); // 사이 공백은 살아있음
		System.out.println("replace : " + str5.replace(" ",""));
		
		// 9. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println("배열의 길이 : " + arr.length);
		System.out.println("0번 인덱스 : " + arr[0]);
		
		// 10. static valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
		// 11. 문자열.indexOf(String str) : int
		//	   문자열.lastIndexOf(String str) : int
		System.out.println("str1에 앞에서부터의 첫 l의 위치" + str1.indexOf("l"));
		System.out.println("str1에 뒤에서부터의 첫 l의 위치" + str1.lastIndexOf("l"));
		System.out.println("str1에 앞에서부터의 첫 a의 위치" + str1.indexOf("a")); // 존재하지 않을 경우 -1반환
		
		// 12. 문자열.isBlank() : boolean
		//	   문자열.isEmpty() : boolean
		//	   => 해당 문자열이 빈값인지를 확인해주는 메소드
		System.out.println("ABC".isBlank());
		System.out.println("".isBlank());
		System.out.println("  ".isBlank());
		// - isBkank() : 빈문자열이든 공백문자열이든 다 빈값으로 인식
		System.out.println("ABC".isEmpty());
		System.out.println("".isEmpty());
		System.out.println("  ".isEmpty());
		// - isEmpty() : 빈문자열은 빈값으로 인식하되, 공백은 실제 값으로 인식
		
	}
	
	public void stringTokenizerTest() {
		
		// 구분자를 기준으로 해서 문자열들을 분리시키는 방법
		
		String str = "Java,Oracle,JDBC,HTML,CSS";
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담아두고자 할 때
		//		String클래스에 제공하는 split메소드 이용
		//		문자열.split(구분자) : String[]
		String[] arr = str.split(",");
		System.out.println("배열의 길이 : " + arr.length);
		
		//for(int i=0; i<arr.length; i++) {
		for(String s: arr) {
			//System.out.println(arr[i]);
			System.out.println(s);
		}
		
		// 방법2. 분리된 문자열들을 토큰으로 관리하는 방법
		//		java.util.StringTokenizer 클래스를 이용하는 방법
		//		StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str,",");
		System.out.println("토큰의 갯수(==분리된문자열갯수) : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		// 아예 뽑아오는 것 -> 5개 다 뽑아오면, stn에 남은 토큰이 없을 것
		System.out.println("현재 토큰 갯수 : " + stn.countTokens());
		System.out.println(stn.nextToken()); // 더 뽑을게 없어서 오류
		*/
		
		/*
		 *  i=0 i<5 stn.nextToken() => Java
		 *  i=1 i<4 stn.nextToken() => Oracle
		 *  i=2 i<3 stn.nextToken() => JDBC
		 *  i=3 i<2 false => 반복종료
		 */
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		/*
		// 해결방법1
		int count = stn.countTokens();
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
	
	
	
	
	
	
	
	

}
