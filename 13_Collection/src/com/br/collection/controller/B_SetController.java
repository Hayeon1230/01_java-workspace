package com.br.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.br.collection.model.vo.Student;

public class B_SetController {
	
	/*
	 * * Set계열 컬렉션 
	 * - Collection 인터페이스를 상속받음
	 * - 구현체(Set인터페이스를 구현한 클래스) : HashSet, LinkedHashSet, TreeSet
	 * 
	 * - 데이터(value)만 저장 가능
	 * - 순서 유지되지 않음 
	 * - 중복데이터 허용하지 않음
	 * - 데이터를 지칭할 수 있는게 없음  => 특정 데이터 하나만 추출하는거 불가
	 */
	
	public void hashSetTest() {
		
		/*
		 * * HashSet 특징
		 * - 새로운 데이터가 추가 될때 마다 동일객체 있는지 비교함
		 *   > equals메소드로 비교 => true
		 *   > hashCode메소드 각각 호출 => 두개의 hashCode값이 일치하는지
		 *   
		 *   Object클래스의 equals, hashCode => 주소값비교, 주소값가지고 10진수 만들어내거나
		 */
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("반갑습니다.");
		//hs1.add(20); // int => Integer => Object 
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		//hs1.add(20);
		
		/*
		 * String, Integer클래스의 equals, hashCode 오버라이딩 => 실제 담긴 리터럴값 가지고 비교/ 담긴 리터럴값 가지고 10진수 만들어내도록
		 */
		
		System.out.println(hs1); // 순서유지 x, 데이터 중복 허용 x
		
		// 로또번호 
		/*
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		*/
		
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(lotto);
		
		
	}
	
	public void hashSetTest2() {
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("공유", 43, 100));
		hs.add(new Student("홍길동", 24, 60));
		hs.add(new Student("김말똥", 26, 40));
		hs.add(new Student("공유", 43, 100));
		//hs.add(new String("안녕하세요"));
		//hs.add(20);
		
		System.out.println(hs); // 순서유지x 
		
		/*
		 * Student 클래스에 equals, hashCode 메소드가 없다면
		 * => Object 클래스에 있는 메소드 실행 (주소값 가지고 동일객체인지 판별)
		 * => Student 클래스에 오버라이딩 하면됨 (실제 담겨있는 필드값 가지고 비교)
		 */
		
		System.out.println(new Student("강개똥", 20, 80).hashCode());
		System.out.println(new Student("강개똥", 20, 80).hashCode());
		System.out.println(new Student("강개똥", 20, 80).equals(new Student("강개똥", 20, 80)) );
		System.out.println(new Student("강개똥", 20, 80).equals(new String("강개똥")));
	
		//hs.get(1); // 인덱스 개념 없음, get메소드 자체가 정의되어있지 않음 => 한 객체만 뽑아올 수 없음 
		
		System.out.println("=====================");
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근 가능 
		// 1. for문 사용 가능 (단, for loo문 x => for each문만 가능)
		for(Student o : hs) {
			System.out.println(o.getName());
		}
		
		System.out.println("===================");
		
		// 2. Set에 담겨있는 것들을 ArrayList로 옮겨담은 후 반복문 돌려가면 접근
		
		//ArrayList list = new ArrayList();
		//list.addAll(hs);
		
		ArrayList<Student> list = new ArrayList<>(hs);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==================");
		
		// 3. Iterator 반복자 이용해서 순차적으로 접근 
		// * Iterator => 일회성 (즉, 한번 꺼내 쓰면 사라짐)
		Iterator<Student> it = hs.iterator(); // hs에 담겨있는 요소들을 Iterator에 동일하게 담는 과정
		
		while(it.hasNext()) {
			Student o = it.next();
			System.out.println(o);
		}// StringTokenizer 비슷
		
		
		
		//it.next(); // NoSuchElementException
		
		
		
		
		
		
	
	
	}

}
