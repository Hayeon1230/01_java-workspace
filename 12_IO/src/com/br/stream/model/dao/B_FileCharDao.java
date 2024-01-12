package com.br.stream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B_FileCharDao {
	
	/*
	 * "문자 기반 스트림" 
	 * 
	 * - 문자 스트림 : 데이터를 2바이트 단위로 전송하는 통로 
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로 
	 * 
	 * XXXReader : 입력용 스트림 
	 * XXXWriter : 출력용 스트림
	 * 
	 */
	
	// 프로그램 --> 파일 : 출력
	public void fileSave() {
		// FileWriter 
		
		FileWriter fw = null;
		
		try {
			// 1. 스트림객체생성 (통로만들기)
			fw = new FileWriter("b_char.txt"/*, true*/);
			
			// 2. write메소드로 출력
			//    2byte단위로 데이터 전송
			fw.write("안녕하세요!!ㅎㅎ");
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'b', 'c'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			파일의 끝을 만나면 -1 */
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	// 사용자가 입력한 데이터를 파일로 저장하는 메소드 
	public void inputFileSave(String content, String fileName) {
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName + ".txt");
			fw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
