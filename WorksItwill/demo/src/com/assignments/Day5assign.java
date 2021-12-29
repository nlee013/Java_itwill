package com.assignments;

import java.util.Scanner;

public class Day5assign {
	
	public static void main(String[] args) {

		//달력을 기준으로 사용자한테 연, 월, 일 값을 받아서 결과를
		//2021년 12월 27일은 월요일 로 출력.
		//입력값으로 출력값이 요일까지 나오게 만들기
		Scanner sc = new Scanner(System.in);

		int[] dates = {'월', '화', '수', '목', '금', '토', '일'};

		int y, m, date, day;
		
		do {
			System.out.println("Type any year:");
			y = sc.nextInt();
		}while(y < 1);
		
		do {
			System.out.print("Type any month: ");
			m = sc.nextInt();
		}while(m < 1 || m > 12);
		
		do {
			System.out.println("Type any date: ");
			date = sc.nextInt();
		}while(date< 1 || date > 31);
		
		
		for(int i = 0; i < date-1; i++) {
			day = sc.nextInt();
			day += i;
		}
		
		//day = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		
		for(int i = 0; i < dates[date-1]; i++) {
			System.out.printf("%d", i);
		}
		date = 1;
		
		if(date%7 == 0) {
			day = sc.nextInt();
		}
	
		//System.out.println(day +"day");
	}

}
