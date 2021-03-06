package com.day20;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

//2.만든 클래스를 전송하기

public class FileServerTest {

	class WorkThread extends Thread{
		
		private Socket sc = null;
		
		public WorkThread(Socket sc) {
			
			this.sc = sc;
		}
		
		@Override
		public void run() {
			
			try {
				
				//Server의 입장.직렬화
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
				System.out.println(sc.getInetAddress().getAddress() + "접속...");
				
				//File로 만들기
				FileOutputStream fos = null;
				Object ob = null;
				
				while((ob = ois.readObject()) != null) {
					
					if(ob instanceof FileInfo) {//넘어온 ob가 fileinfo에 속했는가?
						
						FileInfo info = (FileInfo) ob;//선언만 해놨음
						
						if(info.getCode() == 100) {
							
							//데이터를 받아와서 문자화 시키기
							String str = new String(info.getData());
							fos = new FileOutputStream(str);//파일 생성
							System.out.println(str + "파일 전송 시작...");//파일명
							
						}else if(info.getCode() == 200) {
							
						}else if(info.getCode() == 100) {//파일 전송 시작
							
						}else if(info.getCode() == 110) {//파일 전송
							
							if(fos == null)
								break;
							fos.write(info.getData(), 0, info.getSize());
							System.out.println(info.getSize() + "Byte 받는 중!!!");
							
						}else if(info.getCode() == 200) {//파일 전송 끝
							
							if(fos == null)
								break;
							
							//파일명이 넘어온다
							String str = new String(info.getData());
							
							fos.close();//파일 마무리
							System.out.println(str + "파일 전송 끝!!!");
							break;
						}
						
						
					}//end..first if
					
				}//end..while
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
	}
	
	public void serverStart() {
		
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("Client 접속 대기중...");
			
			Socket sc = ss.accept();
			
			WorkThread wt = new WorkThread(sc);
			wt.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {

		new FileServerTest().serverStart();
	}

}
