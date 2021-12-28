package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//밑변 width 높이 height를 입력받아 삼각형 넓이 area 구하기
		//밑변? 17
		//높이? 22
		//넓이? 
		//넓이 = 밑변 x 높이/2
		
		//int width, height, area;
		double width, height, area;
		//float f;
		
		System.out.print("Width?:"); //10
		//width = Integer.parseInt(br.readLine());
		width = Double.parseDouble(br.readLine());
		
		System.out.print("Height?:"); //22
		//height = Integer.parseInt(br.readLine());
		height = Double.parseDouble(br.readLine());
		
		System.out.println("Area:" + width*height/2);
		area = Double.parseDouble(br.readLine());
		
		//f = Float.parseFloat(br.readLine());
		
		//위의 코드가 다른 방식으로는 아래 코드 참조.
		//area = width*height/2;<- int일때 area = width*height/2.0; <- double
		//System.out.println("Area:" + area);

		System.out.printf("area: %g", area);
	}

}
