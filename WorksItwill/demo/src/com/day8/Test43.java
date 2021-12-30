package com.day8;

public class Test43 {
	//method 밖에 쓸 수 있는 코딩은 변수 선언 뿐.꼭 기억하기
	int a = 5; //instance 변수
	
	{//초기화 block
		System.out.println("초기화 블럭 a: " + a); //5
		a = 10;
		
		System.out.println("초기화 블럭 a: " + a);
	}
	
	static int b;
	static {//static 블럭
		b = 10;
		System.out.println("static 블럭 b: " + b);
	}
	//변수: 변하는 수
	//상수: 항상 같은 값. 한 번 값을 넣으면 프로그램을 바꾸기 전까지 안바뀜.
	//		대문자로 시작. 반드시 초기화를 해줘야됨)
	
	final int C;
	
	public Test43() {
		System.out.println("생성자...");
		C = 100;
		System.out.println("C: " + C);
	}
	
	public static void main(String[] args) {
		
		Test43 ob1 = new Test43();
		Test43 ob2 = new Test43();
		
		
	}

}
