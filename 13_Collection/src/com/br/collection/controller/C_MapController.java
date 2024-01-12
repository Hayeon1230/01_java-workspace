package com.br.collection.controller;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.br.collection.model.vo.Snack;

public class C_MapController {

	/*
	 * * Map계열의 컬렉션
	 * - Collection 인터페이스를 상속받고 있지 않음
	 * - HashMap, Properties
	 * - 키(key)와 데이터(value)를 함게 저장 해야됨
	 *   키 : 각 데이터들을 식별할 수 있는 식별자 (고유해야됨)
	 * - 저장 순서 유지 x(set처럼 보따리같은데 담김)
	 * - 키값은 중복될 수 없음(단, 데이터는 중복될 수 있음)
	 */
	public void hashMapTest() {
		/*제네릭설정하지 않으면 => <Object, Object>*/
		HashMap<String, Snack> hm = new HashMap<>();
		
		// 앞에선 add(E e)
		
		// 1. put(K key, V value) : 컬렉션에 키-밸류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // 저장순서유지x, value값은 중복 허용
		// {키=밸류, 키=밸류, ...}
		
		hm.put("새우깡",new Snack("매운맛",700));
		System.out.println(hm);
		// 동일한 키값으로 다시 추가할 경우 value값이 덮어씌워짐
		
		// 2. get(Object key) : V => 컬렛견에 해당 키값을 가지는 Value값을 반환시켜주는 메소드
		Snack s = /*(Snack)*/hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : 컬렉션안에 담겨있는 객체들의 갯수 반환
		System.out.println("몇개 : " + hm.size());
		
		// 4. replace(K key, V value) => 해당 키값 찾아서 새로 전달한 value값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		System.out.println(hm);
		
		// 5. remove(Object key) : V  => 컬렉션에 해당 키값의 키밸류 세트가 삭제
		Snack removeSnack = /*(Snack)*/hm.remove("포테이토칩"); // 존재하지않는 키값 제시시 => null 반환
		System.out.println(removeSnack);
		System.out.println(hm);
		/*map계열의 컬렉션으로는 for each문 사용 불가
		for(Object snack : hm) {
			
		}
		*/
		
		//ArrayList = new ArrayList(hm);
		
		// Iterator it = hm.iterator(); // List계열 또는 SET 계열의 Collection에서만 사용 가능
		
		//Map  =======> Set ======= >Iterator
		//		.keySet()		.iterator()
		//		.entrySet
	
		// 1. keySet() 이용방법
		// 1_1) hm --> Set 컬렉션
		Set<String> keySet = hm.keySet(); // ["다이제","새우깡", "칸초"]

		// 1_2) keySet --> Iterator (itKey)
		Iterator<String> itKey = keySet.iterator();
		
		// 1_3) 반복문
		while(itKey.hasNext()) {
			String key = /*(String)*/itKey.next();
			Snack value = /*(Snack)*/hm.get(key);
			
			System.out.println(key + "=" + value);
		}
		System.out.println("===============");
		
		//2. entrySet() 이용
		// 2_1) hm ---> Set계열
		Set<Entry<String, Snack>> entrySet = hm.entrySet(); // Entry(다이제=Snack),...
		
		// 2_2) entrySet --> Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 2_3) 반복문
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = /*(Entry)*/itEntry.next(); // key=value
			
			String key = /*(String)*/entry.getKey();
			Snack value = /*(Snack)*/entry.getValue();
			
			System.out.println(key + "=" + value);
		}
	}	
	
	public void propertiesTest1() {
		// properties : Map계열의 컬렉션 => 키+밸류 세트로 저장
		// 주로 키값도 문자열, 밸류값도 문자열로 담고자할때
		// => 키밸류 세트들을 외부 파일로 내보내기 (출력)
		//	  파일에 기록된 키밸류 세트들을 읽어들일때 (입력)
		
		Properties prop = new Properties();
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 700));
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("test.properties"),"propertiesTest");
			// 내부적으로 store메소드 실행시 Properties 에 담겨있는 키+밸류 세트들을 String으로 형변환해서 저장시킴
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 키값도문자열, 밸류값도 문자열로 저장
		// 1. setProperty(String key, String value)
		prop.setProperty("List","ArrayList");
		prop.setProperty("Set","HashSet");
		prop.setProperty("Map","HashMap");
		prop.setProperty("Map","Properties");
		
		System.out.println(prop); // 저장순서유지x, key값 중복시 덮어씌워짐
		
		try {
			// 2. store(출력용스트림, String comments)
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
		
			// 3.storeToXML(OutputStream os, String comments)
			prop.storeToXML(new FileOutputStream("test.xml"),"propertiesTest");
			// XML(Extension Markup Language)
			//markup == <> == tag
			//HTML
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	public void propertiesTest2() {
		Properties prop = new Properties(); // 빈상태
		
		try {
			// 4. load(입력용스트림)
			//prop.load(new FileInputStream("test.properties"));
			
			// loadFromXML(InpuStream)
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop);
		
		// 5. getProperty(String key) : String value
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("list")); // 존재하지 않는 키값 제시시 null반환
	
		/*
		 * * .properies 또는 .xml 파일을 사용하는 경우
		 * - 프로그램상에 필요한 기본 환경설정(서버의 ip주소, db의 경로, 관리자 아이디, 비번, ...)
		 *   해당 파일에 기술된 내용을 읽어들여서 자바에서 사용할거임
		 *   => 단순한 텍스트다보니깐 개발자가 아닌 일반인 관리자가 해당 문서 열어서 수정하기 쉽다.
		 */
		
	}
	
	
	
}
