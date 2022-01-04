package com.day10;

import java.util.GregorianCalendar;

//모든 class의 부모는 object.class는 자료형.
//자바안에서 밑에 있는 class들보다 Object는 가장 큰 자료형이다.
//Class Object is the root of the class hierarchy. Every class has Object as a superclass.
//All objects, including arrays, implement the methods of this class.

class TestA /*extends Object가 생략된 것*/{
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
}

public class Test48 {//object의 method: equals(object) & to string()을 가장 많이 사용

	public static void main(String[] args) {

		//Calendar now = new GregorianCalendar();-> 나중에 interface 개념 알고 난 후 이해될 예정
		
		TestA ob1 = new TestA();
		TestA ob2 = new TestA();
		//ob1과 ob2는 동시에 실행 불가 그래서 write()는 따로 각각 가서 출력
		
		System.out.println("ob1 == ob2: " + (ob1 == ob2));//false
		//주소 서로 비교
		
		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2));//false
		//값이 서로 비교
		//-> equals는 TestA의 부모이고 Object는 equals의 부모이므로 extends Object가 생략됨
		
		System.out.println("ob1: " + ob1);//메모리의 첫 번째 주소-> hash code
		System.out.println("ob2: " + ob2);//메모리 주소
		System.out.println("ob1.toString(): " + ob1.toString());
		//-> 자료형이 무엇이든 그대로 string으로 보여줌
		//toString의 부모도 Object이며, 반환값은 string값

	}

}
