package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

//PrintStream의 기능:test11day17

public class Test11day17 {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out5.txt");
			PrintStream ps = new PrintStream(fos);
			
			ps.println("꼼");
			ps.println("냥");
			ps.println("꼼냥");
			
			ps.close();
			fos.close();

			//fos = new FileOutputStream("d:\\doc\\out5.txt");
			fos = new FileOutputStream("d:\\doc\\out5.txt", true);//true는 누적해라//문자열 누적은 append
			ps = new PrintStream(fos);//FileOutputStream는 PrintStream과 자주사용
			
			ps.println("꼬미");
			ps.println("듕이");
			ps.println("꼼 듕");

			ps.close();
			fos.close();
		} catch (Exception e) {
			
		}
	}

}
