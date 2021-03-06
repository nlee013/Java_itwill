package com.day9;

//call by value
//-> Stack 영역에 Heap영역으로 data가 넘어감(data가 넘어가서 연산되고 처리되는것)
//call by reference(예시로 들어주신 남녀 썸-> 서로 똑같이 나눠가질수 없어서 같은 남자끼리 상대방 폰번호를 같게 나눔)
//-> 값을 넘길 때 객체의 시작점 주소가 넘어감

class Test{
	
	public int x = 10;
	
	//기본 생성자가 생략되어있음
	
	public void sub(int a) {
		x += a;// x = x + a;
	}
	
}
public class Test44 {

	public static void main(String[] args) {
		
		Test ob = new Test();
		
		//Call by Value
		
		int a = 20;
		
		System.out.println("Sub()Method 실행 전 x: "+ ob.x);//10
		
		ob.sub(a);
		System.out.println("Sub()Method 실행 후 x: "+ ob.x);//30
		
		//Call by reference 
		Test ob1;//조건이 맞아야됨 -> ob1 앞에 같은 자료형이 들어가야됨.
				 //EX) Test라는 class가 ob1앞에 붙어야됨
		ob1 = ob;
		
		System.out.println(ob.x);//30
		System.out.println(ob1.x);//30
		
		ob1.x = 100;
		System.out.println(ob1.x);
		

	}

}
