package com.day12;

import java.util.Scanner;

interface FruitA{
	
	String Won = "원";
	
	public int getPrice();
	public String getName();

}

interface ItemFruit extends FruitA{
	
	public String getItems();
	
}

//class에 적용시킬 때는 implements
class Orange implements ItemFruit/*, FruitA*/{//여러개 상속가능

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "Orange";
	}

	@Override
	public String getItems() {
		return "Fruits";
	}
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "Apple";
	}

	@Override
	public String getItems() {
		return "Fruits";
	}
	
}


public class Test65 {//여기 문법 중요함

	//똑같은 코딩을 줄일 때 method를 사용한다!!!
	public void packing(ItemFruit ob/* = new Orange()//= new Apple()*/) {
		
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Test65 t = new Test65();
		System.out.print("Choose one of 1) Orange 2) Apple :");
		
		int n = sc.nextInt();
		
		if(n == 1)
			t.packing(new Orange());//나중에 new Orange();만 쓰는경우도 있음
		else if(n == 2)
			t.packing(new Apple());
		
		/*
		//Orange ob1 = new Orange();//객체 생성
		//ItemFruit ob1 = new Orange();//자식의 객체를 생성에서 부모에 넣음->upCast
		ItemFruit ob;
		
		ob = new Orange();//메모리 할당
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
		//Apple ob2 = new Apple();
		//ItemFruit ob2 = new Apple();//upCast
		//ItemFruit ob;
		
		ob = new Apple();
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		*/
	
		/*
		int a = 10; 
		System.out.println(a);//10

		int b = 20;
		System.out.println(b);//20
		
		//위와 같음
		 * 
		int a;
		a = 10;
		System.out.println(a);//10
		
		int b;
		a = 20;
		System.out.println(b); //20
		*/		
		
	}

}
