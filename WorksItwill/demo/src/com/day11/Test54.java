package com.day11;

// Wrapper class : 기본 자료형을 객체 class로 사용가능하게 함
// 일반적으로 자료형: boolean, byte, char, short(정수), int, long, float, double
// 위 자료형 8개를 똑같이 wrapper class로 만들어져있음
// Wrapper Class -> Boolean, Byte, Character, Short, Integer, Long, Float, Double

// 용어 공부하기
// Auto-Boxing: 자료형이 wrapper class로 변환되는 것
// ->stack 영역의 data가 heap영역으로 잘 넘어가 처리됨

// Auto-unBoxing: (반대임) wrapper class가 자료형으로 변환되는 것
// -> heap영역의 data가 stack 영역으로 잘 넘어가 처리됨

public class Test54 {
	
	public static void main(String[] args) {

		int n1 = 10;
		int n2; //초기값 x
		
		Integer num1; //선언만 하기 <- null값 들어가있음
		Integer num2 = new Integer(20);//객체 생성
		
		num1 = n1;//Auto-Boxing
		n2 = num2;//Auto-unBoxing
		
		System.out.println(n1 + ":" + n2);
		System.out.println(n2 + ":" + num2);
		
		int a = 24;//자료형
		System.out.println(a);//24-> 숫자
		
		//24를 다른 명령어를 통해 바꾸고 싶다 -> class 도움 받기
		
		System.out.println(Integer.toString(a)+10);//똑같이 24가 출력되지만 문자 String 24가 출력
		//연산이 안됨 -> 2410처럼 붙여서나옴
		
		System.out.println(Integer.toString(a, 2));//11000 -> 24의 2진수
		System.out.println(Integer.toString(a, 16));//18 -> 16진수
		
		//Integer, Double, Float을 가장 많이 사용함
	}
}

/*번외
 * 
 *<자료형의 관계>
 *
 * int i = 10;
 * float f; 
 * 
 * f = i; //O ->암시적 형 변환 //10.0
 * i = f; //X
 * i = (int)f; //O ->명시적 형 변환 //10
 * 
 * -----------------------------------------
 * 부모(f)와 자식(i) 관계인 상속에서 형 변환
 * 
 * 부모(f) = 자식(i); //O -> UpCast 자식이 올린다 //UpCast ->나중에 java의 모든 것을 관리함
 * 자식(i) = 부모(f); //X
 * 자식(i) = (자식 i)부모(f); //자식으로 형변환해서 들어감 O -> DownCast
 * UpCast, DownCast -> 나중에 Object와 연관이 있음을 배울 예정.
 */
