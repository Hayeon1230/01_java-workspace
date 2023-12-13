package com.br.run;
/*
import com.br.variable.A_Variable;
import com.br.variable.B_KeyboardInput;
import com.br.variable.C_Cast;
*/

import com.br.variable.*; // *=모든
public class Run {
	
	public static void main(String[] args) {
		//A_Variable의 printValue 호출
		A_Variable a = new A_Variable();
		//a.printValue();
		//a.declareVariable();
		//a.constant();
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		b.inputScanner2();
		//b.inputScanner3();
		//b.charAtTest();
		//b.inputPriduct();
		C_Cast c = new C_Cast();
		//c.autoCasting();
		//c.forceCasting();
		D_printf d = new D_printf();
		//d.printfTest();
	}
	
}
//실행 단축키 ctrl+F11