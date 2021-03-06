package com.day17;

import java.io.File;
import java.io.FileFilter;

//FileFilter

class MyFilterList implements FileFilter{

	private File f;//f->필수 조건 : MyFilterList을 움직이게 하는 필수값
	
	//생성자 만든 후, String filePath라는 경로를 준다.
	//객체를 또 생성 후 파일을 넘겨줌
	public MyFilterList(String filePath) {//Spring에서 의존성 머시기?이다
		
		f = new File(filePath);
	}
	
	//내가 그냥 만드는 method
	public void result() {
		
		try {
			if(!f.exists()) {
				System.out.println("File is not exist.");
				return;//더 이상 실행하지 마라
			}
			System.out.println("절대 경로: " + f.getAbsolutePath());
			System.out.println("File size: " + f.length());
			
			//사용자의 directory를 보여달라
			String p = System.getProperty("user.dir");//System.getProperty 시스템의 환경설정을 읽어온다
			System.out.println("현재 프로젝트 경로: " + p);
			
			//폴더
			if(f.isDirectory()) {//dir이 있으면
				
				//파일 폴더구조:파일에 대한 정보를 this에 불러오면
				//File[] lists라는 배열에 집어넣는다
				File[] lists = f.listFiles(this);//accept
				System.out.println("폴더의 내용...");
				
				for(int i = 0; i < lists.length; i++) {
					
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			//각 파티션 이름 -> C:,D:와 같은 드라이브 명 출력
			System.out.println("Eaxh partion name...");
			File[] root = File.listRoots();
			
			for(int i = 0; i < root.length; i++) {
				System.out.println(root[i].getPath());
			}
		} catch (Exception e) {
			
		}
	}
	
	@Override
	public boolean accept(File pathname) {//사용자가 지정한 드라이브와 파일을 리턴값으로 반환?
		
		//File pathname -> 파일에 있는 정보를 보는 것
		return pathname.isFile() || pathname.isDirectory();//isDirectory(); -> 폴더만 보는 것
	}	//interface로 지정했으니 무조건 override 해야됨
}

public class Test14day17 {

	public static void main(String[] args) {

		MyFilterList m = new MyFilterList("d:\\doc");
		MyFilterList m2 = new MyFilterList("c:\\windows");//숨긴 파일도 다 보여줌
		
		m.result();
		m2.result();
	}
}
