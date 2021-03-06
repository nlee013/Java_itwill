package com.day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test16day17 {

	public static void main(String[] args) throws Exception {

		//역 직렬화
		FileInputStream fis = new FileInputStream("d:\\doc\\out6.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hashtable<String, String> h = (Hashtable<String, String>)ois.readObject();//downcast해서 h에 넣어줌
		
		Iterator<String> it = h.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + ":" + value);
		}
		ois.close();
		fis.close();
				
	}

}
