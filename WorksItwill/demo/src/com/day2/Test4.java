package com.day2;

import java.io.BufferedReader; // c언어에서  include와 같음
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//ctrl + space하면 자동으로 위에 import됨
		
		/*
		 * System.in = 키보드로 입력한 1byte의 문자
		 * (알파벳 한글자, 특수기호, 숫자 한 자리를 의미)
		 * 한글은 2byte
		 * 
		 * InputStreamReader = System.in로 읽은 1byte를 문자(2byte)로 변경
		 * BufferedReader = 메모리상에 저장 공간 생성함.
		 * 그 저장 공간의 이름을 br로 지정함(아래 코드 참조)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r;
		//double r;
	
		double area, length;
		
		System.out.println("Radius?");//radius = 10
		
		r = Integer.parseInt(br.readLine());
		//r = Double.parseDouble(br.readLine());
		//Integer(4 byte) < Double(8 byte)이므로 Double이 Integer를 포함가능하므로 error가 안남
		
		area = r*r*3.14;
		
		
		length = r*3*3.14;
		
		System.out.println("radius:" + r);
		System.out.println("area:"+ area);
		System.out.println("length:" + length);
		
	}

}

