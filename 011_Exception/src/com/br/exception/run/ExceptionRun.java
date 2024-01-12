package com.br.exception.run;

import java.io.IOException;

import com.br.exception.controller.CheckedException;
import com.br.exception.controller.UnCheckedException;

public class ExceptionRun {
	/*
	 * * 에러 종류
	 * - 시스템에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로 해결안됨 => 심각한 에러
	 * - 컴파일에러 : 소스코드 문법상 오류 => 빨간줄로 애초에 오류를 알려줌(개발자의 실수)
	 * - 런타임에러 : 코드 상으로 문제가 없는데 프로그램 실행 중에 발생하는 에러(사용자의 실수 또는 개발자가 예측가능한 오류를 처리안해놓음)
	 * 
	 * - 논리 에러: 문법적으로도 문제없고 실행했을대도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것
	 * 
	 * * 컴파일/런타임/논리에러 같은 비교적 덜심각한 (처리가능한) 에러들을 "예외(Exception)"라고 함
	 * 
	 * * 예외처리
	 * - "예외"가 "발생"했을 경우에 대해서 "처리"하는 방법
	 * 
	 * * 예외처리를 하는 목적
	 * - 예외처리를 하지 않고 그대로 예외를 발생시킨다면 프로그램이 비정상적으로 종료됨
	 * 
	 * * 예외처리 방법
	 * 1. try~catch문을 이용(try~with~resource)
	 * 2. throws를 이용(떠넘기기 == 위임하다)
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws IOException{ // main에서 마저도 떠넘기면 JVM이 알아서 처리함
		UnCheckedException u = new UnCheckedException();
		//u.method1();
		//u.method2();
		
		CheckedException c = new CheckedException();
		/*
		try {
			c.method();
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
		}
		*/

	}

}
