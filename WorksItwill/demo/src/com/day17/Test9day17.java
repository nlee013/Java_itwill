package com.day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9day17 {

	public static void main(String[] args) {

		try {
		FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
		
		//이제 system.in(사용자가 입력한 값)이 아닌 파일(읽어올 파일)fis을 넣기
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		String str;
		
		//숫자는 -1.문자는 null(data가 있을 때까지 실행해라)
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fis.close();
		}catch (Exception e) {
			
		}
	}

}
