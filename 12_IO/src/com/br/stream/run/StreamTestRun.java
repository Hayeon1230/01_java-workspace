package com.br.stream.run;

import java.util.Scanner;

import com.br.stream.model.dao.A_FileByteDao;
import com.br.stream.model.dao.B_FileCharDao;
import com.br.stream.model.dao.C_AssistBufferedDao;
import com.br.stream.model.dao.D_AssistObjectDao;

public class StreamTestRun {

	public static void main(String[] args) {
		A_FileByteDao a = new A_FileByteDao();
		//a.fileSave();
		//a.fileRead();
		
		B_FileCharDao b = new B_FileCharDao();
		
		//b.fileSave();
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("파일명(확장자제외) : ");
		String name = sc.nextLine();
		System.out.print("저장시킬 내용 : ");
		String str = sc.nextLine();
		
		b.inputFileSave(str, name);
		*/
		//b.fileRead();
		
		C_AssistBufferedDao c = new C_AssistBufferedDao();
		//c.fileSave();
		//c.fileRead();
		
		D_AssistObjectDao d = new D_AssistObjectDao();
		//d.fileSave();
		d.fileRead();
	}

}
