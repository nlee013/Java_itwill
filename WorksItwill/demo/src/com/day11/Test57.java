package com.day11;

//Singleton 꼭 기억해두기: static?

class Sing{
	
	private static Sing ob;//static 들어간 변수는 class 변수
	
	public static Sing getInstance() {
		
		if(ob == null)
			ob = new Sing();
		return ob;
	}
	
	
}

public class Test57 {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();//ob1의 주소지
		Sing ob2 = Sing.getInstance();
		
		if(ob1 == ob2)//주소 비교
			System.out.println("동일한 객체...");
		
		//왜 동일한 객체인가?
		
	}

}
