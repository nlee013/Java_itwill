package com.day1;

//public(누구나), private(지정) = 접근 지정자
//Test 1 = 첫글자는 영문 대문자 -> 카멜표기법 CustomInfoSer

class Test1 {

	/*
	method : 실행 명령어 -> 누가 사용가능한가 -> public
	main = method의 이름(영문 소문자로 시작함). class = 영문 대문자로 시작
	string = 매개변수
	
	VM = Virtual Machine 가상공간 (interpreter)이 찾는 First method(main)
	Interpreter(Visual Basic, 순서대로 실행함(위부터 아래로)은 Complie 언어(대표적인 것은 C)와 짝임
	java, c# = compile 언어 & interpreter 언어
	*/
	
	//아래 이름이 반드시 변경되면 안됨. 반드시 기본으로 외워두자.
	
	public static void main(String[] args) {

		System.out.println("Hi, my darling");
		
		System.out.println("My love");
		 
		System.out.println("To be continue..");
		
		//\n = enter 한줄 띄기
				System.out.print("Today is my day\n\n");
				System.out.println("Hey");
		
	}
}
