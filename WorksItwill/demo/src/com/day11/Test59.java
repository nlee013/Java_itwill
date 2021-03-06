package com.day11;
//중요한 것

//추상 abstract class:
//메모리에 낭비 없이 class와 method를 미리 설계하는 것
//method를 재정의 해서 사용
//abstract class에는 반드시 1개 이상의 abstract method가 있어야됨
//abstract class 안에 일반 method도 생성 가능

abstract class ShapeClass{//추상 class
	
	public abstract void draw(); //추상 method

}

class Circle extends ShapeClass{//추상 method를 상속하면
								//반드시 override 해야됨
	
	@Override
	public void draw() {
		System.out.println("원을 그린다...");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다...");
	}
	
}
class Tri extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");
	}
}

public class Test59 {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
		
		
	}

}
