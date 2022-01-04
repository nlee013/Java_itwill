package com.day10;

import org.omg.Messaging.SyncScopeHelper;

//String을 도와주는 Class 2개 : StringBuffer, StringBuilder-> java.lang에 있음


public class Test50 {

	public void stringTime() {
		
		System.out.println("String test...");
		
		//long start = System.currentTimeMillis(); //<- 스탑워치 종류 2가지 중 하나 
		long start = System.nanoTime();//<- 좀 더 상세히 시간 값을 나눔
		//System.out.println(start); //확인용
		
		//long -> 정수형 중 가장 큰 값
		
		String str = "A";
		
		for(int i = 1; i <= 50000; i++) {
			str += "A";
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end-start));
	}
	
	public void stringBufferTime() {
	
		System.out.println("String test...");
		
		long start = System.nanoTime();//<- 좀 더 상세히 시간 값을 나눔
		
		StringBuffer str = new StringBuffer("A");//일반 class이므로 이렇게 작성하며,
												 //class이름은 안에 작성
		
		for(int i = 1; i <= 50000; i++) {
			str.append("A");
			//하나의 method안에 method 호출 : overloading
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end-start));
		
	}
	
	
	public void stringBuilderTime() {
		
		System.out.println("String test...");
		
		long start = System.nanoTime();
		
		StringBuilder str = new StringBuilder("A");
		
		for(int i = 1; i <= 50000; i++) {
			str.append("A");
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행 시간: " + (end-start));
	}
	public static void main(String[] args) {
		
		Test50 ob = new Test50();
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
	}

}
