package com.day8;

//생성자
//만드는 이유: 1) 객체 생성 2) class 변수 초기화 목적
//1) 객체 생성 -> 메모리 할당을 받을 때 사용을 하고 생성자는 class의 이름과 동일.
//return 값이 없기 때문 property(void 들어가는 자리)가 필요없다
//생성자는 중복정의 (overloading)가 가능.
//생성자 안에서 다른 생성자를 호출 가능
//호출 시, 제일 선두에서만 호출 가능

public class Test41 {
	
	private int x;
	
	public Test41() {//기본 생성자(항상 생략됨)
		
		this(50);//같은 class이름을 쓰지 못하므로 this 사용. 무조건 선두에만 호출가능
		System.out.println("기본 생성자...");
		
		x = 10;
		System.out.println("x: " + x);
	}
	
	//생성자는 중복정의 (overloading)가 가능.
	public Test41(int x) {
		System.out.println("Overloading된 생성자...");
		
		this.x = x;
		System.out.println("x: " + x);

	}
	
	public static void main(String[] args) {

		Test41 ob1 = new Test41(); //-> 기본 생성자에서 가져온 것.
		Test41 ob2 = new Test41(50);
	}

}
