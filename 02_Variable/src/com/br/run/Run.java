package com.br.run;

/*
import com.br.variable.A_Variable;
import com.br.variable.B_KeyboardInput;
import com.br.variable.C_Cast;
*/

import com.br.variable.*;

public class Run {
	
	public static void main(String[] args) {
		// A_Variable의 printValue호출
		A_Variable a = new A_Variable();
		//a.printValue();
		//a.declareVariable();
		//a.constant();
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		//b.inputScanner2();
		//b.inputScanner3();
		//b.charAtTest();
		//b.inputProduct();
		
		C_Cast c = new C_Cast();
		//c.autoCasting();
		//c.forceCasting();
		
		D_Printf d = new D_Printf();
		d.printfTest();
	}

}
