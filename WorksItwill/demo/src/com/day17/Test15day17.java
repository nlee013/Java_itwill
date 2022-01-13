package com.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//객체의 직렬화:VO에서의 선언한 변수들에 데이터를 저장하는데 VO객체 생성 후 메모리에 넣어야되는데..
//-> 아래설명 읽기
//메모리에 생성된 class 객체의 instance 변수의 현재 상태를
//그대로 file에 저장 하거나 network를 통해서 전달 가능한 기능
//오직 byte단위로만 data를 송수신 가능

//장점)
//객체의 내용을 입출력 형식에 구애 받지 않고
//객체를 파일에 저장하므로써 영속성을 제공할 수 있고
//영속성 -> 데이터를 매번 입력해서 메모리 상에 올리지 않아도 된다는 의미
//객체 자체를 network를 통해 손쉽게 교환 가능하게 된다

//implements Serializable: 직렬화 할 때 필요
//method가 없고 구현만 하면 끝. 알아서 됌
public class Test15day17 {

	public static void main(String[] args) throws Exception {

		//list 써도 됌
		Hashtable<String, String> h = new Hashtable<>();
		//hashtable은 map,Serializable라는 interface 이미 구현해서 따로 시리얼라이즈 필요없음
		h.put("1", "꼼");
		h.put("2", "냥");
		h.put("3", "꼼냥");
		
		//원래 try catch문으로 해야되는데 여기서는 throws Exception사용함
		//직렬화 data: 메모리상에 있는 data
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out6.txt");//직렬화 아님.
		ObjectOutputStream oos = new ObjectOutputStream(fos);//직렬화로 내보내는 기능 있어서 이걸로 감싼다.
		
		oos.writeObject(h);
		oos.close();
		fos.close();
		
		System.out.println("직렬화 data 저장 성공..!");
		
		

	}

}
