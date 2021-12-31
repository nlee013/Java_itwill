package com.day8;
//static
//1.new를 사용하지 않아도 알아서 메모리로 올라간다.
//2.객체가 100개 생성 되어도 메모리 공간은 1개만 생성됨

public class Test38 {//왜 class 변수냐면 class 이름 Test38.a로 불러오기 때문
	
	public static int a = 10;//-> class변수 or class method는 class가 loading(실행)되는 순간
							//메모리 할당이 이루어지며 [class 이름, 객체]를 통해 접근가능
							//->new를 통해 메모리 할당 받지 않아도 사용가능.
	
	//객체 생성은 프로그램 안에 포함됨
	
	//instance var or instance method는 new를 통해 메모리 할당을 받아야 사용가능.
	//다른 method 에서는 접근 가능(호출해서 사용가능)
	//class method에서는 접근 불가능(호출 X)
	
	private int b = 20;//->instance 변수
	
	public void write() {//instance method
		
		System.out.println("class variable a: " + a);
		System.out.println("instance variable b: "+ b);
	}
	
	public static void print() {//class method
		
		System.out.println("class variable a: " + a);
		//System.out.println("instance variable b: "+ b);//compile error -> class method에서는 접근 불가능
		
	}
	
	public static void main(String[] args) {//여기에 변수만들면 지역변수
		
		System.out.println("class variable a: " + a); //드러눕는 변수는 static 사용한 변수
		System.out.println("class variable a: " + Test38.a);//10	
		
		//write();
		print();//10
		Test38.print();//10
		
		Test38 ob1 = new Test38();
		
		System.out.println("class variable a: " + ob1.a);
		System.out.println("instance variable b: " + ob1.b); //20
		System.out.println("--------------------");
		
		ob1.print();//노란색 줄은 권장의 의미.
		ob1.write();
		System.out.println("--------------------");
		
		Test38 ob2 = new Test38();
		ob2.a = 100;
		ob2.b = 200;
		ob2.write();
		System.out.println("--------------------");
		
		Test38 ob3 = new Test38();
		ob3.a = 1000;
		ob3.b = 2000;
		ob3.write();
		System.out.println("--------------------");
		
		ob1.write();
		ob2.write();
		ob3.write();
		//이 코드에서 출력값을 보면 class 변수는 메모리 공간을 1개 사용
		//(한 공간에 값을 계속 넣어지므로 덮어진 값이 출력됨) 객체가 그 공간 1개를 공통되게 사용함.
		//instance 변수는 메모리를 다 다르게 쓰므로 값이 다 다르게 출력됨
	}

}
