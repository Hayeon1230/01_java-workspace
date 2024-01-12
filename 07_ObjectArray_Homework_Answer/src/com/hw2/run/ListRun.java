package com.hw2.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.hw2.model.vo.Student;

public class ListRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<>();
		
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			list.add(new Student(grade, classroom, name, kor, eng, math));
			
			System.out.print("계속 추가할 겁니까? (y/n) : ");
			if(sc.nextLine().equalsIgnoreCase("n")){
				break;
			}
		}
		
		/*
		for(int i=0; i<list.size(); i++) {
			int sum = list.get(i).getKor() + list.get(i).getMath() + list.get(i).getEng();
			System.out.println(list.get(i).information() + ", 평균 = " + sum / 3);
		}
		*/
		
		for(Student stu : list) {
			int sum = stu.getKor() + stu.getMath() + stu.getEng();
			System.out.println(stu.information() + ", 평균 = " + sum/3);
		}
		
		
	}

}
