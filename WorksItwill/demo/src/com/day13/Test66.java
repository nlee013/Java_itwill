package com.day13;

//1.(내부)Inner class : class 안에 class가 들어감을 의미

//내부 Inner class를 만들려면 Outer class 객체 생성해야됨.
//Outer을 생성했다고 Inner가 생성된 것이 아니라,
//Inner도 별도로 객체 생성해야됨
//Inner 객체만 생성 불가능

class Outer1{
	
	static int a = 10;//자동 메모리화
	int b = 20;//new가 있어야됨
	
	//class 안에 class 만들 수 있음 -> 나중에 종종 사용
	public class Inner1{//내부 class
		
		int c = 30;//변수 선언 가능
		
		public void write() {//method 선언 가능 -> outer의 method
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	public void print() {	
		Inner1 ob = new Inner1();
		//Inner 객체 생성했으니까 아래 ob.write(); 작성가능
		ob.write();
	}
}

public class Test66 {

	public static void main(String[] args) {
		
		//여기서 Outer 객체 생성 했기 때문에 Inner 실행 가능
		Outer1 out = new Outer1();
		//Outer1 out = new Outer1();를 만들었다는 전제 하에 아래 코드 생성
		out.print();
		
		//눈도장만 찍기. 밑에 외우지 않아도 됨 (다이렉트로 생성하는 법)
		//Outer1 out = new Outer1();를 만들었다는 전제 하에  out.new Inner1(); 객체 생성
		Outer1.Inner1 in = out.new Inner1();
		in.write();
	}

}
