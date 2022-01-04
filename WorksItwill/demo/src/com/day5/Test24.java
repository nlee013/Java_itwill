package com.day5;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {

		//만년 달력 만들기 -> 연도와 월을 입력시 달력 형태로 출력.
		
		//사용자에게 연도와 월을 받을 것 ->scanner
		
		Scanner sc = new Scanner(System.in);
		
//		int[] months = new int[12];
		
//		months[0] = 31;
//		months[1] = 28;
//		... 12개 만들면 되지만, 간단한 다른 방법도 아래에 있음
		
		//월별 날짜수를 배열에 저장
		int[] months = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		
		int y, m, d, w, i; //year month day week int i
		
		do {
			//사용자가 어떤 숫자를 입력할지 모르므로 do while문 쓰기
			
			System.out.println("Type any year: "); //2021
			y = sc.nextInt();
			
		}while(y < 1); //1보다 작은 값이 없음
		
		do {
			System.out.print("Type any month: ");
			m = sc.nextInt();
			
		}while(m < 1 || m > 12);
		
		//윤년으로 인한 2월달의 날 수(일) day
		
		if(y%4 == 0 && y%100 != 0 || y%400 == 0) {
			
			months[1] = 29; //윤년일 경우 28->29로 바꿈
		}
		
		//1년 1월 1일 ~ 사용자가 입력한 (y-1)년 12월 31일까지의 날수를 구하기
		//% 나누기 -> 빼기 -, || -> 더하기 +
		
		d = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		/*
		int yy = (y-1)/4 - (y-1)/100 + (y-1)/400;
		System.out.println(d);
		System.out.println(yy);
	
		//배열의 index	 0	 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11
		//배열 : 		{31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		//월   :		 1	 2	 3	 4	 5	 6	 7	 8	 9	 10	 11	 12
		*/
		
		//(m-1)월 말일까지의 날수
		for(i = 0; i< m-1; i++) { //숫자 누적은 += 로 표기
			d += months[i];
		}
		
		d += 1; //y년 m월 1일
		
		//주 횟수 계산 (7로 나누기)
		w = d%7;
		
		//System.out.println(w); //나오는 것을 확인하기 위해 쓴 것이로 코딩할 때는 잠시 주석 처리
		
		System.out.println("\n  Mon  Tus  Wed  Thu  Fri  Sat  Sun");
		System.out.println("---------------------------------------");

		for(i = 0; i < w; i++) {
			System.out.print("     "); //5칸
		}
		
		//m-1 -> 만약 3월을 넣고 싶으면 3-1 = 2 -> index값이 2이다.
		
		for(i = 1; i <= months[m-1]; i++) {
			 
			//자릿값을 만들 때 문자는 왼쪽. 숫자는 오른쪽 정렬됨
			System.out.printf("%5d", i); //5칸
			
			//한 주에 날짜가 출력 시, 줄 바꿈
			w++;
			
			if(w%7 == 0) {
				System.out.println();
			}
		}
		
		if(w%7 != 0) {
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}
}
