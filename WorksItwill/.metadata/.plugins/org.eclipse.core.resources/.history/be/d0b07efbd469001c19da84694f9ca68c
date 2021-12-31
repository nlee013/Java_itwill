package com.day8;

class Rect{
	
	private int w, h;//변수는 무조건 private로 생성하고 생각해라

	public void set(int w, int h) {
		
		this.w = w;
		this.h = h;
	}
		 
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w*h)*2;
	}
	//method 중복 정의 (Overload/Overloading)
	//1개의 class 안에서 비슷한 역할을 하는 method의 이름은
	//통일시키는 작업으로 메소드의 이름은 동일하지만
	//괄호 속의 인수(매개변수)의 갯수나 인수의 자료형을 다르게 주면
	//각각 다른 메소드로 인식을 한다

	public void print(int a, double l) {
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
		System.out.println("Area: " + a);
		System.out.println("Length: " + l);
	}

	public void print() {
	
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
	}

	public void print(int a) {
	
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
		System.out.println("Area: " + a);

	}

	public void print (double l) {
	
		System.out.println("Width: " + w);
		System.out.println("Height: " + h);
		System.out.println("Length: " + l);

	}
}
public class Test40 {

	public static void main(String[] args) {

		Rect ob = new Rect();
		
		ob.set(10, 20);
		
		int a = ob.area();
		double l = ob.length();
		
		ob.print();
		ob.print(a);
		ob.print(l);
		ob.print(a, l);
		
		String str;
		
	}
	
 }


