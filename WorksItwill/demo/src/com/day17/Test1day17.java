package com.day17;

import java.io.IOException;

//Stream:일종의 Pipe Line
//->Data 입출력시, 모든 data를 형태와 관계없이 일련된 흐름으로 전송하는 것
//한 쪽방향에서 한쪽으로 데이터에 보내는데 데이터에 따라서 stream종류가 여러가지다

//java에서 가장 기본 Stream : in->사용자가 입력한 값을 읽어온다
public class Test1day17 {

	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("Type characters:");//adhkl0001
		//try catch문으로 해도 됨.여기서는 throws IOException로 처리.
		while((data = System.in.read()) != -1) {// -> 사용자가 입력한 값을 읽어온다.
												// 2byte 한글자 읽어오기
			
			char ch = (char)data;
			System.out.print(ch);
		}
	}

}
