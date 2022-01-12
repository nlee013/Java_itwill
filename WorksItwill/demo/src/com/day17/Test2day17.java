package com.day17;

import java.io.IOException;
import java.io.OutputStream;

//원초적인 Stream은 1byte씩 데이터를 내보냄
//가장 기본적인 Stream: In(1byte) data 받기, Out(1byte) data 내보내기
public class Test2day17 {

	public static void main(String[] args) throws IOException {

		OutputStream os = System.out;
		
		byte[] b = new byte[3];//1byte의 저장공간 3개 만듦 -> Buffer
		
		//아스키값
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		//input output의 error는 대부분 IOException 처리하면 됨
		os.write(b);//한번에 (위에 만든 배열구조를 통체로)내보내는 것
		
		System.out.println("Heyyy![1]");
		
		os.close();//data가 나간 뒤 닫아줌(output Stream을 닫음)
		
		System.out.println("Heyyy![2]");//close()때문에 출력안됨
	}

}
