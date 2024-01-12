package com.br.stream.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C_AssistBufferedDao {
	
	/*
	 * * 보조스트림 
	 * - 기반스트림의 성능 향상 (속도 향상, 추가적인 메소드 제공)
	 * - 단독으로 생성해서 사용할 수 없음 
	 * 
	 * * FileInputStream(기반) + BufferedInputStream(보조)
	 *   FileReader(기반)      + BufferedReader(보조)
	 *   FileWriter(기반)      + BufferedWriter(보조)
	 *   
	 */
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일과 직접적으로 연결해서 2바이트 단위의 데이터를 출력할 수 있는 스트림
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도 향상)
		
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write메소드로 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 줄바꿈 출력해주는 메소드 (BufferedWriter에서 제공)
			bw.write("어서오세요");
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도 향상
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/*
		 * try~with~resource 자원반납 자동으로 해주는 구문
		 * > jdk7버전이상부터 사용 가능 
		 * 
		 * try(try블럭내에서 사용할 스트림객체 생성 구문; 스트림객체 생성 구문; 스트림객체 생성 구문) { // try가 다 끝나면 자동으로 반납까지 해줌
		 * 
		 * } catch(예외클래스 변수) {
		 * 
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("어서오세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <-- 파일 (입력) 
	public void fileRead() {
		
		// FileReader : 파일과 연결해서 2바이트 단위로 데이터를 읽어들일 수 있는 기반스트림
		// BufferedReader : 속도 향상에 도움이 되는 보조스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			System.out.println(br.readLine()); // 파일의 끝을 만나면 null을 반환
			System.out.println(br.readLine());
			*/
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
