package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test13day17 {

	public static void main(String[] args) {

		String str = "d:\\doc\\temp\\java1\\itwill.txt";
		
		//1번 방법
		/*String path = str.substring(0, str.lastIndexOf("\\"));//뒤에서부터 \\을 찾아서 path에 들어감
		//System.out.println(path);//확인
		
		//자주쓴다!!***경로를 찾아서 입력한다.
		File f = new File(path);
		
		if(!f.exists()) {
		
			f.mkdirs();//make directory
		}
		*/
		
		//2번 방법
		File f = new File(str);//경로를 다 줌
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();//d:\\doc\\temp\\java1까지 만들어라
		}
		
		//공통
		try {
			
			FileOutputStream fos = new FileOutputStream(str);
			
			int data;
			System.out.println("Type characters: ");
			
			while((data = System.in.read()) != -1) {
				
				fos.write(data);
				fos.flush();
			}
			fos.close();
			System.out.println("입력 성공!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
