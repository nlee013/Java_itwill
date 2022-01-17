package com.day19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<>();
	public BufferedReader br;
	
	public void serverStart() {
	
		try {
			
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("Server 시작!!");
			
			while(true) {
				
				Socket sc = ss.accept();
				
				//socket을 만들 때마다 thread 생성해야됌
				WorkThread wt = new WorkThread(sc);//sc를 생성자에 넣어주려는 이유는 WorkThread가 필수이기 때문
				wt.start();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Thread를 전담으로 만드는 class
	class WorkThread extends Thread{
		
		//오버로딩 생성자 만들기
		private Socket sc;
		
		public WorkThread(Socket sc) {
		
			this.sc = sc;
		}
		
		@Override
		public void run() {
			
		//client값을 받아낼 것이다
			String ip = null;
			String msg = null;
			
			try {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				
				//누가 했는지 알아야되므로 ip
				ip = sc.getInetAddress().getHostAddress();
				
				//접속한 socket
				clients.add(sc);
				
				//다른 client에게 나를 제외한 사용자가 접속한 사실을 알림
				msg = ip + "]가 입장했습니다.";
				
				for(Socket s : clients) {
					//client를 모아둔 socket
					
					//꺼낸 s가 나이면 이번만 pass(찍지말아라.보내지말아라)
					if(s == sc)
						continue;
					
					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					//마지막 데이터도 강제로 내보낼 수 있는 애가 true (flush와 똑같은 역할)
					pw.println(msg);
					
				}
				System.out.println(msg);//서버에 보임
				
				while((msg = br.readLine()) != null) {
					
					for(Socket s : clients) {
						//client를 모아둔 socket
						
						//꺼낸 s가 나이면 이번만 pass(찍지말아라.보내지말아라)
						if(s == sc)
							continue;
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					
					System.out.println(msg);//서버에 보임
				}
				
			} catch (Exception e) {

				//연결이 끊길 경우
				msg = ip + "]가 퇴장했습니다.";
				
				try {
					//나를 제외한 다른 사용자에게 메세지 보내기
					
					for(Socket s : clients) {
						//client를 모아둔 socket
						
						//꺼낸 s가 나이면 이번만 pass(찍지말아라.보내지말아라)
						if(s == sc)
							continue;
						
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
						
					}
					System.out.println(msg);//서버에 보임
					sc = null; //초기화로 청소
					
				} catch (Exception e2) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {

		new ServerTest2().serverStart();
	}

}
