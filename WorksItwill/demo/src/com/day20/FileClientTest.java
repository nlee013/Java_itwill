package com.day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientTest {

	public static void main(String[] args) {

		int port = 7777;
		String host = "192.168.16.15";//192.168.16.4
		Socket sc = null;
		
		ObjectOutputStream oos = null;
		
		Scanner scn = new Scanner(System.in);
		
		String filePath;
		
		try {
			
			System.out.print("전송할 파일 경로 및 파일 명? :");//d:\\doc\\test.txt;
			filePath = scn.next();
			
			File f = new File(filePath);
			
			if(!f.exists()) {
				
				System.out.println("파일이 없습니다!");
				System.exit(0);
			}
			
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			//내보낼 때 마다 쓰기(안써도 무관)
			oos.flush();
			
			FileInfo info;
			
			//파일 전송 시작
			info = new FileInfo();//class니까 객체 생성
			info.setCode(100);//파일 전송 시작(파일 이름)
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일 전송 시작...");
			
			Thread.sleep(30);//30 데이터 보낼 때 0.3초
			
			//파일 내용 전송하려면 파일을 읽어내야됌
			FileInputStream fis = new FileInputStream(f);
			int data = 0;
			byte[] buffer = new byte[1024];//FileInfo에서 1024로 지정한 만큼
			
			while((data = fis.read(buffer, 0, 1024)) != -1) {
				
				info = new FileInfo();
				
				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(data + "Bytes 전송 중...");
				
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}//end..while
			fis.close();
			
			//파일 전송 종료 부분은 파일전송 시작 부분이랑 같은 패턴
			info = new FileInfo();//class니까 객체 생성
			info.setCode(200);//파일 전송 종료(파일 이름)
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일 전송 끝...");
			
			Thread.sleep(30);//30 데이터 보낼 때 0.3초
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());//Error처리
		}
		
	}

}
