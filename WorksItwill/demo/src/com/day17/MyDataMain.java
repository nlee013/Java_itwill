package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception{

		FileOutputStream fos = new FileOutputStream("d:\\doc\\data.txt");
		
		//직렬화 데이터를 내보내지 못해서 아래코드로(감싸기) 사용
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new MyDataVO("nayoung", 25));
		oos.writeObject(new MyDataVO("yulgon", 27));
		oos.writeObject(new MyDataVO("hyemin", 27));
		oos.writeObject(new MyDataVO("jongwon", 27));
		
		oos.close();
		fos.close();//직렬화 끝
		System.out.println("직렬화 성공!\n");
	
		//역직렬화//먼저 fis 만들어야 사용가능하므로 이 순서대로 작성한다.
		FileInputStream fis = new FileInputStream("d:\\doc\\data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyDataVO ob = null;//밖에 만든 이유: 데이터를 공용으로 사용하기 위해서
		
		try {
			
			while(true) {
				
				ob = (MyDataVO)ois.readObject();//MyDataVO로 형변환 -> downCast
				
				if(ob == null) {
					break;
				}
				System.out.println(ob.toString());
			}
			
		} catch (Exception e) {
			
		}
		ois.close();
		fis.close();
		//list는 iterator로 꺼내면 됨
	}

}
