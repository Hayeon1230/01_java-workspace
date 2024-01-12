package com.br.api.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class D_DateApiController {
	
	/*
	 * Date, Calendar, LocalDate, LocalTime, LocalDateTime, Timestamp
	 */
	public void utilDateTest() {
		/*
		 * * Date(java.util)
		 * - 날짜 및 시간에 대한 값을 담을 수 있는 객체
		 * - 자바 초창기에 개발되서 다국적으로 쓰기에 적합하지 않음 
		 *   대부분 deprecated 되어있음
		 */
		
		Date date1 = new Date(); // 기본생성자로 생성 (현재 날짜 및 시간)
		System.out.println(date1/*.toString()*/);
		
		// 내가 원하는 날짜 및 시간으로 세팅하려면
		// 2022년 5월 4일로 세팅
		// 1. setter메소드 
		date1.setYear(2022 - 1900);
		date1.setMonth(5 - 1);
		date1.setDate(4);
		
		System.out.println(date1);
		
		// 2. 매개변수 생성자로 생성
		Date date2 = new Date(2022-1900, 5-1, 4, 16, 10, 30);
		System.out.println(date2);
		
		// get~ 메소드
		System.out.println(date2.getYear() + 1900);
		System.out.println(date2.getMonth() + 1);
		System.out.println(date2.getDate());
		System.out.println(date2.getDay());
		
	}
	
	//public void calendarTest1() {
	public static void main(String[] args) {
		/*
		 * 국가별, 시간대별로 정확히 알수있도록 제공 => java.util.Calendar
		 */
		
		//Calendar cal = new Calendar(); // abstract 클래스라서 생성 불가
		/*
		 * Calendar를 상속받는 GregorianCalendar 클래스 객체가 필요함 (우리나라)
		 */
		
		//Calendar cal = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // 월은 1월(0),2월(1), ..
		int date = cal.get(Calendar.DATE);
		int ampm = cal.get(Calendar.AM_PM); // AM이면 0 / PM이면 1
		int hour12 = cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s %d(%d)시 %d분 %d초\n"
							, year, month, date
							, ampm==0 ? "오전" : "오후"
							, hour12, hour24, min, sec);
		
	}
	
	public void calendarTest2() {
		// 내가 원하는 날짜 및 시간으로 설정
		
		// 방법1. 현재 날짜 및 시간으로 생성 한 후 set으로 수정
		Calendar date1 = Calendar.getInstance();
		// 2024년 6월 11일
		date1.set(Calendar.YEAR, 2024);
		date1.set(Calendar.MONTH, Calendar.JUNE);
		date1.set(Calendar.DATE, 11);
		date1.set(Calendar.HOUR_OF_DAY, 18);
		
		// 방법2. 생성할때 세팅
		date1 = new GregorianCalendar(2024, 6-1, 11, 15, 30, 10);
		
		System.out.printf("%d/%d/%d %d(%d):%d:%d\n"
							, date1.get(Calendar.YEAR)
							, date1.get(Calendar.MONTH)+1
							, date1.get(Calendar.DATE)
							, date1.get(Calendar.HOUR)
							, date1.get(Calendar.HOUR_OF_DAY)
							, date1.get(Calendar.MINUTE)
							, date1.get(Calendar.SECOND));
	
	}
	
	public void calendarToDate() {
		// java.util.Calendar객체 => java.util.Date객체
		
		Calendar cal = new GregorianCalendar(2024, 6-1, 11);
		System.out.println(cal);
		System.out.println(cal.getTimeInMillis());
		
		Date date = new Date(cal.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(2024, 3-1, 1).getTimeInMillis());
		
	}
	
	// java8이상
	// LocalDate, LocalTime, LocalDateTime
	public void localDateTest() {
		
		// static 메소드인 now호출시켜서 생성
		//LocalDate date = LocalDate.now(); // 현재날짜
		
		// 날짜 지정 (of메소드)
		LocalDate date = LocalDate.of(2024, 6, 11);	
		
		System.out.println(date); // 네자리년도-두자리월-두자리일
		
		System.out.println(date.getYear()); // 년도
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		
	}
	
	public void localTimeTest() {
		
		//LocalTime time = LocalTime.now(); // 현재시간
		
		// 시간 지정 
		LocalTime time = LocalTime.of(13, 35, 20);
		
		System.out.println(time);
		System.out.println(time.toString().substring(0, 8));
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
	}
	
	public void localDateTimeTest() {
		// LocalDate + LocalTime => LocalDateTime
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); // 년-월-일T시:분:초.나노초
		
		// LocalDate 의 getXXX메소드 이용가능
		// LocalTime 의 getXXX메소드 이용가능
		
		LocalDateTime dateTime2 = LocalDateTime.of(2024, 6, 11, 12, 30, 5);
		System.out.println(dateTime2.toString().replace("T", " "));
		
	}
	
	// ** 날짜 및 시간에 대한 객체를 내가 원하는 형식의 문자열로 처리
	public void dateToString() {
		// java.text.SimpleDateFormat
		
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는출력형식(포맷)");
		 * sdf.format(날짜객체) : String 
		 * 
		 * y : 년
		 * M : 월
		 * d : 일
		 * E : 요일
		 * h : 시(12시간형식)
		 * H : 시(24시간형식)
		 * m : 분
		 * s : 초
		 */
		
		// 2024년 01월 04일 15:31:30
		// 1. java.util.Date 객체가지고 반영
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E hh:mm:ss");
		String dateStr = sdf.format(new Date());
		System.out.println(dateStr);
		
		// 2. java.util.Calendar 반영
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		
		// > Calendar 객체는 바로 전달하면 안됨
		//String calStr = sdf.format(Calendar.getInstance());
		String calStr = sdf.format(Calendar.getInstance().getTimeInMillis()); // 밀리세컨초로 변환 
		System.out.println(calStr);
		
		
		
		
		
	}

}
