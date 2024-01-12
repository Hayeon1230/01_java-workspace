package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ListRun {

	public static void main(String[] args) {

		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee());
		emp.add(new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실"));
		emp.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡"));
		
		for(int i=0; i<emp.size(); i++) {
			System.out.println("emp[" + i + "] : " + emp.get(i).information());
		}
		
		System.out.println("=================================================================");
		
		emp.get(0).setEmpNo(0);
		emp.get(0).setEmpName("김말똥");
		emp.get(0).setDept("영업부");
		emp.get(0).setJob("팀장");
		emp.get(0).setAge(30);
		
		/*
		 * ....
		 * 
		 */
		
		emp.get(1).setDept("기획부");
		emp.get(1).setJob("부장");
		/*
		 * ..
		 */
		System.out.println("0번인덱스 : " + emp.get(0).information());
		System.out.println("1번인덱스 : " + emp.get(1).information());
		
		System.out.println("================================================================");
		
		int sum = 0;
		
		for(int i=0; i<emp.size(); i++) {
			// 현재 접근된 사원의 연봉
			Employee e = emp.get(i);
			int sumSalary = (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint())) * 12;
			
			System.out.println(e.getEmpName() + "의 연봉 : " + sumSalary + "원");
			
			sum += sumSalary;
		}
		
		System.out.println("직원들의 평균 연봉 : " + sum / emp.size());
		
		
		
		
		
		
	}

}
