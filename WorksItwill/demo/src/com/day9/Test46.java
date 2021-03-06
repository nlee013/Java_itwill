package com.day9;

//constructor 생성자 property error는 method 문제
class TestC{
	
	private String title;
	protected int area;
	
	public TestC(String title) {//overloading된 생성자를 만듦.기본생성자가 없기에 기본생성자는 사용안함
		this.title = title;
	}
	public void print() {
		System.out.println("title: " + area);
	}
}

class RectC extends TestC{
	private int w, h;
	
	public RectC(int w, int h) {
		super("Square"); //super는 1개만 호출가능. 맨위에만 작성(먼저 호출되어야함)
						//super는 원래 생략되어있음.super는 숨겨져있는 생성자.
						 //TestC라는 부모
		
		//->super("Square"); 이 없으면 기본 생성자가 있어야됨
		//super는 원래 기본 생성자, overloading과 상관없이 항상 생략되어있음.
		//super는 부모 생성자(부모 class)를 의미함
		
		//그러므로 super는 부모 생성자이므로
		//기본 생성자 사용 O, overloading 사용 X -> super(); 사용
		//기본 생성자 사용 X, overloading 사용 O -> super(자료형); 사용 O
		//super(부모 생성자)안에 들어간 내용 출력.
		
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		area = w*h;
	}
}

public class Test46 {

	public static void main(String[] args) {
		
		RectC ob = new RectC(10, 20);
		ob.rectArea();
		ob.print();
		
	}

}
