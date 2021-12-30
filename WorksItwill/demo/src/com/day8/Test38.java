package com.day8;
//static
//1.new를 사용하지 않아도 알아서 메모리로 올라간다.
//2.객체가 100개 생성 되어도 메모리 공간은 1개만 생성됨
//3.
public class Test38 {
	
	public static int a = 10;//-> class변수 or class method. public int a 는 intance 변수
	
	private int b = 20;//->instance 변수
	
	public void write() {//instance method
		
	}
	
	public static void print() {//class method
		
	}
	
	public static void main(String[] args) {//여기에 변수만들면 지역변수

		
	}

}
