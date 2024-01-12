package com.br.stream.run;

import java.io.File;
import java.io.IOException;

import com.br.stream.model.dao.A_FileByteDao;

public class FileRun {

	public static void main(String[] args) {
		
		// java.io.File
		
		
		try {
			// 1. 경로지정은 하지 않고 파일 생성 => 현재 project폴더안에 만들어짐
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			// 2. 존재하는 폴더에 파일 생성 
			File f2 = new File("D:/sample/test.txt");
			f2.createNewFile();
			
			// 3. 존재하지 않는 폴더에 파일 생성
			/*
			File f3 = new File("D:/temp/test.txt");
			f3.createNewFile();
			*/
			
			// * 폴더 먼저 만들고 파일까지 만들어지게 하기
			File tempFolder = new File("D:/temp");
			tempFolder.mkdir();
			
			File f3 = new File("D:/temp/test.txt");
			f3.createNewFile();
			
			// ------------------------------
			
			File f4 = new File("parent");
			f4.mkdir();
			
			File f5 = new File("parent/person.txt");
			f5.createNewFile();
			
			System.out.println(f4.isFile()); // false
			System.out.println(f5.isFile()); // true
			
			System.out.println("파일명 : " + f5.getName());
			System.out.println("상위폴더 : " + f5.getParent());
			System.out.println("파일용량 : " + f5.length());
			System.out.println("절대경로 : " + f5.getAbsolutePath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램을 종료합니다.");
		
		/*
		 * 프로그램 상의 데이터를 외부매체로 출력하거나 또는 외부매체로부터 입력받아올 수 있음
		 * 반드시 외부매체와의 통로를 먼저 만들어야됨 => 스트림(Stream)
		 * 
		 * * 스트림의 특징
		 * - 단방향 : 입력이면 입력용 스트림 / 출력이면 출력용 스트림 
		 * - 선입선출(FIFO) : 먼저 들어간게 먼저 나온다 => 시간지연(delay)
		 * 
		 * * 스트림의 구분 
		 * > 통로의 사이즈 
		 * - 바이트 스트림 : 1byte짜리만 왔다 갔다 할 수 있는 좁은 통로 => 입력(InputStream) / 출력(OutputStream)
		 * - 문자 스트림 : 2byte짜리 왔다 갔다 할 수 있는 넓은 통로 => 입력(Reader) / 출력(Writer)
		 * 
		 * > 외부매체와 직접 연결하는 유무 
		 * - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로 (필수)
		 * - 보조 스트림 : 기반스트림의 부족한 성능을 보조 역할 하는 통로 
		 * 			   속도향상, 유용한 기능들을 제공하는.. 
		 * 			   보조스트림 단독으로는 사용 불가 (기반스트림은 필수)
		 * 
		 */
		
		// dao(Data Access Object) : 데이터 입출력하는 역할의 클래스 (model.dao)
		
		
	}

}
