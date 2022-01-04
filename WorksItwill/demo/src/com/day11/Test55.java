package com.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test55 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		//Calendar no2 = new GregorianCalendar();//자식을 객체 생성해서 올린다 -> upCast(나중에 배움)
	
		//get은 변수의 값을 가져올 때
		//set은 초기화?
		//기울어진 것은 static
		
		now.set(2021,10-1,10);//값을 넣을 때는 set 
		//월은 0월~11월까지 저장되어있음
		//꺼낼 때는 get 10+1.넣을 때는 set 10-1
		
		int y = now.get(Calendar.YEAR);//년
		int m = now.get(Calendar.MONTH)+1; //월(0~11)-> 0값은 쓰지 않으므로 +1
		int d = now.get(Calendar.DATE); //일
		int w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7, 1:일요일) 1부터 반환함
		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
		//잘 안씀 : 달의 마지막 날짜 출력
		int startDay = now.getActualMinimum(Calendar.DATE);//달의 첫 날
		int lastDay = now.getActualMaximum(Calendar.DATE);//달의 마지막 날
		
		System.out.println(startDay + ":" + lastDay);
		
		System.out.printf("%tF\n", now);//2022-01-04
		System.out.printf("%tT\n", now);//11:48:34
		
		System.out.printf("%tF %tT\n", now, now);//옆으로 같이 출력
		System.out.printf("%1$tF %1$tT\n", now);//1$ -> 첫번째 인수를 공용해서 사용하겠다
		
		y = now.get(Calendar.YEAR);//년
		m = now.get(Calendar.MONTH)+1; //월(0~11)-> 0값은 쓰지 않으므로 +1
		d = now.get(Calendar.DATE); //일
		w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7, 1:일요일) 1부터 반환함
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}
}
