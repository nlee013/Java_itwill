package com.score6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Data {

	//List는 1개만 생성해야됌. 저장할 리스트, 불러올 리스트가 같아야됌
	//private List<DataVO> lists = new ArrayList<DataVO>();
	
	//선언만 하기
	private List<DataVO> lists;
	String str = "d:\\data\\saveData.txt";
	private String path = System.getProperty("user.dir");
	File f = new File(str);
	//private File f = new File(path, "\\data\\score.txt");
	
	public Data() {
		try {
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(f.exists()) {
				
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (ArrayList<DataVO>)ois.readObject();//객체 생성
				
				fis.close();
				ois.close();
			}
		} catch (Exception e) {
			
		}
	}
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		DataVO vo = new DataVO();
		
		System.out.println("Type your name: ");
		vo.setName(sc.next());
		
		System.out.println("Typ your birthday[XXXX-XX-XX]: ");
		vo.setBirth(sc.next());
		
		System.out.println("Type your score: ");
		vo.setScore(sc.nextInt());
		
		if(lists == null) {//만약에 lists == null 한번도 실행 안했을 때
			
			lists = new ArrayList<>();
		}
		
		lists.add(vo);
	}
	
	public void saveData(){
		
		try {
			if(lists != null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				System.out.println("파일 저장 성공!");
			}
		} catch (Exception e) {
			
		}	
	}
	
	public void print(){
		
		Iterator<DataVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			DataVO vo = it.next();
			System.out.println(vo.toString());
		
		}
	}
}
