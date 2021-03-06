package com.day11;

import java.util.Calendar;
import java.util.Scanner;

/*Calendar로 년, 월, 일을 입력받아 100(x)일 후 년월일(요일) 만들기

년도?2016
월?4
일?20
몇일후?100

만 난 날 : 2016년 4월 20일 수요일
100일 후 : 2016년 7월 29일 금요일*/
		
public class Day11assign2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		
		int y, m, d, w, after;
		
		do {
			System.out.println("Type any year: ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.println("Type any month: ");
			m = sc.nextInt();
		}while(m < 1 || m > 12);
		
		do {
			System.out.println("Type any date: ");
			d = sc.nextInt();
		}while(d < 1 || d > 31);//윤달 조건 넣기
		
		do {
			System.out.println("몇일 후?: ");
			after = sc.nextInt();
		}while(after < 1);
		
		//cal.set(y,m-1,d);
		
		w = cal.get(Calendar.DAY_OF_WEEK);
		
//		int[] months = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
//		
//		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
//			
//			months[1] = 29;
//		}
		
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
	
		System.out.println("만난 날: " + y + "년" + m + "월" + d + "일" + week[w-1] + "요일");
		
		cal.add(Calendar.DATE, after);//값을 더함
		
		//더한 값이 저장되어있고 get으로 불러옴
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1; //월(0~11)-> 0값은 쓰지 않으므로 +1
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println(after + "일 후: " + y + "년" + m + "월" + d + "일" + week[w-1] + "요일");
	}

}
