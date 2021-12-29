package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test10 {

	public static void main(String[] args) throws IOException{
		
		//제어문, 반복문
		//if, for, while, do~while, switch
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numb;
		//아래처럼 쓰면 str에 쓰레기값이라고 인식해서 위에 선언할 때 null값을 넣어줘야됨
		//String str;
		//초기화 값 -> null 값
		String str = ""; 
		
		System.out.print("Type numbers");
		numb = Integer.parseInt(br.readLine());
		
		/*
		//등호 사용시 true 또는 false값이 나옴
		if(numb%2 == 0) {
			str = "even number";	
		}
		
		//!= 0 와 == 1과 같지만 != 0을 주로 씀
		if(numb%2 != 0) {
			str = "odd number";
		}
		
		//위 코든대로 쓰면 str에 쓰레기값이라고 인식해서 위에 선언할 때 null값을 넣어줘야됨
		System.out.println(numb + ":" + str); 
		*/
		
		//중가로{} 없어도 가능이지만, 조건이 하나일 때만 가능하다. 작업이 여러줄일 경우 무조건 중가로 사용.
		if(numb%2 == 0) {
			str = "even number";
		}
		else {
			str = "odd number";
		}
		
		System.out.println(numb + ":" + str);
	}

}
