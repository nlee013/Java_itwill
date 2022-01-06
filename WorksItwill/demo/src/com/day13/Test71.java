package com.day13;

import java.util.Iterator;
import java.util.Vector;

public class Test71 {

	private static final String[] city = {"Seoul", "Busan", "Degu", "Inchon", "Gwangju", "Daejeon", "Woolsan"};

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		for(String s : city) {
			
			v.add(s);//add 추가
			
		}
		//v.add(10);//error -> String으로 설정했기에 Integer 값 불가능
		String str;
		
		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);
		
		//for
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		//확장 for
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Iterator(반복자)//java의 interface는 저장소로 많이 사용함
		Iterator<String> it = v.iterator();//data가 많을 수록 더 빨리 출력됨
		
		while(it.hasNext()) {//it의data 있을 때가지 돌려라. 몇개인지 모를 때 while문
			
			str = it.next();//read-> next는 highlight bar 
			System.out.print(str + " ");
		}
	}

}
