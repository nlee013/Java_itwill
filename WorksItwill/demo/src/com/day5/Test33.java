package com.day5;

import com.day6.Rect;
//정석 : 하나의 file에는 하나의 class 만 들어감
//종종 하나의 file에 두개의 class를 만든다.
public class Test33 {

	public static void main(String[] args) {

		Rect usa = new Rect();
		usa.input();
		
		int aa = usa.area();
		int ll = usa.length();
		
		usa.print(aa, ll);
		
		Rect usa2 = new Rect();
		usa2.input();
		
		int x = usa2.area();
		int y = usa2.length();
		usa2.print(x, y);
		
		//class는 초기값이 null값
		//int는 쓰레기값이 들어가지만 new는 초기값이 들어감
	}

}
