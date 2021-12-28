package com.day3;

import java.io.IOException;

public class Test9 {

	public static void main(String[] args) throws IOException {
		
		//자료형 char -> character.  char는 class이며, 기호를 저장함.
		
		//string str = "I"; --> ""는 string에서만 쓰임. 오직 문자를 표현할 때만 사용.
		
//		char ch = 'n'; // 오직  1byte 또는 2byt 한 자만 가능
//		
//		System.out.println(ch);
		
		char ch, result;
		
		System.out.print("Only one character?");// a(97) -> 1byte -> System.in 으로 읽어낼 수 있음
		
		// System.in.read();의 read는 int로 불러오기 때문에 int로 표기해야됨. 강제 형 변환.
		//char는 기호 저장함으로 int로 변환
		//예외 처리 쓰기  -> throws IOException
		
		ch = (char) System.in.read(); //97 return 정수로 int로 넣어야되어서 char로 들어감.
		
		System.out.println(ch);
		System.out.println(Integer.toString(ch)); //문자 -> 숫자로 변환
		
		//ch>='a' -> ch>=97과 같이 표기 가능.
		//?는 예약어 = 정해놓은 문법 기호
		result = (ch >=65) && (ch <=90)? (char)(ch+32) : (ch >= 'a') && (ch <= 'z')? (char)(ch-32):ch;
		
	}

}

// Ascii 아스키 값 (Signal 신호) + 언어(한글,독일어 등등) -> Uni code
// 대문자 + 32 = 소문자 EX) A (65) + 32 = a (97)
//LF = Line left, CF = carriage return -> 13 -> Enter key


