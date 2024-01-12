package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.collection.model.vo.Music;

public class A_ListController {

	/*
	 * * List계열의 컬렉션
	 * > 선형자료구조를 가지고 있음 (객체배열과 유사하게 저장 == 순서 유지)
	 * 
	 * - Vector - 동기화 제공(성능 저하)
	 * - ArrayList - 동기화 제공x / 내부적으로 배열을 가지고 있음
	 * - LinkedList - 데이터와 데이터간에 노드로 연결되어있음
	 * 
	 */
	
	// ArrayList
	public void arrayListTest() {
		//별도로 타입을 제한하지 않으면 E가 Object로 설정
		ArrayList /*<Object>*/list = new ArrayList(3); // 크기 지정할 수도 있고 안할 수도 있음
		System.out.println(list/*.toString()*/);
		
		//E (==Element) : 리스트에 담길 데이터(요소, value)
		
		// 1. add(E e) : 리스트 공간 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(10);
		list.add("안녕"); // 장점3 : 여러타입 보관 가능
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		list.add(new Music("잊혀지다", "정키"));
		list.add("끝"); // 장점1 : 지정된 크기보다 더 많이 넣어도 오류 안남
		
		System.out.println(list); // list의 특징 : 순서유지됨(0번 인덱스부터 차곡차곡 담김)
		
		// 2. add(int index, E e) : 직접 인덱스를 지정해서 그 위치에 데이터를 추가시키는 메소드
		list.add(2, new Music("진심이 담긴 노래", "케이시")); // 장점2 : 중간 위치에 데이터 추가시 복잡한 알고리즘을 직접 구현할 필요 없음
		System.out.println(list);
		
		// 3. remove(int index) : 해당 인덱스위치의 데이터 삭제시켜주는 메소드 + 제거된 요소도 반환해줌
		String removeValue = (String)list.remove(1);
		System.out.println("제거된 요소 : " + removeValue);
		System.out.println(list);
		
		// 4. set(int index, E e): 해당 인덱스 위치의 데이터를 새로이 전달된 e로 수정시켜주는 메소드
		list.set(1, new Music("술이 달다", "에픽하이"));
		System.out.println(list);
		
		// 5. get(int index) : E  =>해당 인덱스 위치의 객체를 반환시켜주는 메소드
		Music m = (Music)list.get(4);
		//???String s = (String) list.get(3);
		
		Object o = list.get(4);
		Object oo = list.get(2);
		System.out.println(((Music) o).getTitle()); // Music클래스에 있지, Object클래스에 없음
		System.out.println(list.get(5));
		
		// 변수에 담지 않고 곧바로 출력시에는 굳이 형변환 할 필요 없음
		System.out.println(m);
		//System.out.println(s);
		
		System.out.println(((Music)list.get(2)).getTitle());
		
		System.out.println("==================");
		
		((Music)list.get(2)).setTitle("눈꽃");
		System.out.println(list);
		
		// 6. size() : 리스트의 사이즈 반환시켜주는 메소드
		System.out.println("리스트의 사이즈 : " + list.size());
		System.out.println("리스트의 마지막인덱스 : " + (list.size() - 1));
		
		// 1. for loop문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); // arr[i]
		}
		
		System.out.println("=================");
		
		// 2. 향상된 for문 (for each문)
		for(Object ob : list) { // 변수 = list.get(0); => 변수 = list
			System.out.println(ob);
		}
		System.out.println("=============");
		
		// 7. subList(int index1, int index2) : Lost => 추출해서 새로운 List로 반환
		List sub = list.subList(1, 3); // 1<= <3
		System.out.println(sub);
		System.out.println(list);
		
		System.out.println("================");
		
		// 8. addAll(Collection c) : 컬렉션을 통채로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		// 9. isEmpty() : boolean  => 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		// 10. clear() : 싹 비워주는 메소드
		
		list.clear();
		System.out.println(list);
		
		if(list.isEmpty()) { // 비어있을 경우 
		// if(list == null) { // => 생성이 안되었을 경우임
			System.out.println("조회된 결과가 없습니다.");
		}else { // 비어있지 않을 경우 => 데이터가 담겨는 있음(몇개인진 모름)
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
	}
	public void genericTest() {
		// <Music> 제네릭 설정 함   => E == Music
		ArrayList<Music> list = new ArrayList<>();
		
		list.add(new Music("GoodBye", "박효신"));
		list.add(new Music("이 밤", "양다일"));
		//list.add(10);
		//list.add("끝");
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		list.set(0,  new Music("술이달다", "에픽하이"));
	}
	/*
	 * * 제네릭
	 * - 해당 컬렉션에 저장할 타입을 외부의 사용자에 의해서 지정되는 것
	 * 
	 * * 제네릭 설정한 채로 컬렉션을 사용하는 이유
	 * - 
	 */
	
}
