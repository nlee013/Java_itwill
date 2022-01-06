package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test72 {

	private static final String[] city = {"Seoul", "Busan", "Degu", "Inchon", "Gwangju", "Daejeon", "Woolsan"};

	public static void main(String[] args) {


		//Generic : Collection의 자료형
		Vector<String> v = new Vector<>();
		
		String str;
		
		System.out.println("Vector의 초기 용량: " + v.capacity());//10
		
		for(String s : city) {
			v.add(s);
		}
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("...Data의 갯수: " + v.size());//7
		
		//Revise 수정
		v.set(0, "Seoul");
		v.set(1, "Busan");
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//Insert 삽입
		v.insertElementAt("대한민국", 0);
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Vector의 용량: " + v.capacity());//10
		System.out.println("...Data의 갯수: " + v.size());//8
		
		//index 검색
		int index = v.indexOf("Degu");//"대구"가 있는 곳의 index값을 가져와라
		
		if(index != -1) {
			System.out.println("Success!! " + index);
		}else {
				System.out.println("Fail!! " + index);
		}
		
		//오름차순
		Collections.sort(v);
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//내림차순
		Collections.sort(v, Collections.reverseOrder());; //comparator 기억하기
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Delete 삭제
		v.remove(7);//v.remove("Busan");
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//용량 증가
		for(int i = 1; i <= 20; i++) {
			v.add(Integer.toString(i));//문자(숫자)
		}
		System.out.println();
		System.out.println("Vector의 용량: " + v.capacity());
		System.out.println("...Data의 갯수: " + v.size());
		
		//범위 삭제
		for(int i = 1; i <= 10; i ++) {
			v.remove(5);
		}
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Vector의 용량: " + v.capacity());
		System.out.println("...Data의 갯수: " + v.size());
		System.out.println();
		
		//백터의 쓰지 않는 (미사용)공간 삭제
		v.trimToSize();
		
		System.out.println("Vector의 용량: " + v.capacity());
		System.out.println("...Data의 갯수: " + v.size());
		System.out.println();
		
		//모든 data 삭제(한 번에 모든 데이터 삭제)
		v.clear();
		System.out.println("Vector의 용량: " + v.capacity());
		System.out.println("...Data의 갯수: " + v.size());
		
	}

}
