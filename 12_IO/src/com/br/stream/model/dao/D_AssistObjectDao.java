package com.br.stream.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.br.stream.model.vo.Phone;

public class D_AssistObjectDao {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// 출력할 데이터 (Phone객체)
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("아이폰", 1300000);
		arr[1] = new Phone("갤럭시", 1500000);
		arr[2] = new Phone("플립", 1600000);
		
		// FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도와주는 보조스트림 (ObjectWirter 없음!!)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
			/*
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]); // 직렬화가 되어있지 않으면 NotSerializableException				
			}
			*/
			
			for(Phone p : arr) {
				oos.writeObject(p);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		// FileInputStream : 파일로부터 1바이트 단위로 읽어들일 수 있는 기반스트림
		// ObjectInputStream : 객체 단위로 입력받을 수 있게 도와주는 보조스트림
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 EOFException 예외 발생
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) { // End Of File의 약자
			System.out.println("파일을 다 읽어들였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	


}
