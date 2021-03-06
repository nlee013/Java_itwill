package com.day9;
//참고: 변수를 private를 선언함.method는 void가 있는 것.
//class변수는 static으로 선언한 변수.

//상속:부모가 자식한테 주는 것
//<상속 조건>
//1) 부모꺼는 내꺼다
//2) 부모가 private로 선언한 것은 상속 불가능 ex) 예시로 부모님 지갑 속의 돈은 상속 불가능
//3) protected로 선언한 것은 상속 가능.
//4) 내꺼는 내꺼다. 부모가 내꺼 사용 불가능
//5) 부모와 자식이 같은 객체를 가지고 있을 때, 무조건 내꺼 사용

//모든 변수는 모두 private로 선언하고 필요할 때마다 protected로 바꿔서 사용해야된다.

//<상속의 개념 2가지>
//1) 다중상속
//2) 단일상속

class TestB{
	private String title;
	//private int area;
	protected int area; //protected로 선언해 부모가 허락해줘서 상속가능.
						//-> 자식도 사용가능
	
	public void set(String title) {
		
		this.title = title; //초기화
		//this.area = area; //부모가 area를  protected로 받아서 상속가능해서 
						    //set()안과 윗코드, 맨아래  rectArea()안에
							//set("Square", area)의 area가 다 생략 가능해짐
	}
	
	public void print() {//void가 있는 것은 method
		System.out.println(title + ":" + area);
		
	}
}

class RectB extends TestB{//부모와 자식은 내가 결정.
						  //extends를 사용해 Rect는 자식, TestA는 부모.
						  //extends뒤에는 1개만 가능
	private int w, h;
	
	public RectB(int w, int h) {
		//생성자로도 초기화 가능
		//이 class에 이 생성자의 값 int w, int h을 객체 생성하면서
		//new Rect 생성할 때 생성자로RectB(int w, int h) 만든다
		
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		//int a = w*h;
		area =w*h; //부모가 private로 선언한 것은 상속 불가능
		set("Square");//부모꺼는 내꺼이므로 set(title, area)를 사용할 수 있음
	}
	
}

public class Test45 {

	public static void main(String[] args) {
		
		RectB ob = new RectB(10, 20);//초기화?
		ob.rectArea();
		ob.print();//Rect의 부모TestB 의 ob
		
	}

}
