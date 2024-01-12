package com.br.api.run;

import com.br.api.controller.A_MathApiController;
import com.br.api.controller.B_StringApiController;
import com.br.api.controller.C_WrapperApiController;
import com.br.api.controller.D_DateApiController;

public class ApiRun {

	public static void main(String[] args) {
		
		A_MathApiController a = new A_MathApiController();
		//a.mathMethodTest();
		
		B_StringApiController b = new B_StringApiController();
		//b.stringPoolTest();
		//b.immutableTest();
		//b.stringMethodTest();
		//b.stringTokenizerTest();
		
		C_WrapperApiController c = new C_WrapperApiController();
		//c.boxingTest();
		//c.stringToPrimitive();
		
		D_DateApiController d = new D_DateApiController();
		//d.utilDateTest();
		//d.calendarTest1();
		//d.calendarTest2();
		//d.calendarToDate();
		//d.localDateTest();
		//d.localTimeTest();
		//d.localDateTimeTest();
		d.dateToString();
		
	}

}
