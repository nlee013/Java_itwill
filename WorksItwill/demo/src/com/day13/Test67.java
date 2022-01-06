package com.day13;

//2.내부 클래스 Inner class(Local)
//method 안에 class 만들 수 있음
class Outer2{
	
	static int a = 10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;
		
		class Inner2{//Outer를 객체 생성을 아직 안했기 때문에 public 을 사용하지 않는다
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		}
		Inner2 ob = new Inner2();//method 안에서만 객체 생성 가능
		ob.print();
	}
}
public class Test67 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.write();
	}

}
