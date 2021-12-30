package com.day8;

class Circle{
	
	private int r; //정보의 은닉화..? (캡슐화) 
					//private에 접근하게 할 방법 : 우회 방법
					
	
	public void setData(int a) {//-> public method를 만들어 접근
								//반환값이 없어 void//받아내는 매개변수 생성 
								//값을 넣는 method로 set을 많이사용
		r = a;
	}
	
	public double area() {
		
		return r*r*3.14;
	}
	
	public void write(double a) {
		
		System.out.println("Radius: " + r);
		System.out.println("Area: " + a);
	}
}

public class Test37 {

	public static void main(String[] args) {
		
		Circle ob = new Circle(); //객체 생성
		
		ob.setData(10);
		double result = ob.area();
		ob.write(result);
		
		ob.setData(100);
		result = ob.area();
		ob.write(result);
		
	}

}
