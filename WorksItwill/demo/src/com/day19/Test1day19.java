package com.day19;

import java.io.IOException;

//class의 class
//특정 class나 interface의 정보를 검색 할 수 있는 method를 가지고 있다

class Test{
	
	public void write() {
		
		System.out.println("Test...");
	}
}

public class Test1day19 {

	public static void main(String[] args) throws Exception {

		//나중에 DB쓸 때 사용예정
		Class c = Class.forName("com.day19.Test");//package이름을 꼭 써야된다//throws Exception
		//Class<?>->아직 안정했다
		//c안에 모든 정보가 들어갔다
		//forName을 통해 읽어온다
		
		//기억해두기  c.newInstance();
		Object o = c.newInstance();//객체 생성.Object있으면 무조건 downcast생각해라
		
		Test t = (Test)o;//downcast
		t.write();
		//o.write();는 안됌. 부모는 자식꺼를 못쓴다.
		
	}

}
