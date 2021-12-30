package com.day8;

//import java.util.Scanner;

class RectA{
	
	private int w,h;
	
	public RectA() {		
	}
	
	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public void set(int w, int h) {
		
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a) {
		System.out.println("Width: " + w);
		System.out.println("Heigh: " + h);
		System.out.println("Area: " + a);
	}
	
	//method overloading
	public void print(int a, int l) {
		System.out.println("Width: " + w);
		System.out.println("Heigh: " + h);
		System.out.println("Area: " + a);
		System.out.println("Area: " + l);
	}
}

public class Test42 {

	public static void main(String[] args) {

		RectA ob1 = new RectA();
		ob1.set(10, 20);
		
		int a = ob1.area();
		int l = ob1.length();
		
		ob1.print(a);
		ob1.print(a, l);
		
		System.out.println("------------------");
		
		RectA ob2 = new RectA(100,200);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
		
		//Scanner sc = new Scanner(System.in);<-기본 생성자를 안쓴 상태로 오버로딩함
	}

}
