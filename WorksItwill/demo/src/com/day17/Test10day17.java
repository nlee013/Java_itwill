package com.day17;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10day17 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out4.txt");
			
			//PrintStream(내보내는 stream)로 감싼다(덮어씌운다)->이 기능을 더 사용하려고 쓰는 것
			//PrintStream의 기능:test11day17
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Type characters: ");
			
			String str;
			
			while((str = br.readLine()) != null) {
				
				ps.println(str);
			}
			ps.close();
			fos.close();
			System.out.println("입력 성공!");
			
		} catch (Exception e) {
			
		}
	}

}
