package com.day13;

import java.util.List;
import java.util.Vector;

//Collection Framework(방법론)

//배열의 단점
//1) 배열은 크기를 정하면, 변경 불가능. 꼭 초기값이 있어야됨
//2) 미리 크게 잡으면 메모리 낭비가 될 수 있음
//3) 배열 사이에 배열을 삽입 불가능

//List, Vector, Set, Map, Hashtable, TreeSet, HashSet
//자주 사용 : ArrayList, Vector

//List : Interface다.이 interface를 구현하는 ArrayList class, Vector class가 있다
//Vector: 동기화 지원, 
//ArrayList : 동기화 X

//Map : Interface다. Hashtable class, HashSet class가 있다.

public class Test70 {

	private static final String[] city = {"Seoul, Busan, Degu, Inchon, Gwangju, Daejeon, Woolsan"};
	
	public static void main(String[] args) {

		//Vector<E>//기본 deafault 자료형: Object
		//Vector로만 사용하면 Object로 사용하는 것
		Vector v = new Vector<>();
		
		//List l = new Vector<>();이렇게 나중에 사용가능.
		//List는 Interface, Vector는 Interface를 구현하는 class
		v.add("Seoul");//upCast
		v.add(30);//upCast
		v.add('c');//upCast
		
		//String s = v.get(0);//error -> 꺼내올 때 object형태 이므로 downCast를 해야됨
		String s = (String)v.get(0);
		System.out.println(s);
		
		Integer i = (Integer)v.get(1);
		System.out.println(i);
		
		char c = (char)v.get(2);
		System.out.println(c);
	}

}
