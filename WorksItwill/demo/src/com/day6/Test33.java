package com.day6;

//Class를 만드는 이유는 재사용성 때문.
//전역변수는 값이 바뀌면 method의 전역변수도 다 바뀜
//instance변수
//return값이 없을 때 void로 표시 -> void는 return값이 필요없음


public class Test33 {

	public static void main(String[] args) {
		//객체 생성
		Rect r1 = new Rect();
		
		r1.input();
		int a = r1.area();
		
		r1.length();
		int l = r1.length();
		
		r1.print(a, l);
	}

}
