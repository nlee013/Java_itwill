package com.day12;

//Interface
//Abstract class의 일종으로 선언만 하고 정의(내용)이 없다
//변수는 final variable(변수)만 선언가능.
//Interface를 구현하기(class를 상속하기)위해서는 implements 사용
//Interface를 구현(상속)후, interface의 모든 method를 재정의 해야함(강제)
//-> 안 할 시, compile error

//Interface가 다른 interface를 상속 받기 가능.
//-> 이 경우: extends 사용
//구현 할 때는 : implements

//Class는 단일 상속. Interface는 다중상속(여러개 상속) 가능

interface Fruit{

	String Won = "won";//기본 default : public static final 생략
	//final은 항상 초기화
	//final은 첫문자(Won)를 대문자를 보통 쓴다.
	
	int getPrice(); //앞에 public abstract 생략
	
	public String getName();//abstract method
	
	//public void print()->일반 method 만들 수 없음
	
}

//FruitImpl로 상속관계 class 1개 일때 종종 이렇게 이름 만들기
class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "Lemon";
	}
	
	public String getItems() {
		return "Fruits";
	}
	
}
public class Test63 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;//upcast
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems());
		//->부모는 getItems이 없고 자식꺼를 사용못함.
		//내용 없는 (형태만 있는) getItems 도 없기에 error남
	}

}
