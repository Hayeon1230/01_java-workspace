package com.br.mvc.run;

import com.br.mvc.view.MusicMenu;

public class MusicRun {

	/*
	 * MVC패턴 : 각 클래스마다의 역할(데이터담당, 화면담당, 요청처리담당)을 부여해서 작업
	 * 			=> 유지보수에 용이
	 * - M(Model) : 데이터를 담당하는 역할 
	 * 				(데이터들을 담기위한 클래스(vo), 
	 * 				비즈니스로직 처리 담당 클래스(service), 
	 * 				데이터 보관 공간과 접근해서 입출력하는 클래스(dao))
	 * - V(View) : 화면을 담당하는 역할 즉, 사용자에게 보여지는 시각적인 요소
	 * 				( 출력문(print문), 입력(Scanner) )
	 * - C(Controller) : 사용자가 화면을 통해서 보낸 요청을 처리한 후 결과를 돌려주는 역할
	 */
	public static void main(String[] args) {
		
		// 사용자가 보게될 첫화면(메인페이지) 띄워주고
		MusicMenu m = new MusicMenu();
		m.mainMenu();
		
	}

}
