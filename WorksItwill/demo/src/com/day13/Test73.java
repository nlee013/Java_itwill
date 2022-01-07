package com.day13;

import java.util.Vector;

class Test{
	String name;
	int age;
}

public class Test73 {

	public static void main(String[] args) {

		//배열안에 class 들어갈 수 있음.
		Vector<Test> v = new Vector<>();
		
		//Test ob = new Test();
		Test ob;//Test는 class니까 초기값 null
		ob = new Test();
		ob.name = "suzi";
		ob.age = 27;
		v.add(ob);//ob를 v(vector)에 넣음
		
		//Test ob1 = new Test();
		ob = new Test();
		ob.name = "Inna";
		ob.age = 41;
		v.add(ob);
	
		for(Test t : v)
			System.out.println(t.name + ":" + t.age);
	}
}
