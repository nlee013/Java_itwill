package com.day10;
//StringBuffer : 동기화를 지원하는 애
//StringBuilder : 동기화를 지원하지 않는 애
//동기화를 지원하는 애는 동기화를 지원하지 않는 애보다 더딘다(좀 더 걸린다)

public class Test51 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();//주소번지에 저장된 data를 보여줌
		
		sb.append("Seoul");
		sb.append("Busan");
		
		System.out.println(sb);
		
		String str = sb.toString();//to String은 string으로 바꿔라 라는 의미
		System.out.println(str);//쓰레기값이 생기지 않는다
		
		
	}

}
