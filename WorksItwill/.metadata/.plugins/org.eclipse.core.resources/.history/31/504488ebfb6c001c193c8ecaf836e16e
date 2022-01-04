package com.day10;

//가장 기본적인 method 공부하기

public class Test52 {

	public static void main(String[] args) {

		String s1 = "Seoul, Busan, Degu";
		String[] ss = s1.split(",");
		//배열 : new 하거나 {,,,};방법이 있었다
		
		for(String s : ss) 
			//System.err.print(s + " ");//-> 빨간색 글씨로 출력.아마도 error 정보 출력인듯
			System.out.print(s + " ");
			
			String s2 = "seoul";
			String s3 = "Seoul";
			System.out.println(s2.equals(s3));//false
			System.out.println(s2.equalsIgnoreCase(s3));//true
			//IgnoreCase>대소문자를 비교하지말고 비교해라
			
			String s4 = "abc.def.hij";//index번호로 입력값이 넣어짐
			//			 01234567890
			System.out.println(s4.indexOf("."));//3 -> 점이 들어간 index 값을 찾아와라
			System.out.println(s4.lastIndexOf("."));//7 -> 마지막에 점이 들어간 index 값을 찾아와라
			System.out.println(s4.indexOf("def"));// 4
			System.out.println(s4.indexOf("x"));//-1 ->이전 값의 index 값을 찾아옴
			
			String s5 = "우리나라 대한민국 좋은나라 대한민국";
			String s6 = s5.replaceAll("대한", "大韓");
			//-> 왼쪽 문자를 오른쪽 문자로 바꿔주는 replaceAll 나중에 많이 쓰임
			System.out.println(s6);
			
			String s7 = "  a b c  ";//양 쪽 공간에 띄어쓰기 2칸한 상태
			System.out.println(s7);
			System.out.println(s7.trim());//trim은 양쪽 공간을 없애줌
			System.out.println(s7.replaceAll(" ", ""));//-> 공백을 null값으로 만들어줘라
			System.out.println(s7.replaceAll("\\s", ""));// \\s -> 공백 이라는 뜻.정규화 표현식
	
			char ch = "abcdefg".charAt(2); 
			System.out.println(ch);//c ->index번호 2번째
			
			System.out.println("abcdefg".length());//7 -> 나열된 문자 수 7개
			
			String s8 = "abcdefg";
			String s9 = "abceefg";
			
			//사전식 정렬
			System.out.println(s8.compareTo(s9));//-1
			System.out.println(s9.compareTo(s8));//1
	}

}
