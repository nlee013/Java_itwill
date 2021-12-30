package com.day8;

import java.util.Calendar;

public class Test39 {

	public static void main(String[] args) {

//		Data ob = new Data();
//		ob.print();
		
		//Data.print();
		
		Data.getInstance();
		
		//calendar는 똑같은 객체를 가져오기 때문에 static을 사용한다
		Calendar now = Calendar.getInstance();
		
	}

}
