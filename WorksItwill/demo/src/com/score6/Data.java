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

	//List�� 1���� �����ؾ߉�. ������ ����Ʈ, �ҷ��� ����Ʈ�� ���ƾ߉�
	//private List<DataVO> lists = new ArrayList<DataVO>();
	
	//���� �ϱ�
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
				
				lists = (ArrayList<DataVO>)ois.readObject();//��ü ����
				
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
		
		if(lists == null) {//���࿡ lists == null �ѹ��� ���� ������ ��
			
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
				System.out.println("���� ���� ����!");
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