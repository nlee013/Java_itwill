package com.day6;

public class Test30 {

	public static void main(String[] args) {

		String str = "Seoul Korea"; //String 자료형 같은 클래스
		//index가 만들어짐 : 0123456789
		
		System.out.println(str);
		System.out.println(str.substring(0, 3));//점.을 찍으면 수많은 method가 나옴
		System.out.println(str.substring(6, 8));//일부분만 출력. 언급한 index값 출력.
		System.out.println(str.substring(6)); //끝까지
	}

}
